
public class Nodo <E>{
	private E valor;
	private Nodo<E> nextNodo;
	
	public Nodo(E valor, Nodo<E> nextNodo){
		this.valor = valor;
		this.nextNodo = nextNodo;
	}
	
	/*
	 * Metodos del nodo
	 */
	public E valor(){
		return valor;
	}
	

	public void setNextNodo(Nodo<E> next){
		nextNodo = next;
	}
	
	
	public Nodo<E> getNext(){
		return nextNodo;
	}
	
}
