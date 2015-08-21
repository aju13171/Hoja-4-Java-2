/**
 * 
 * @author Christopher Aju, Jorge Manrique
 *
 * @param <E> Parametro generico.
 */
public class ListaCircular <E> implements Listas <E>{
	
	/**
	 * VARIABLES:
	 * size: contiene la cantidad de elementos que hay en la lista
	 * cabeza: contiene el primer nodo creado
	 * cola: contiene el ultimo elemento creado
	 * temp: nodo temporal, sirve para realizar operaciones sin perder informacion
	 */
	int size;
	Nodo<E> cabeza;
	Nodo<E> cola;
	Nodo<E> temp;
	Nodo<E> temp2;
	public ListaCircular(){
		size = 0;
		cabeza = null;
		cola = null;
	}
	
	/**
	 * Metodo que retorna el tamaño de la lista circular.
	 */
	public int size(){
		return size;
	}
	
	/**
	 * Metodo para agregar elemento al inicio de la lista circular.
	 */
	public void addFirst(E value){
		/**
		 * El valor de siguiente se deja nulo para verificar despues 
		 * si es el primer elemento
		 */
		temp = new Nodo<E> (value, null);
		
		/*se verifica que no sea el primer elemento*/
		if (cabeza == null && cola == null){
			/*se asigna a si mismo para cerar lista*/
			temp.setNextNodo(temp);
			cabeza = temp;
			cola = temp;
			size++;
		}
		
		else{
			temp.setNextNodo(cabeza);
			cabeza = temp;
			/*se reasigna el valor para cerrar la lista circular*/
			cola.setNextNodo(cabeza);
			size++;
		}
	}
	
	/**
	 * Metodo para eliminar el primer elemento d ela lisra circular.
	 */
	public E removeFirst(){
		temp = cabeza;
		/*se asigna la nueva cabeza*/
		cabeza = cabeza.getNext();
		/*se cambia la referencia de la cola*/
		cola.setNextNodo(cabeza);
		size--;
		/*se retorna el valor eliminado*/
		return temp.valor();
		
	}
	
	/**
	 * @param value Parametro que se desea agregar en la ultima posicion de la lista.
	 */
	public void addLast(E value){
		/*se crea el nuevo nodo*/
		temp = new Nodo<E>(value, null);
		/*se verifica que no sea el primer elemento*/
		if (cabeza == null && cola == null){
			temp.setNextNodo(temp);
			cabeza = temp;
			cola = temp;
			size++;
		}
		/*si no es el primer elemento*/
		else{
			cola.setNextNodo(temp);
			/*se cambia el nodo de cola*/
			cola = temp;
			/*se cambia el nodo siguiente de la nueva cola*/
			cola.setNextNodo(cabeza);
			size++;
		}
	}
	
	/**
	 * Metodo para quitar el ultimo elemento de la lista.
	 */
	public E removeLast(){
		temp = cabeza;
		
		/*se recorre toda la lista para encontrar el valor del penultimo
		 * nodo
		 */
		for (int i=0; i<(size-1); i++){
			if (temp.getNext()!=null){
				/*se guarda el "penultimo" nodo*/
				temp2 = temp;
				/*se asigna el siguiente nodo*/
				temp = temp.getNext();
			}
			/**
			 * el ciclo else es para cuando se haya encontrado el penultimo 
			 * nodo
			 */
			else{
				/*se asigna la nueva cola*/
				cola = temp2;
				/*se cambia la referencia de la cola*/
				cola.setNextNodo(cabeza);
				size--;
			}
		}
		/*se devuelve el valor eliminado*/
		return temp.valor();
	}

	@Override
	public E getFirst() {
		// Obtener el valor del primer elemento.
		return null;
	}

	@Override
	public E getLast() {
		// Obtener el valor del ultimo elemento.
		return null;
	}

	@Override
	public boolean contains(E value) {
		// Determinar si la lisra contiene un elemento especifico.
		return false;
	}
	
}
