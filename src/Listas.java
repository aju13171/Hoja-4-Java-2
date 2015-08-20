public interface Listas<E>{
	 
	public int size();
	
	public void addFirst (E value);
	
	public E removeFirst();
	
	public void addLast (E value);
	
	public E getFirst ();
	
	public E getLast ();
	
	public E removeLast();
	
	public boolean contains (E value);
	
}