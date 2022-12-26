/*
An Algorithm for Matching Delimiters

An important task when processing arithmetic expressions is to make sure their
delimiting symbols match up correctly. We can use a stack to perform this task
with a single left-to-right scan of the original string.
Each time we encounter an opening symbol, we push that symbol onto the
stack, and each time we encounter a closing symbol, we pop a symbol from the
stack (assuming it is not empty) and check that these two symbols form a valid
pair. If we reach the end of the expression and the stack is empty, then the original
expression was properly matched. Otherwise, there must be an opening delimiter
on the stack without a matching symbol. If the length of the original expression
is n, the algorithm will make at most n calls to push and n calls to pop. Code
Fragment 6.7 presents a Java implementation of such an algorithm. It specifically
checks for delimiter pairs ( ), { }, and [ ], but could easily be changed to accommodate
further symbols. Specifically, we define two fixed strings, "({[" and ")}]",
that are intentionally coordinated to reflect the symbol pairs. When examining a
character of the expression string, we call the indexOf method of the String class
on these special strings to determine if the character matches a delimiter and, if so,
which one. Method indexOf returns the the index at which a given character is first
found in a string (or −1 if the character is not found).

last update 2022 Dec 14
*/

/** Tests if delimiters in the given expression are properly matched. */
public static boolean isMatched(String expression) {
  
  final String opening = "({["; // opening delimiters
  final String closing = ")}]"; // respective closing delimiters
  
  Stack<Character> buffer = new LinkedStack<>( );
  
  for (char c : expression.toCharArray( )) {
    if (opening.indexOf(c) != −1) // this is a left delimiter
      buffer.push(c);
    else if (closing.indexOf(c) != −1) { // this is a right delimiter
      if (buffer.isEmpty( )) // nothing to match with
        return false;
      if (closing.indexOf(c) != opening.indexOf(buffer.pop( )))
        return false; // mismatched delimiter
    }
  }
  return buffer.isEmpty( ); // were all opening delimiters matched?
  
}
