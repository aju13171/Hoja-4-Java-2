
public class NodoDoble <E>{
	private E valor;
	private NodoDoble<E> prevNodo;
	private NodoDoble<E> nextNodo;
	
	public NodoDoble(E valor, NodoDoble<E> prevNodo, NodoDoble<E> nextNodo){
		this.valor = valor;
		this.prevNodo = prevNodo;
		this.nextNodo = nextNodo;
		
	}
	
	/*
	 * Metodos del nodo doble
	 */
	private E valor(){
		return valor;
	}
	
	private void setNext(NodoDoble<E> nextNodo){
		this.nextNodo = nextNodo; 
	}
	
	private NodoDoble<E> getNext(){
		return nextNodo;
	}
	
}
