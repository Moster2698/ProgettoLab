grammar Imp;
import ArnoldC;
prog : (fun)* com EOF ;
fun : FUN ID LPAR (ID (COMMA ID)*)* RPAR LBRACE (com SEMICOLON)? RETURN exp RBRACE
    ;
com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | GLOBAL ID ASSIGN exp                                              # globalAssign
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
ID : [a-z]+[0-9]*;

WS : [ \t\r\n]+ -> skip ;


