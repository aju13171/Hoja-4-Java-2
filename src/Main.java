import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String dato = "";
		
		int valor = 23;
		Pila pila = new Pila(10);
		
		dato = scan.nextLine();
		
		pila.push(dato);
		pila.push(valor);
		pila.push("hola");
		
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
	}
}
