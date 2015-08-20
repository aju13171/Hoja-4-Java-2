
public class Pila <E> {
	private int tama�o;
	private E[] pila;
	private int tope;
	@SuppressWarnings("unchecked")
	public Pila(int s) {
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
	      return (tope == -1);
	   }
	public boolean isFull() {
	      return (tope == tama�o-1);
	   }
}
