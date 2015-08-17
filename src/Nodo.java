
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
	private E valor(){
		return valor;
	}
	
	private void setNextNodo(Nodo<E> next){
		nextNodo = next;
	}
	
	private Nodo<E> getNext(){
		return nextNodo;
	}
	
}
