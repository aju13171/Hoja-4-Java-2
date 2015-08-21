
/**
 * @author MS
 *
 * @param <E>
 */
public class PilaArray <E> implements Pila<E>{
	
	private int tamaño;
	private E[] pila;
	private int tope;
	
	public PilaArray(int s) {
		tamaño = s;
	    pila = (E[]) new Object[tamaño];
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
	      return (tope == tamaño-1);
	   }
	
}
