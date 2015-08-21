
/**
 * @author MS
 *
 * @param <E>
 */
public class PilaArray <E> implements Pila<E>{
	
	private int tama�o;
	private E[] pila;
	private int tope;
	
	@SuppressWarnings("unchecked")
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
