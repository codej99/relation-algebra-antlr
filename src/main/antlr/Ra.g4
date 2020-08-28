grammar Ra;

expr :
    expr INTERSECTION expr #intersection
    | expr UNION expr #union
    | expr DIFFERENCE expr #setDifference
    | expr NATURAL_JOIN condition? expr #naturalJoin
    | expr LEFT_OUTER_JOIN condition expr #leftJoin
    | expr RIGHT_OUTER_JOIN condition expr #rightJoin
    | expr FULL_OUTER_JOIN condition expr #fullJoin
    | expr (CARTESIAN expr)+ #catesianProduct
    | selectionExpr #selection
    | projectionExpr #projection
    | renameExpr #rename
    | orderbyExpr #orderby
    | relationExpr #relation
;

selectionExpr :
    SELECTION conditions expr
;

projectionExpr :
    PROJECTION attributes expr
;

renameExpr :
    RENAME STRING expr // relation rename
    | RENAME renameAttrs expr
;

relationExpr :
    LBRACE expr RBRACE #nestedRelation
    | STRING #simpleRelation
;

orderbyExpr :
    ORDER_BY orders (expr)?
;

orders :
    order (COMMA order)*
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
    | attribute COMMA attributes
;

attribute :
    STRING
    | fullvalue
;

fullvalue :
    STRING PERIOD STRING
;

renameAttrs :
    renameAttr
    | renameAttr COMMA renameAttrs
;

renameAttr :
    STRING
    | STRING RENAME_ATTR attribute
;

conditions :
    condition
    | condition logicalOps conditions
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
LEFT_OUTER_JOIN : '⟕';
RIGHT_OUTER_JOIN : '⟖';
FULL_OUTER_JOIN : '⟗';

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

PERIOD: '.';
COMMA: ',';
LBRACE: '(';
RBRACE: ')';

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