lexer grammar TryCatchLexer;

LEFT_OVAL_BRACKET:             '(';
RIGHT_OVAL_BRACKET:             ')';
LEFT_CURLY_BRACKET:             '{';
RIGHT_CURLY_BRACKET:             '}';
DOT:                '.';
BIT_OR:              '|';
SEMICOLON:               ';';
ASSIGN:             '=';

VAR:                'var';
NEW:                'new';

TRY:                'try';
CATCH:              'catch';
FINALLY:            'finally';


IDENTIFIER: Letter LetterOrDigit*;
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);

fragment LetterOrDigit
    : Letter
    | [0-9]
    ;

fragment Letter
    : [a-zA-Z$_]
    | ~[\u0000-\u007F\uD800-\uDBFF]
    | [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;
