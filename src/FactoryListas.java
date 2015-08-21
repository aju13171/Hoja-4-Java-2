
public class FactoryListas <E>{
	
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
