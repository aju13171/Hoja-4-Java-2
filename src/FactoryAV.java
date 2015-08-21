
public class FactoryAV <E> {

	public Pila <E> setype(int entrada,int tamaño){
		if (entrada == 1){
			return new PilaArray <E> (tamaño);
		}
		else {
			return new PilaVector <E> (tamaño);
		}
	}
}
