# Palindrome Array Checker

## Project overview:

This programme checks words and sentences within an 
array to check if they are palindromes and returns 
a new array containing only the palindromes. The
programme ignores any spaces, case, numbers and 
special characters, focusing only on the letters in 
the order that they come. If no elements of the array 
pass the check, then an empty array is returned. 
The programme's features have been tested using JUnit.

## The checking function:

The function that checks whether the input in a
palindrome is called checkPalindromeInArr and can be 
found in the PalindromeArrayChecker class. The 
checkPalindrome method takes in a string array. 
Firstly, it initialises an integer called
palindromeCounter with a value of zero, and a new 
string array called checkerArr with a length equal to 
the passed in string array.

A for loop is then used to iterate through the elements 
of the passed in string array. Inside this for loop, 
firstly two new strings are initialised, newString and
reverseString, both with a value of an empty string. 
Another for loop is then declared within the outer 
for loop which iterates over the string found at 
the current index of the passed in string array, 
determined by whatever index the outer for loop is at. 

The inner for loop starts at the first index (0) of 
the string element. The logic inside the loop uses 
the isLetter character method to determine whether 
the character at each point in the string is a letter.
If a character is determined to be a letter, then 
this character is added to newString. This ensures 
that newString is built up from characters of the 
current string that are letters, hence not including 
any special characters, number characters or space. 
So newString is built up of the only required 
characters to check, kept in the correct order as 
they appear within the passed current string.

Another inner for loop is initialised which employs 
very similar logic. This loop however starts at the 
final index of the current string, again checking 
that each character is a letter. Each character that 
is determined to be a letter is then added to
reverseString in the opposite order that they are
in within the current string. After both inner loops 
have completed their cycle, we now have two strings 
that the programme can compare to check for a 
palindrome. There is newString that is in the same 
order as the current string excluding any characters 
that are not letters, and reverseString which is the 
same but in reverse order.

An if statement then checks two conditions. It checks 
whether newString and reverseString are equal using 
the equalsIgnoreCase method so that the case
of the characters does not matter. If both strings
are equal, this means they must be a palindrome. The 
additional check here, makes sure that the current 
string is not an empty string. If both these checks 
pass then the current string is determined to be a 
palindrome then the palindromeCounter value is 
incremented and the current index of the outer for 
loop is used to assign the element of checkedArr 
corresponding to that index value to hold the 
current string. If the condition of the if statement 
is not met, then the current string is determined not 
to be a palindrome and the element of checkedArr 
corresponding to the current index of the outer for 
loop is instead assigned the string value of "Not a 
palindrome"

The outer for loop exits once all the elements of 
the passed in string array have been checked. After 
this, a new string array is initialised called 
returnedArr with a length equal to the value of
palindromeCounter. A new integer called
returnedArrInserter is also declared with a value of 
zero. Another for loop is then used to iterate through 
checkedArr. Inside this for loop an if statement checks 
each element of checkedArr asking if it does not 
equal "Not a palindrome". If an element of checkedArr 
passes this check then the returnedArrInserter value 
is used as the index to assign the value of the 
current element of checkedArr to returnedArr, before
the value of returnedArrInserter is incremented. This 
loop continues through each element of checkedArr 
assigning each value that is a palindrome into 
returnedArr. 

Finally, returnedArr is returned containing only the 
palindromes present within the passed in array.

## How to run the programme:

The main method calls the start method within the 
Starter class which initialises a string array with 
string values, some of which are palindromes and some 
of which are not. It then prints this array to be 
checked to the console. A new string array is then 
declared with a value of the output of the
checkPalindromeInArr function with the array to be 
checked passed into it. This second array is then 
printed to the console which contains only the 
palindromes from the initial array. Should a user 
want to check for palindromes in a different array 
they can edit the code to pass in whatever array they 
want to the checkPalindromeInArr function.