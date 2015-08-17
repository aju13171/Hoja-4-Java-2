public class SimpleEncadenada <E>{
	private int contador;
	private 
	
	
	public int size() {
		return contador;
	}

	
	public void addFirst(E value) {
			cabeza = new Nodo<E>(E, cabeza);
			contador++;
		
	}

	
	public E removeFirst() {
		Nodo<E> temp = cabeza;
		cabeza = cabeza.next();
		contador--;
		return temp.value();
	}

	
	public E removeLast() {
		Nodo<E> temp = cola;
		cola = cola.previous();
		cola.setNext(null);
		conatador--;
		return temp.value();
	}

	
	public void addLast(E value) {
		Nodo<E> temp = new Nodo <E>(value, null);	
		if(cabeza != null){
			Nodo <E> ap = cabeza;
			while(ap.next() != null){
				ap = ap.next();
			}
			ap.setNext(temp);
		}
		else{
			cabeza = temp;
			contador++;
		}
	}


	public boolean contains(E value) {
		Nodo<E> ap = cabeza;
		while (ap != null && !ap.value().equals(value)){
			ap = ap.next();
		}
		return ap !=null;
	}
	
	public E getFirst(){
		return cabeza.value();
	}
	
	public E getLast(){
		return cola.value();
	}

		
}
