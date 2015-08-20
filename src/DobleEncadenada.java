/**
 * 
 */

/**
 * @author Chris
 *
 */
public class DobleEncadenada <E>{
	private int size;
	private NodoDoble<E> cabeza;
	private NodoDoble<E> cola;
	
	/*
	 *Nodos temporales: evita tener que crear nodos
	 *temporales en mas de 2 casos 
	 */
	private NodoDoble<E> temp;
	//private NodoDoble<E> temp2;
	
	/*
	 * constructor
	 */
	public DobleEncadenada(){
		size = 0;
		cabeza = null;
		cola = null;
	}
	
	/**
	 * Metodos:
	 * size: provee el tamaño de la lista
	 * addFirst: añade un valor al inicio de la lista
	 * removeFirst: elimina el primero de la lista
	 * addLast: añade un elemento a la cola de la lista
	 * removeLast: elimina el elemento de la cola
	 * getFirst: devuelve el primer elemento de la lista
	 * getLast: devuelve el ultimo elemento de la lista
	 * contains: devuelve true si existe el elemento buscado
	 */
	
	public int size(){
		return size;
	}
	
	public void addFirst(E valor){
		System.out.println("falta revisar logica defensiva");
		//se crea el nuevo nodo cabeza
		temp = new NodoDoble<E>(valor, null, cabeza);
		
		//si es un elemento mas
		if (cabeza!=null && cola !=null){
			//se asigna una nueva referencia anterior a la vieja cabeza
			cabeza.setPrev(temp);
			//se asigna la nueva cabeza
			cabeza = temp;
			size++;
		}
		
		//si es el segundo elemento en agregarse
		if (cabeza!= null && cola == null){
			//la cabeza pasa a ser la cola
			cola = cabeza;
			//se asigna la nueva cabeza
			cabeza = temp;
			//se cambia la referencia anterior de la cola
			cola.setPrev(cabeza);
			size++;
		}
		
		//si no hay ningun elemento 
		if (cabeza == null){
			cabeza = temp;
			size++;
		}
	}
	
	public E removeFirst(){
		//guardado de la vieja cabeza
		temp = cabeza;
		//cambio de cabeza
		cabeza = cabeza.getNext();
		//cambio de referencia enterior de la nueva cabeza
		cabeza.setPrev(null);
		size--;
		return temp.valor();
	}
	
	/*
	 * falta revisar logica defensiva (ver hoja)
	 */
	public void addLast(E valor){
		System.out.println("falta revisar logica defensiva");
		//se crea el nuevo nodo con referencia anterior a la vieja cola
		temp = new NodoDoble<E>(valor, cola, null);
		//se cambia la referencia siguiente de la vieja cola
		if (cola != null){
			cola.setNext(temp);			
		}
		cola = temp;
		size++;
	}
	
	public E removeLast(){
		//se almacena el nodo a eliminar
		temp = cola;
		
		//se cambia la referencia del nodo cola
		cola = cola.getPrev();
		//se cambia la referencia a null del nuevo nodo
		cola.setNext(null);
		//se devuelve el valor eliminado
		return temp.valor();
	}
	
	public E getFirst(){
		return cabeza.valor();
	}
	
	public E getLast(){
		return cola.valor();
	}
	
	public boolean contains(E valor){
		temp = cabeza;
		//se asume que no existe
		boolean contains = false;
		//se recorre toda la lista hasta encontrar la cola
		while((temp.getNext())!= null){
			if ((temp.valor()).equals(valor)){
				contains = true;
				//se rompe el ciclo ya que se encontro el valor buscado
				break;
			}
			//si no se encontro se busca en el siguiente nodo
			temp = temp.getNext();
		}
		return contains;
	}
}
