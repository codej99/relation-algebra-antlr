grammar Ra;

expr :
    intersection
    | union
    | setDifference
    | naturalJoin
    | leftJoin
    | rightJoin
    | catesianProduct
    | selection
    | projection
    | rename
    | relation
;

intersection :
    '('expr')' INTERSECTION '('expr')'
;

union :
    '('expr')' UNION '('expr')'
;

setDifference :
    '('expr')' DIFFERENCE '('expr')'
;

naturalJoin :
    '('expr')' NATURAL_JOIN condition? '('expr')'
;

leftJoin :
    '('expr')' LEFT_JOIN condition '('expr')'
;

rightJoin :
    '('expr')' RIGHT_JOIN condition '('expr')'
;

catesianProduct :
    '('expr')' (CARTESIAN '('expr')')+
;

selection :
    SELECTION conditions '('expr')'
;

projection :
    PROJECTION attributes '('expr')'
    | PROJECTION attributes expr
;

rename :
    RENAME STRING '('expr')'
    | RENAME renameAttr (',' renameAttr)+ '('expr')'
    | RENAME renameAttr (',' renameAttr)+ '('expr')'
;

relation :
    '('expr')' #nestedRelation
    | STRING #simpleRelation
;

orderby :
    ORDER_BY orders
;

orders :
    order (',' order)+
    | order
;

order :
    attribute direction
;

direction :
    ASC | DESC
;

attributes :
    attribute
    | attribute (',' attribute)+
;

attribute :
    STRING
    | fullvalue
;

fullvalue :
    STRING '.' STRING
;

renameAttr :
    STRING
    | STRING RENAME_ATTR attribute
;

conditions :
    condition
    | condition logicalOps conditions
//    | NOT conditions
    | '('conditions')'
;

condition :
    compared comp compared
;

logicalOps :
    AND | OR
;

compared :
    attribute | data
;

comp :
    NOT_EQUAL | EQUAL | GREATER_EQUAL | GREATER | LESSER_EQUAL | LESSER
;

data :
    NUMBER | STRING
;

// Lexer Rule
AND:
    A N D
;

OR:
    O R
;

NOT:
    N O T
;

ASC:
    A S C
;

DESC:
    D E S C
;

PROJECTION : 'π';
SELECTION : 'σ';
RENAME : 'ρ';
RENAME_ATTR : '←';

UNION : '∪';
INTERSECTION : '∩';
DIFFERENCE : '-';
CARTESIAN : '⨯';

NATURAL_JOIN : '⨝';
LEFT_JOIN : '⟕';
RIGHT_JOIN : '⟖';
ORDER_BY: 'τ';
GROUP_BY: 'γ';

NOT_EQUAL: '!=';
EQUAL: '=';
GREATER_EQUAL: '>=';
GREATER: '>';
LESSER_EQUAL: '<=';
LESSER: '<';

STRING: [a-zA-Z0-9_']+ ;
NUMBER: [0-9]+ ;

WS
:
	[ \t\r\n]+ -> skip
;

//fragments defined to make the input case-insensitive
fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];