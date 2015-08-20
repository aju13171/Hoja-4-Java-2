
public class ListaCircular <E>{
	
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
	
	public int size(){
		return size;
	}
	
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
	 * hay que revisar el addLast, no estoy seguro si funciona completamente
	 * @param value
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
	
}
