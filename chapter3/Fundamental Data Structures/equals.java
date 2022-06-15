/*
Equivalence Testing with Linked Lists

a == b:                   Tests if a and b refer to the same underlying array instance.

a.equals(b):              Interestingly, this is identical to a == b. Arrays are not a
                          true class type and do not override the Object.equalsmethod.

Arrays.equals(a,b):       This provides a more intuitive notion of equivalence, returning
                          true if the arrays have the same length and all pairs
                          of corresponding elements are “equal” to each other. More
                          specifically, if the array elements are primitives, then it uses
                          the standard == to compare values. If elements of the arrays
                          are a reference type, then it makes pairwise comparisons
                          a[k].equals(b[k]) in evaluating the equivalence.
                          
Arrays.deepEquals(a,b):   Identical to Arrays.equals(a,b) except when the elements
                          of a and b are themselves arrays, in which case it calls
                          Arrays.deepEquals(a[k],b[k]) for corresponding entries,
                          rather than a[k].equals(b[k]).
                          
last update: 2022 Dec 13                          
*/

public boolean equals(Object obj) {
  if (obj == null) return false;
  if (getClass( ) != obj.getClass( )) return false;
  
  SinglyLinkedList other = (SinglyLinkedList) obj; // use nonparameterized type
  if (size != other.size) return false;
  
  Node walkA = head; // traverse the primary list
  Node walkB = other.head; // traverse the secondary list
  
  while (walkA != null) {
    if (!walkA.getElement( ).equals(walkB.getElement( ))) return false; //mismatch
    walkA = walkA.getNext( );
    walkB = walkB.getNext( );
  }
  return true; // if we reach this, everything matched successfully
}
  
