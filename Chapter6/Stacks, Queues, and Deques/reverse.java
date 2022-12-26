/*
Reversing an Array Using a Stack

last update 2022 Dec 14
*/

// A generic method for reversing an array.
public static <E> void reverse(E[] array) {
  
  Stack<E> buffer = new ArrayStack<>(a.length);
  
  for (int i = 0; i < array.length; i++)
    buffer.push(a[i]);
  for (int i = 0; i < array.length; i++)
    a[i] = buffer.pop( );
  
}
