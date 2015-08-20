import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tipo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Que tipo de lista prefiere implementar?\n1 = Array\n2 = Vector"
				+ "\n3 = Simple enlazada\n4 = Doble Enlazada\n5 = Circular");
		tipo = scan.nextInt();
		System.out.println("Valor ingresado:" + tipo);
		System.out.println("Programa calculadora tipo postfix");
		System.out.println("Asegurese de que el archivo esta "+ "en la misma direccion que el programa");
		/*lectura de archivo*/
		File archivo = null;
		FileReader read = null;
		BufferedReader buffer = null;
		String bite = "null";
		
		try{
			/*se abre el archivo*/
			archivo = new File ("archivo.txt");
			read = new FileReader(archivo);
			buffer = new BufferedReader(read);
			
			/*lectura*/
			System.out.println("Lineas leidas:\n");
			String linea;
			while ((linea=buffer.readLine())!=null){
				System.out.println(linea);
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
		
		
		/*pruebas*/
		/*impresion de todos los caracteres de la linea leida*/
		System.out.println("Caracteres de la linea:\n");
		/*lectura caracter por caracter*/
		for (int flag = 0; flag<bite.length(); flag++){
			System.out.println(bite.charAt(flag));
		}
	}
}
