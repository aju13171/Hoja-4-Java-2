import java.util.Vector;

public class PilaVector <E> implements Pila<E>{
	// atributos
	private int large;
	private Vector<E> pila;
	private int finger;
	
	//large representa el largo de todas los operando y operadores
	public PilaVector(int large){
		this.large = large;
		pila = new Vector<E>(large);
	}

	public void push(E j) {
		// TODO Agregar un elemento a la lista de tipo vector
		pila.add(j);
		//revisar si incia en posicion 0
		finger++;
	}

	public E pop() {
		// TODO Auto-generated method stub
		E temp = pila.get(finger);
		pila.remove(finger);
		finger--;
		return temp;
		
	}

	public E peek() {
		// TODO Auto-generated method stub
		return pila.get(finger);
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (finger == -1);
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return (finger == large-1);
	} 

}
