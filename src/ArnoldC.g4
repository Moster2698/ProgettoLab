grammar ArnoldC;
program
    : arnoldIni;

arnoldIni
    : STARTMAIN coms ENDMAIN
    | STARTMAIN ENDMAIN
    ;

coms: com*;
com:
    IF expression com ELSE com ENDIF                                            # arnoldIFElse
    | IF expression com ENDIF                                                   # arnoldIF
    | WHILE expression com ENDWHILE                                             # arnoldWhile
    | PRINT ID                                                                  # arnoldPrintID
    | PRINT STRING_LITERAL                                                      #arnoldPrintString
    | ASSIGNVARIABLE ID SETVALUE com operations ENDASSIGNVARIABLE               # arnoldAssign
    | DECLARE ID SETINITIALVALUE expression                                     # arnoldDECLARE
    ;
expression
    : ID #varexpr
    | NUMBER     #numberexpr
    | AT TRUE    #trueexpr
    | AT FALSE   #falseexpr
    ;
operations
    : operation | operations operation
    ;

operation
    : PLUSOPERATOR expression           #plusop
    | MINUSOPERATOR expression          #minusop
    | MULTIPLICATIONOPERATOR expression #multiplicationop
    | DIVISIONOPERATOR expression       #divisionop
    | EQUALTO expression                #equalop
    | GREATERTHAN expression            #greaterop
    | OR expression                     #orop
    | AND expression                    #andop
    ;


STARTMAIN
    : 'IT\'S SHOWTIME'
    ;

ENDMAIN
    : 'YOU HAVE BEEN TERMINATED'
    ;

AT
    : '@'
    ;

TRUE
    : 'NO PROBLEMO'
    ;

FALSE
    : 'I LIED'
    ;

PLUSOPERATOR
    : 'GET UP'
    ;

MINUSOPERATOR
    : 'GET DOWN'
    ;

MULTIPLICATIONOPERATOR
    : 'YOU\'RE FIRED'
    ;

DIVISIONOPERATOR
    : 'HE HAD TO SPLIT'
    ;

EQUALTO
    : 'YOU ARE NOT YOU YOU ARE ME'
    ;

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

ID
    : [a-zA-Z]+
    ;

NUMBER
    : DIGIT+
    ;

STRING_LITERAL
 : ( SHORT_STRING | LONG_STRING )
 ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;

/*
 * fragments
 */

fragment DIGIT
    : ('0'..'9')
    ;

fragment SHORT_STRING
 : '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n'] )* '\''
 | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n"] )* '"'
 ;

fragment LONG_STRING
 : '\'\'\'' LONG_STRING_ITEM*? '\'\'\''
 | '"""' LONG_STRING_ITEM*? '"""'
 ;

fragment LONG_STRING_ITEM
 : LONG_STRING_CHAR
 | STRING_ESCAPE_SEQ
 ;

fragment LONG_STRING_CHAR
 : ~'\\'
 ;

fragment STRING_ESCAPE_SEQ
 : '\\' .
 ;