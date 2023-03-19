IPv4 Validation

This program checks if the given IPv4 address is valid or not. An IPv4 address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed, but the length of A, B, C, or D can't be greater than 3.

Usage

To use this program, run the Solution class. The program will prompt you to enter an IPv4 address, and it will output whether the address is valid or not.

Implementation

This program uses regular expressions to check if the given IPv4 address is valid or not. The regular expression used is (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).

The program also includes a method called ifIPIsCorrectMethod which uses a split method to separate the IPv4 address into its individual numbers, and then checks if each number is between 0 and 255. However, this method is not used in the main program and is only included for reference.

MyRegex Class

The MyRegex class contains a string pattern that holds the regular expression used to validate the IPv4 address. The constructor initializes the pattern with the regular expression, and the isIpCorrect method uses this pattern to check if the given IPv4 address is valid or not.
