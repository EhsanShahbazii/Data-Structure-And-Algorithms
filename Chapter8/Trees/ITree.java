/*
Tree Interface in Java

getElement( ):                Returns the element stored at this position.The tree ADT then supports the following accessor methods, allowing a user
                              to navigate the various positions of a tree T:
root( ):                      Returns the position of the root of the tree(or null if empty).
parent(p):                    Returns the position of the parent of position p(or null if p is the root).
                              children(p): Returns an iterable collection containing the children of
                              position p (if any).
numChildren(p):               Returns the number of children of position p.
                              If a tree T is ordered, then children(p) reports the children of p in order.
                              In addition to the above fundamental accessor methods, a tree supports the
                              following query methods:
isInternal(p):                Returns true if position p has at least one child.
isExternal(p):                Returns true if position p does not have any children.
isRoot(p):                    Returns true if position p is the root of the tree.
                              These methods make programming with trees easier and more readable, since
                              we can use them in the conditionals of if statements and while loops.
                              Trees support a number of more general methods, unrelated to the specific
                              structure of the tree. These incude:
size( ):                      Returns the number of positions (and hence elements)
                              that are contained in the tree.
isEmpty( ):                   Returns true if the tree does not contain any positions(and thus no elements).
iterator( ):                  Returns an iterator for all elements in the tree(so that the tree itself is Iterable).
positions( ):                 Returns an iterable collection of all positions of the tree.

last update 2023 Jan 15
*/


/** An interface for a tree where nodes can have an arbitrary number of children. */
public interface ITree<E> extends Iterable<E> {
  Position<E> root( );
  
  Position<E> parent(Position<E> p) 
    throws IllegalArgumentException;
  
  Iterable<Position<E>> children(Position<E> p)
    throws IllegalArgumentException;
  
  int numChildren(Position<E> p) 
    throws IllegalArgumentException;
  
  boolean isInternal(Position<E> p)
    throws IllegalArgumentException;
  
  boolean isExternal(Position<E> p) 
    throws IllegalArgumentException;
  
  boolean isRoot(Position<E> p) 
    throws IllegalArgumentException;
  
  int size( );
  boolean isEmpty( );
  Iterator<E> iterator( );
  Iterable<Position<E>> positions( );
}
