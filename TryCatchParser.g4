parser grammar TryCatchParser;

options { tokenVocab=TryCatchLexer; }

block
    : '{' tryStatement* '}'
    ;

identifier
    : IDENTIFIER
    ;

tryStatement
	:	'try' block catchBlock+
	|	'try' block catchBlock* finallyBlock
	|	'try' resourceSpecification block catchBlock+
	|   'try' resourceSpecification block catchBlock* finallyBlock
	;

catchBlock
    : 'catch' '(' catchClassTypes identifier ')' block
    ;

catchClassTypes
    : className ('|' className)*
    ;

finallyBlock
    : 'finally' block
    ;

resourceSpecification
    : '(' resource ')'
    ;

resource
    : 'var' identifier '=' dummyClassInitialization
    | identifier
    ;

className
    : identifier
    | 'var'
    ;

dummyClassInitialization : 'new' className '(' ')';