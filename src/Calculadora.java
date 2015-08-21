import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 
 */

/**
 * Calculadora.java
 * @author Chris
 * Programa que lee un archivo con las instrucciones de las operaciones en formato 
 * postfix y pide al usuario que tipo de lista implementar
 *
 */
public class Calculadora {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Variables y objetos necesarios para el programa
		//contiene el tipo de lista que se va implementar
		int tipo;
		@SuppressWarnings("resource") //elimina el mensaje del scann
		Scanner scan = new Scanner(System.in);
		File archivo = null;
		FileReader read = null;
		BufferedReader buffer = null;
		String bite = "null";
		
		//objetos tipo factory
		FactoryAV<String> factoryAV = new FactoryAV<String>();
		FactoryListas<String> factoryListas = new FactoryListas<String>();
		
		/**
		 * objetos que van a contener las listas de cualquier tipo
		 * operandos: guardan solo los operandos leidos en tipo int
		 * operadores: guardan solo operadores en tipo string
		 */
		Pila lista = null;
		Listas lista2 = null;
		//contiene cuantos operandos y operadores se ingresan
		int size = 0;
		//contiene la linea leida
		String linea = "";
		
		//variable para guardar datos temporalmente
		String temp = "";
		
		//Mensaje donde se pregunta el tipo de lista a implementar
		System.out.println("Que tipo de lista prefiere implementar?\n1 = Array\n2 = Vector"
				+ "\n3 = Simple enlazada\n4 = Doble Enlazada\n5 = Circular");
		tipo = scan.nextInt();

		/*
		 * Impresion del valor ingresado
		 * se puede eliminar solo sirve para estar seguros del ingreso
		 */
		System.out.println("Valor ingresado:" + tipo);
		//Pequeño delay para que el usuario pueda leer mesajes
				try{
					TimeUnit.SECONDS.sleep(1);
				}
				finally{
					
				}
		//Encabezado del programa
		System.out.println("------------>PROGRAMA CALCULADORA TIPO POSTFIX<---------------------");
		System.out.println("!!!!!!Asegurese de que el archivo esta "+ 
		"\nen la misma direccion que el programa para no tener ERRORES!!!");
		//Pequeño delay para que el usuario pueda leer mesajes
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		finally{
			
		}
		
		
		/*lectura de archivo*/
		try{
			/*se abre el archivo*/
			archivo = new File ("archivo.txt");
			read = new FileReader(archivo);
			buffer = new BufferedReader(read);
			
			/*lectura*/
			System.out.println("Lineas leidas:\n");
			
			while ((linea=buffer.readLine())!=null){
				System.out.println(linea);
				size = linea.length();
				System.out.println("Cantidad de operadores y operandos"
						+ "leidos con espacios:" + size);
				bite = linea;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if (null != read){
					read.close();
				}
			}
				catch(Exception f){
					f.printStackTrace();
				}
			}
		
		/**
		 * Se crea un objeto de tipo FactoryListas
		 * y otro de tipo FactoryAV
		 * 		Tipo FactoryListas: tiene los diferentes tipos 
		 * 		pilas con listas: dobles, simples y circulares
		 * 		Tipo FactoryAV: tiene las pilas tipo Array y Vector
		 * Los objetos se crean al inicio para mantener una estructura
		 * 
		 * 
		 * Se deben crear dos tipos de factory por los parametros 
		 * que recibe cada uno en su constructor
		 */
		
		/*pruebas*/
		/*impresion de todos los caracteres de la linea leida*/
		System.out.println("Caracteres de la linea:\n");
		/*
		 * lectura caracter por caracter
		 * se eliminan espacios en blanco
		 */
		
		for (int flag = 0; flag<bite.length(); flag++){
			if (!(Character.toString(bite.charAt(flag)).equals(" "))){
				System.out.println(bite.charAt(flag));
				temp = temp+Character.toString(bite.charAt(flag));
			}
		}
		linea = temp;
		System.out.println("Final: " + linea);
		
		//inicializacion de factory
		if(tipo>0 && tipo<3){
			//es de tipo AV
			lista = factoryAV.setype(tipo, size);
		}
		else {
			//es tipo listas
			lista2 = factoryListas.setlista(tipo);
		}
		
		
	}
}
