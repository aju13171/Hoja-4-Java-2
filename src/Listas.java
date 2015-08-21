
/**
 * 
 * @author Jorge Manrique, Christopher Aju
 *
 * @param <E> Parametro generico.
 */
public interface Listas<E>{
	 
	/**
	 * 
	 * @return Regresa el tamaño de la lista.
	 */
	public int size();
	
	/**
	 * 
	 * @param value Valor que se desea agregar a la lista.
	 */
	public void addFirst (E value);
	
	/**
	 * 
	 * @return Regresa el valor eliminado.
	 */
	public E removeFirst();
	
	/**
	 * 
	 * @param value Parametro del valor que se quiere agregar al final de la lista.
	 */
	public void addLast (E value);
	
	/**
	 * 
	 * @return Regresa el valor en la primera posicion de la lista.
	 */
	public E getFirst ();
	
	/**
	 * 
	 * @return Regresa el valor en la ultima posicion de la lista.
	 */
	public E getLast ();
	
	/**
	 * 
	 * @return Regresa el valor eliminado de la ultima posicion de la lista.
	 */
	public E removeLast();
	
	/**
	 * 
	 * @param value Valor que se desea saber si esta en la lista.
	 * @return Regresa true o false si el valor esta en la lista o no.
	 */
	public boolean contains (E value);
	
}