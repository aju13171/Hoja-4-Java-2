
public class Pila <E> {
	private int tamaño;
	private E[] pila;
	private int tope;
	@SuppressWarnings("unchecked")
	public Pila(int s) {
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
	      return (tope == -1);
	   }
	public boolean isFull() {
	      return (tope == tamaño-1);
	   }
}
