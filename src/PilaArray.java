
/**
 * @author Jorge Manrique, Christopher Aju
 *
 * @param <E> Parametro generico.
 */
public class PilaArray <E> implements Pila<E>{
	
	/**
	 * tama�o es el tama�o del arreglo
	 * E[] pila es el arreglo de genericos.
	 * tope guarda la posicion en la que se esta trabajando
	 */
	private int tama�o;
	private E[] pila;
	private int tope;
	
	public PilaArray(int s) {
		tama�o = s;
	    pila = (E[]) new Object[tama�o];
	    }
	
	public void push(E j) {
	      pila[++tope] = j;
	   }
	
	public E pop() {
	      return pila[tope--];
	   }
	
	public E peek() {
	      return pila[tope];
	   }
	
	public boolean isEmpty() {
	      return (tope == 0);// solucionado antes igualado a -1.
	   }
	
	public boolean isFull() {
	      return (tope == tama�o-1);
	   }
	
}
