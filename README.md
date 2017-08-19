[![Build Status](https://travis-ci.org/MickaelAlvarez/MathRepresentationToObject.svg?branch=master)](https://travis-ci.org/MickaelAlvarez/MathRepresentationToObject)
# MathRepresentationToObject
This project is a library developed for java object developers. It provide a way to easily manipulate infix mathematical equations.

## How does it work ?
MathRepresentationToObject is based on the [InfixToObject](https://github.com/MickaelAlvarez/InfixToObject) project. It give a way to convert a List of IElementRepresentation into an IEquation, in two steps. First, it transform the infix expression into a prefixed one. Next, it recursively construct the IEqation.

To apply the first step, the [InfixToObject](https://github.com/MickaelAlvarez/InfixToObject) project need to know three things :
* The representation. This is the object which represent the mathematical symbol. It can be done by implementing *IElementRepresentation*.
* The priority. A *IElementRepresentation* need to have a priority which is relative to each other *IElementRepresentation*, because this define how to build the *IEquation*.
* The generated element. Which is the element which will composed the final *IEquation*.

So the workflow looks like :

**External representation ->** *IElementRepresentation* **-> Construction depending on priority ->** *IEquation*

By example we can have :

**"+" ->** *AdderRepresentation* **-> Construction (priority 2) ->** *Adder*


## Implemented Operators
There are the implemented operators, respectively with, their corresponding symbol, their object representation, and their priority.

Symbol | Representation | Constructed | Priority
-------|----------------|-------------|---------
"number" | ValueRepresentation | ValueOperator | 0
"(" | OpeningParenthesisRepresentation | none | 1
")" | ClosingParenthesisRepresentation | none | 1
"+" | AdderRepresentation | Adder | 2
"-" | SubtractorRepresentation | Subtractor | 2
"*" | MultiplierRepresentation | Multiplier | 4
"/" | DivisorRepresentation | Divisor | 4
"^" | ExponentRepresentation | Exponent | 6