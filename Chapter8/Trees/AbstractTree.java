/** An abstract base class providing some functionality of the Tree interface. */
public abstract class AbstractTree<E> implements ITree<E> {  
  public boolean isInternal(Position<E> p) { 
    return numChildren(p) > 0; 
  }  
  
  public boolean isExternal(Position<E> p) { 
    return numChildren(p) == 0; 
  }  
  
  public boolean isRoot(Position<E> p) { 
    return p == root( ); 
  }  
  
  public boolean isEmpty( ) { 
    return size( ) == ; 
  }  
}
