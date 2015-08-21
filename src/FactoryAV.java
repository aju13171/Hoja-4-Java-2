
/**
 * @author Jorge Manrique, Christopher Aju
 *
 * @param <E> Parametro generico.
 */
public class FactoryAV <E> {
	
	/**
	 * 
	 * @param entrada Parametro para seleccion de tipo de pila.
	 * @param tama�o Parametro para definir el tam�o de la pila vector o pila arreglo.
	 * @return Retorno de nueva PilaArray o PilaVector.
	 */
	public Pila <E> setype(int entrada,int tama�o){
		if (entrada == 1){
			return new PilaArray <E> (tama�o);
		}
		else {
			return new PilaVector <E> (tama�o);
		}
	}
}
