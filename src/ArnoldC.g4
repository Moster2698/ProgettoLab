grammar ArnoldC;

program             : arnoldIni;

arnoldIni           : STARTMAIN arnoldCom* ENDMAIN;

arnoldCom           : IF expression arnoldCom ELSE arnoldCom ENDIF                                                         # arnoldIfElse
                    | IF expression arnoldCom ENDIF                                                                        # arnoldIf
                    | WHILE expression arnoldCom+ ENDWHILE                                                                  # arnoldWhile
                    | PRINT expression                                                                                     # arnoldPrintExp
                    | ASSIGNVARIABLE ID SETVALUE expression+ ENDASSIGNVARIABLE                                             # arnoldAssign
                    | DECLARE ID SETINITIALVALUE expression                                                                # arnoldDeclare
                    ;

expression          : ID                                # arnoldIdexpr
                    | STRING                            # arnoldString
                    | FLOAT                             # arnoldNumberexpr
                    | AT BOOL                           # arnoldBoolExp
                    | PLUSOPERATOR expression           # arnoldPlus
                    | MINUSOPERATOR expression          # arnoldMinus
                    | MULTIPLICATIONOPERATOR expression # arnoldMultiplication
                    | DIVISIONOPERATOR expression       # arnoldDivision
                    | EQUALTO expression                # arnoldEqual
                    | GREATERTHAN expression            # arnoldGreater
                    | OR expression                     # arnoldOr
                    | AND expression                    # arnoldAnd
                    ;

STARTMAIN           : 'IT\'S SHOWTIME';

ENDMAIN             : 'YOU HAVE BEEN TERMINATED';

AT                  : '@';

BOOL                : TRUE
                    | FALSE
                    ;

TRUE                : 'NO PROBLEMO';

FALSE               : 'I LIED';

PLUSOPERATOR        : 'GET UP';

MINUSOPERATOR       : 'GET DOWN';

MULTIPLICATIONOPERATOR  : 'YOU\'RE FIRED';

DIVISIONOPERATOR        : 'HE HAD TO SPLIT';

EQUALTO                 : 'YOU ARE NOT YOU YOU ARE ME';

GREATERTHAN
    : 'LET OFF SOME STEAM BENNET'
    ;

OR
    : 'CONSIDER THAT A DIVORCE'
    ;

AND
    : 'KNOCK KNOCK'
    ;

PRINT
    : 'TALK TO THE HAND'
    ;

DECLARE
    : 'HEY CHRISTMAS TREE'
    ;

SETINITIALVALUE
    : 'YOU SET US UP'
    ;

ASSIGNVARIABLE
    : 'GET TO THE CHOPPER'
    ;

SETVALUE
    : 'HERE IS MY INVITATION'
    ;

ENDASSIGNVARIABLE
    : 'ENOUGH TALK'
    ;

IF
    : 'BECAUSE I\'M GOING TO SAY PLEASE'
    ;

ELSE
    : 'BULLSHIT'
    ;

ENDIF
    : 'YOU HAVE NO RESPECT FOR LOGIC'
    ;

WHILE
    : 'STICK AROUND'
    ;

ENDWHILE
    : 'CHILL'
    ;

ID  : [a-zA-Z]+[0-9]*[a-zA-Z]*
    ;

WS  : [ \r\n\t]+ -> channel(HIDDEN)
    ;

STRING : '"' STRCHAR* '"';

fragment STRCHAR : ~["\\] | ESC;
fragment ESC : '\\' [btnfr"'\\];

FLOAT                : INT   |   (INT | '-''0')'.'DIGIT+   ;
fragment INT         :NAT    |   '-'POS;
fragment NAT         :'0'    |   POS;
fragment POS         :POSDIGIT DIGIT*;
fragment DIGIT       :   '0' |   POSDIGIT;
fragment POSDIGIT    :   [1-9];