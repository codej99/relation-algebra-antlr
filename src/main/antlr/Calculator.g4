grammar Calculator;

expression
:
    expression op=(MUL | DIV) expression #mulDiv
    | expression op=(ADD | SUB) expression #addSub
    | number #num
    | '(' expression ')' #parens
;

MUL
:
    '*'
;

DIV
:
    '/'
;

ADD
:
    '+'
;

SUB
:
    '-'
;

number
:
    NUMBER
;

NUMBER
:
    [0-9]+
;