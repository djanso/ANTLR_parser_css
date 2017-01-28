grammar CSS;

options {
    language = Java; 
}

@lexer::header {
package org.antlr.isep.langAndCompil.project.parsers;
}

@parser::header {
package org.antlr.isep.langAndCompil.project.parsers;
}

//lexer rules:
LLETTERS: ( 'a'..'z' );
ULETTERS: ( 'A'..'Z' );
NUMBERS: ( '0'..'9' );
HASH: '#';
COMMA: ',';
SPACE: (' ' | [\t\r\n])* -> skip;
ACCOLADE1: '{';
ACCOLADE2: '}';
POINTS: ':';
POINT: '.';
SEMICOLON: ';';
DASH: '-';

//parser rules:
propertyName: (ULETTERS | LLETTERS)+ | (ULETTERS | LLETTERS )+ (DASH | ULETTERS | LLETTERS)+;
property : propertyName POINTS value SEMICOLON ;
value: (HASH | SPACE*) (ULETTERS | LLETTERS | NUMBERS)+ | (ULETTERS | LLETTERS )+ (DASH | ULETTERS | LLETTERS)+;
selector: ((HASH | POINT) (ULETTERS | LLETTERS | NUMBERS)+) | ((ULETTERS | LLETTERS | NUMBERS)+) | ((ULETTERS | LLETTERS) POINTS (ULETTERS | LLETTERS)+ );
selectors:  selector (COMMA selector)* ;
regle: selectors  ACCOLADE1  property*  ACCOLADE2;
regles : regle+;
