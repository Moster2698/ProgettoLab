grammar HaveFunAndArnoldC;

program             : (fun)* globalEnv*  com EOF
                    ;
arnoldIni           : ARNOLDSTARTMAIN arnoldCom* ARNOLDENDMAIN
                    ;
globalEnv           : GLOBAL ID ASSIGN exp SEMICOLON                                                            # globalAssignValue
                    ;
arnoldCom           : ARNOLDIF operand arnoldCom ARNOLDELSE arnoldCom ARNOLDENDIF                               # arnoldIfElseCheck
                    | ARNOLDIF operand arnoldCom ARNOLDENDIF                                                    # arnoldIfCheck
                    | ARNOLDWHILE operand arnoldCom+ ARNOLDENDWHILE                                             # arnoldWhileCycle
                    | ARNOLDPRINT (STRING | ID)                                                                 # arnoldPrintExpression
                    | ARNOLDASSIGNVARIABLE ID ARNOLDSETVALUE operand arnoldOperations+ ARNOLDENDASSIGNVARIABLE  # arnoldAssignValue
                    | ARNOLDDECLARE ID ARNOLDSETINITIALVALUE operand                                            # arnoldDeclareVariable
                    ;

arnoldOperations    : arnoldOperation=(
                        ARNOLDPLUSOPERATOR
                       | ARNOLDMINUSOPERATOR
                       | ARNOLDMULTIPLICATIONOPERATOR
                       | ARNOLDDIVISIONOPERATOR
                       | ARNOLDEQUALTO
                       | ARNOLDGREATERTHAN
                       | ARNOLDOR
                       | ARNOLDAND) operand                    # arnoldOp
                       ;


operand             : ID                                # arnoldIdExp
                    | STRING                            # arnoldStringExp
                    | ARNOLDFLOAT                       # arnoldNumberExp
                    | ARNOLDAT ARNOLDBOOL               # arnoldBoolExp
                    ;
ARNOLDSTARTMAIN               : 'IT\'S SHOWTIME';

ARNOLDENDMAIN                 : 'YOU HAVE BEEN TERMINATED';

ARNOLDAT                      : '@';

ARNOLDBOOL                    : ARNOLDTRUE | ARNOLDFALSE ;

ARNOLDTRUE                    : 'NO PROBLEMO';

ARNOLDFALSE                   : 'I LIED';

ARNOLDPLUSOPERATOR            : 'GET UP';

ARNOLDMINUSOPERATOR           : 'GET DOWN';

ARNOLDMULTIPLICATIONOPERATOR  : 'YOU\'RE FIRED';

ARNOLDDIVISIONOPERATOR        : 'HE HAD TO SPLIT';

ARNOLDEQUALTO                 : 'YOU ARE NOT YOU YOU ARE ME';

ARNOLDGREATERTHAN             : 'LET OFF SOME STEAM BENNET';

ARNOLDOR                      : 'CONSIDER THAT A DIVORCE' ;

ARNOLDAND                     : 'KNOCK KNOCK' ;

ARNOLDPRINT                   : 'TALK TO THE HAND' ;

ARNOLDDECLARE                 : 'HEY CHRISTMAS TREE' ;

ARNOLDSETINITIALVALUE         : 'YOU SET US UP' ;

ARNOLDASSIGNVARIABLE          : 'GET TO THE CHOPPER' ;

ARNOLDSETVALUE                : 'HERE IS MY INVITATION' ;

ARNOLDENDASSIGNVARIABLE       : 'ENOUGH TALK' ;

ARNOLDIF                      : 'BECAUSE I\'M GOING TO SAY PLEASE' ;

ARNOLDELSE                    : 'BULLSHIT' ;

ARNOLDENDIF                   : 'YOU HAVE NO RESPECT FOR LOGIC' ;

ARNOLDWHILE                   : 'STICK AROUND' ;

ARNOLDENDWHILE                : 'CHILL' ;

/*fun section*/
fun : FUN ID LPAR (ID (COMMA ID)*)* RPAR LBRACE (com SEMICOLON)? RETURN exp RBRACE
    ;
com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | ID DOTG ASSIGN exp                                                # varGlobalAssign
    | SKIPP                                                             # skip
    | com SEMICOLON com                                                 # seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | OUT LPAR exp RPAR                                                 # out
    | LBRACE com RBRACE  ND LBRACE com RBRACE                           # nd
    | DOLLAR LBRACE arnoldIni RBRACE DOLLAR                             # arnoldInit
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | ID LPAR (exp (COMMA exp)*)? RPAR    # function
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID                                  # id
    | ID DOTG                             # globalID
    ;



NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;

AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;
FUN    : 'fun';
RETURN    : 'return';
GLOBAL : 'global';

LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
COMMA     : ',';
SEMICOLON : ';' ;
DOTG      : '.g';
ND        : 'nd';
DOLLAR    : '$';


ID  : [a-zA-Z0-9]+;
WS : [ \t\r\n]+ -> skip ;
STRING : '"' STRCHAR* '"';

/*fragments section*/
fragment STRCHAR : ~["\\] | ESC;
fragment ESC : '\\' [btnfr"'\\];

ARNOLDFLOAT                : ARNOLDINT  |   (ARNOLDINT | '-''0')'.'ARNOLDDIGIT+   ;
fragment ARNOLDINT         : ARNOLDNAT  |   '-'ARNOLDPOS;
fragment ARNOLDNAT         : '0'        |   ARNOLDPOS;
fragment ARNOLDPOS         : ARNOLDPOSDIGIT ARNOLDDIGIT*;
fragment ARNOLDDIGIT       : '0'        |   ARNOLDPOSDIGIT;
fragment ARNOLDPOSDIGIT    : [1-9];


