
public class FactoryAV <E> {

	public Pila <E> setype(int entrada,int tama�o){
		if (entrada == 1){
			return new PilaArray <E> (tama�o);
		}
		else {
			return new PilaVector <E> (tama�o);
		}
	}
}
