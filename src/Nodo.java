/**
 * 
 * @author Christopher Aju, Jorge Manrique
 *
 * @param <E> Parametro generico.
 */
public class Nodo <E>{
	private E valor;
	private Nodo<E> nextNodo;
	
	/**
	 * 
	 * @param valor Valor
	 * @param nextNodo Referencia
	 */
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
