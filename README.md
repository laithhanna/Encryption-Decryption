# Encryption-Decryption
Created a program that encrypt or decrypt text based on the user’s choice. Below are the commands and rules used in the program. Moreover, there will be a picture
demonstrating an actual run of the program at the end of this file.

.....................................................................................................................................................................................................................................................................................

There are two encryption/decrytpion algorithms available:

Caesar cipher -> It shifts each letter by the specified number (the key) according to its order in the alphabet in circle;

Unicode -> Performs encryption/decryption based on the Unicode table.

.....................................................................................................................................................................................................................................................................................

Commands:

"-mode" -> accepts 2 possible strings: "enc" (encryption) or "dec" (decryption);

"-key" -> accepts integers as the key of encryption/decryption;

"-data" -> accepts a strings as the input text to encrypt/decrypt;

"-in" -> accepts a string as the name of the source .txt file to read the data to encrypt/decrypt from;

"-out" -> accepts a string as the name of the output .txt file to write the result of encryption/decryption to;

"-alg" -> accepts 2 possible strings: "shift" (using shifting algorithm "Caesar cipher" to encrypt/decrypt) or "unicode" (using unicode algorithm to encrypt/decrypt).

.....................................................................................................................................................................................................................................................................................

Additional rules:

If there is no -mode, the program should work in enc mode.

If there is no -key, the program will consider that key = 0.

The program will read data from -data or from a file written in the -in argument. That's why you can't have both -data and -in arguments simultaneously, only one of them.

If there is no -data and there is no -in the program will assume that the data is an empty string.

If there is no -out argument, the program will print data to the standard output.

If there are both -data and -in arguments, -data is prioritized.

If there is no -alg the program will default to shift.

Remember that in case of shift algorithm you need to encode only English letters (from 'a' to 'z' as the first circle and from 'A' to 'Z' as the second circle i.e. after 'z' comes 'a' and after 'Z" comes 'A').

The arguments may be in different order.

If there is a non-standard situation (an input file does not exist or an argument doesn’t have a value), the program will display a clear message about the problem.

.....................................................................................................................................................................................................................................................................................

example of runnig the program from the terminal:

![example](https://user-images.githubusercontent.com/84100829/135176172-53fd573b-97f2-427d-9c90-aa8176099a2b.PNG)


