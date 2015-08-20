

public class NodoDoble <E>{
	private E valor;
	private NodoDoble<E> prevNodo;
	private NodoDoble<E> nextNodo;
	
	//constructor
	public NodoDoble(E valor, NodoDoble<E> prevNodo, NodoDoble<E> nextNodo){
		this.valor = valor;
		this.prevNodo = prevNodo;
		this.nextNodo = nextNodo;
		
	}
	
	/*
	 * Metodos del nodo doble
	 */
	public E valor(){
		return valor;
	}
	
	/*
	 * metodos para nodo siguiente
	 */
	public void setNext(NodoDoble<E> nextNodo){
		this.nextNodo = nextNodo; 
	}
	
	public NodoDoble<E> getNext(){
		return nextNodo;
	}
	
	/*
	 * metodos para nodo anterior
	 */
	
	public void setPrev(NodoDoble<E> prevNodo){
		this.prevNodo = prevNodo;
	}
	
	public NodoDoble<E> getPrev(){
		return prevNodo;
	}
}
