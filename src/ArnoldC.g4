grammar ArnoldC;

program             : arnoldIni;

arnoldIni           : ARNOLDSTARTMAIN arnoldCom* ARNOLDENDMAIN;

arnoldCom           : ARNOLDIF operand arnoldCom ARNOLDELSE arnoldCom ARNOLDENDIF                                      # arnoldIfElse
                    | ARNOLDIF operand arnoldCom ARNOLDENDIF                                                     # arnoldIf
                    | ARNOLDWHILE operand arnoldCom+ ARNOLDENDWHILE                                              # arnoldWhile
                    | ARNOLDPRINT (STRING | ID)                                                            # arnoldPrintExp
                    | ARNOLDASSIGNVARIABLE ID ARNOLDSETVALUE operand operations+ ARNOLDENDASSIGNVARIABLE               # arnoldAssign
                    | ARNOLDDECLARE ID ARNOLDSETINITIALVALUE operand                                             # arnoldDeclare
                    ;

operations          : ARNOLDPLUSOPERATOR operand           # arnoldPlus
                    | ARNOLDMINUSOPERATOR operand          # arnoldMinus
                    | ARNOLDMULTIPLICATIONOPERATOR operand # arnoldMultiplication
                    | ARNOLDDIVISIONOPERATOR operand       # arnoldDivision
                    | ARNOLDEQUALTO operand                # arnoldEqual
                    | ARNOLDGREATERTHAN operand            # arnoldGreater
                    | ARNOLDOR operand                     # arnoldOr
                    | ARNOLDAND operand                    # arnoldAnd
                    ;

operand             : ID                                # arnoldIdexpr
                    | STRING                            # arnoldString
                    | FLOAT                             # arnoldNumberexpr
                    | ARNOLDAT ARNOLDBOOL                           # arnoldBoolExp
                    ;

ARNOLDSTARTMAIN           : 'IT\'S SHOWTIME';

ARNOLDENDMAIN             : 'YOU HAVE BEEN TERMINATED';

ARNOLDAT                  : '@';

ARNOLDBOOL                : ARNOLDTRUE
                          | ARNOLDFALSE
                          ;

ARNOLDTRUE                : 'NO PROBLEMO';

ARNOLDFALSE               : 'I LIED';

ARNOLDPLUSOPERATOR        : 'GET UP';

ARNOLDMINUSOPERATOR       : 'GET DOWN';

ARNOLDMULTIPLICATIONOPERATOR  : 'YOU\'RE FIRED';

ARNOLDDIVISIONOPERATOR        : 'HE HAD TO SPLIT';

ARNOLDEQUALTO                 : 'YOU ARE NOT YOU YOU ARE ME';

ARNOLDGREATERTHAN
    : 'LET OFF SOME STEAM BENNET'
    ;

ARNOLDOR
    : 'CONSIDER THAT A DIVORCE'
    ;

ARNOLDAND
    : 'KNOCK KNOCK'
    ;

ARNOLDPRINT
    : 'TALK TO THE HAND'
    ;

ARNOLDDECLARE
    : 'HEY CHRISTMAS TREE'
    ;

ARNOLDSETINITIALVALUE
    : 'YOU SET US UP'
    ;

ARNOLDASSIGNVARIABLE
    : 'GET TO THE CHOPPER'
    ;

ARNOLDSETVALUE
    : 'HERE IS MY INVITATION'
    ;

ARNOLDENDASSIGNVARIABLE
    : 'ENOUGH TALK'
    ;

ARNOLDIF
    : 'BECAUSE I\'M GOING TO SAY PLEASE'
    ;

ARNOLDELSE
    : 'BULLSHIT'
    ;

ARNOLDENDIF
    : 'YOU HAVE NO RESPECT FOR LOGIC'
    ;

ARNOLDWHILE
    : 'STICK AROUND'
    ;

ARNOLDENDWHILE
    : 'CHILL'
    ;

STRING : '"' STRCHAR* '"';

fragment STRCHAR : ~["\\] | ESC;
fragment ESC : '\\' [btnfr"'\\];

FLOAT                : ARNOLDINT   |   (ARNOLDINT | '-''0')'.'ARNOLDDIGIT+   ;
fragment ARNOLDINT         :ARNOLDNAT    |   '-'ARNOLDPOS;
fragment ARNOLDNAT         :'0'    |   POS;
fragment ARNOLDPOS         :POSDIGIT DIGIT*;
fragment ARNOLDDIGIT       :   '0' |   POSDIGIT;
fragment ARNOLDPOSDIGIT    :   [1-9];


