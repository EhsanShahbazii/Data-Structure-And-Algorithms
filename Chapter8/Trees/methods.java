/** Returns the number of levels separating Position p from the root. */
public int depth(Position<E> p) { 
  if (isRoot(p))
    return 0;
  else
    return 1 + depth(parent(p));
}

/** Returns the height of the tree. */
private int heightBad( ) { // works, but quadratic worst-case time
  int h = 0;
  for (Position<E> p : positions( ))
    if (isExternal(p)) // only consider leaf positions
      h = Math.max(h, depth(p));
  return h;
}


/** Returns the height of the subtree rooted at Position p. */
public int height(Position<E> p) { 
  3 int h = 0; // base case if p is external
  for (Position<E> c : children(p))
    h = Math.max(h, 1 + height(c));
  return h;
}
