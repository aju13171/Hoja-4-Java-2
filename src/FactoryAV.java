
/**
 * @author Jorge Manrique, Christopher Aju
 *
 * @param <E> Parametro generico.
 */
public class FactoryAV <E> {
	
	/**
	 * 
	 * @param entrada Parametro para seleccion de tipo de pila.
	 * @param tamaño Parametro para definir el tamño de la pila vector o pila arreglo.
	 * @return Retorno de nueva PilaArray o PilaVector.
	 */
	public Pila <E> setype(int entrada,int tamaño){
		if (entrada == 1){
			return new PilaArray <E> (tamaño);
		}
		else {
			return new PilaVector <E> (tamaño);
		}
	}
}
