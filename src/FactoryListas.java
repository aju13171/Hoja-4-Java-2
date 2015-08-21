
/**
 * @author Jorge Manrique, Christopher Aju
 *
 * @param <E> Parametro generico.
 */
public class FactoryListas <E>{
	
	/**
	 * 
	 * @param entrada Parametro con el numero de opcion escogido por el usuario.
	 * @return Retorno de nueva lista encadenada, lista doblemente encadenada o lista circular.
	 */
	public Listas<E> setlista(int entrada){
		if(entrada == 3){
			return new SimpleEncadenada<E> ();
		}
		else if(entrada == 4){
			return new DobleEncadenada <E> ();
		}
		else{
			return new ListaCircular <E> ();
		}
	}
}
