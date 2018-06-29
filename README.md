# BrainFuck
A simple BrainFuck Interpreter Built in Java

Brainfuck is a so-called esoteric programming language, meaning it's "intentionally unusual" (Chris Pressey). Brainfuck was invented by Urban Müller, whose goal was to create the smallest possible compiler.

Brainfuck only has 8 operators that are all written as a single character, but despite its restrictiveness, any program that can be written in pure C can be written in brainfuck too.

The 8 operators are: +-<>[].,
* { + } increase byte under pointer
* { - } decrease byte under pointer
* { > } increase pointer
* { < } decrease pointer
* { [ } start a loop if byte under pointer is not 0
* { ] } return to matching [
* { . } print byte under pointer to standard output (often screen)
* { , } read input from standard input (often keyboard) to byte under pointer
