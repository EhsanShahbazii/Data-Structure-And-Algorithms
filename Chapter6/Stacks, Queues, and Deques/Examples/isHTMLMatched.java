/*
Matching Tags in a Markup Language

Another application of matching delimiters is in the validation of markup languages
such as HTML or XML. HTML is the standard format for hyperlinked documents
on the Internet and XML is an extensible markup language used for a variety of
structured data sets.
In an HTML document, portions of text are delimited by HTML tags. A simple
opening HTML tag has the form “<name>” and the corresponding closing tag has
the form “</name>”. For example, we see the <body> tag on the first line of
Figure 6.3a, and the matching </body> tag at the close of that document.
Ideally, an HTML document should have matching tags, although most browsers
tolerate a certain number of mismatching tags. In Code Fragment 6.8, we give a
Java method that matches tags in a string representing an HTML document.
We make a left-to-right pass through the raw string, using index j to track
our progress. The indexOf method of the String class, which optionally accepts a
starting index as a second parameter, locates the '<' and '>' characters that define
the tags. Method substring, also of the String class, returns the substring starting
at a given index and optionally ending right before another given index. Opening
tags are pushed onto the stack, and matched against closing tags as they are popped
from the stack,

last update 2022 Dec 14
*/

/** Tests if every opening tag has a matching closing tag in HTML string. */
public static boolean isHTMLMatched(String html) {
  
  Stack<String> buffer = new LinkedStack<>( );
  int j = html.indexOf('<'); // find first ’<’ character (if any)
  
  while (j != −1) {
    int k = html.indexOf('>', j+1); // find next ’>’ character
    if (k == −1)
      return false; // invalid tag
    
    String tag = html.substring(j+1, k); // strip away < >
    if (!tag.startsWith("/")) // this is an opening tag
      buffer.push(tag);
    else { // this is a closing tag
      if (buffer.isEmpty( ))
        return false; // no tag to match
      if (!tag.substring(1).equals(buffer.pop( )))
        return false; // mismatched tag
    }
    j = html.indexOf('<', k+1); // find next ’<’ character (if any)
  }
  return buffer.isEmpty( ); // were all opening tags matched?
  
}
