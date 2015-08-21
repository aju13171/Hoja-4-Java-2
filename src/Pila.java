/**
 * 
 * @author Jorge Manrique, Christopher ajú
 *
 * @param <E> Parametro generico.
 */
public interface Pila <E>{

	/**
	 * @param j Valor de entrada al metodo push.
	 */
	public void push(E j);
	
	/**
	 * 
	 * @return Regresa el valor en la parte superior de la pila y lo retira de la pila.
	 */
	public E pop();
	
	/**
	 * 
	 * @return Regresa el valor en la parte superior de la pila sin eliminarlo.
	 */
	public E peek();
	
	/**
	 * 
	 * @return Regresa true si la pila esta vacia.
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @return Regresa true si la pila esta llena.
	 */
	public boolean isFull();
	
}
