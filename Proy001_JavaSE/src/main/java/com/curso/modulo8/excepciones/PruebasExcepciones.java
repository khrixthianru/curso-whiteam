package com.curso.modulo8.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebasExcepciones {

	public static void main(String[] args) {

		int resultado = doble("dos");
		System.out.printf("El doble de %d es %d %n",2, resultado);

	}
	
	public static int doble(String numero) {
		//validar que el numero es valido
		
		
		//la clase wrapper Integer metodo parseInt que convierte un 
		//String en un int.    si no puede lanza una exception
		
		int numInicial = 0;
		try {
			numInicial = Integer.parseInt(numero);
			numInicial *= 2;
			
		} catch (NumberFormatException e) {
			System.out.println("No se puede calcular el doble: " + e.getMessage());
		}
		
		// guardarResultado("sdfsad.txt", 4);
		//calculo el doble
		
		
		return numInicial;
	}
	
	public static void guardarResultado(String nombreFichero, int resultado) {
		File fichero = new File(nombreFichero);
		File fichero2 = new File("C:\\Users\\alumno\\Desktop\\Nueva carpeta\\parametros.txt");
		try {
			
			
			fichero.createNewFile();
			
			FileReader fr = new FileReader(fichero2); //throws FileNotFoundException
			
			System.out.println("......aqui");
			
		}catch (FileNotFoundException e) {
			System.out.println("El fichero parametros.txt no existe");
		}catch (IOException e) {
			System.out.println("No puedo crear el fichero");
		}catch (Exception e) {
			System.out.println("Error desconocido " + e.getMessage());
		}finally {
			//se usa para cerrar recursos, cerrar las conexiones a bbdd x ej.
			System.out.println("............... siempre si o si se ejecuta en el finally");
			//aunke haya algun return en algun catch
		}
		
		System.out.println("despues del try catch");
	}

}
