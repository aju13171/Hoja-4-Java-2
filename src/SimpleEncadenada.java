
public class SimpleEncadenada <E> implements Listas<E>{
	private int size;
	private Nodo<E> cabeza;
	private Nodo<E> cola;
	
	/*
	 * Nodos temporales: evita tener que crear 
	 * nodos temporales en mas de 2 casos
	 */
	private Nodo<E> temp;
	private Nodo<E> temp2;
	/*
	 * constructor
	 */
	public SimpleEncadenada(){
		size = 0;
		cabeza = null;
		cola = null;
	}
	/**
	 * Metodos:
	 * 
	 * size() provee el tamaño de la lista
	 * addFirst(E value) agrega un valor al inicio de la lista
	 * removeFirst() elimina el primer elemento de la lista
	 * removeLast() elimina el ultimo elemento de la lista
	 * addLast(E value) agrega un elemento a la cola de la lista
	 * contains(E value) busca en la lista si existe un elemento en la lista
	 * E getFirst() devuelve el primer valor de la lista
	 * E getLast() Devuelve el ultimo valor de la lista
	 */
	
	public int size(){
		return size;
	}
	
	public void addFirst(E value){
		//se crea un nuevo nodo con referencia a la cabeza actual
		temp = new Nodo<E>(value, cabeza);
		
		//si es el primer elemento se agrega una cabeza y una cola
		if (cabeza == null && cola == null){
			cabeza = temp;
			cola = temp;
		}
		
		/*
		 * si no es el primer elemento se cambia la cabeza con el nuevo nodo
		 */
		else{
			cabeza = temp;		
		}
		
		size++;	
	}
	
	public E removeFirst(){
		//se copia la cabeza a eliminar para enviar valor eliminado
		temp = cabeza;
		//se asigna la nueva cabeza
		cabeza = cabeza.getNext();
		//se resta al contador
		size--;
		//se retorna el valor eliminado
		return temp.valor();		
	}
	
	public void addLast(E value){
		//se crea el nuevo nodo
		temp = new Nodo<E> (value, null);
		//se cambia la referencia a la cola
		//si es el primer elemento:
		if (cola == null && cabeza == null){
			//System.out.println("ejecucion if 1");
			cola = temp;
			cabeza = temp;
		}
		//si es el segundo elemento
		if (size==2){
			//System.out.println("ejecucion if 2");
			cabeza.setNextNodo(temp);
			cola = temp;
		}
		//si no es el primer elemento ni el segundo elemento
		else{
			//System.out.println("ejecucion else");
			cola.setNextNodo(temp);
			//se asigna la nueva cola
			cola = temp;			
		}
		size++;
		//System.out.println("si se ven dos mensajes de ejecucion hay error en codigo SimpleEncadenada");
	}
	
	public E removeLast(){
		//recorrer toda la lista hasta encontrar el ultimo nodo
		//se asume que la cabeza es el ultimo elemento
		temp = cabeza;
		//ciclo para recorrer toda la lista
		for (int i=0; i<(size-1); i++){
			if (temp.getNext()!= null){
				//se cambia la antepenultima referencia
				temp2 = temp;
				//se asigna el siguiente elemento como el ultimo
				temp = temp.getNext();
			}
			
			else{
				//se asigna la nueva cola
				cola = temp2;
				//se cambia la referencia a null del antepenultimo
				cola.setNextNodo(null);
				size--;
			}
		}
		//devuelve el valor del ultimo nodo eliminado
		return temp.valor();		
	}
	
	public boolean contains(E value){
		temp = cabeza;
		//se asume que no esta el valor
		boolean contains = false;
		//se recorre toda la lista
		while (temp != null){
			if ((temp.valor()).equals(value)){
				//si se encuentra el valor se cambia a true y se rompe el ciclo
				contains = true;
				break;
			}
			else{
				//si no esta el valor en el nodo se pasa al siguiente
				temp = temp.getNext();
			}
		}
		return contains;
	}
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	
}