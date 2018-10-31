package thisysuper;

import java.awt.Dimension;

public class Main {

	public static void main(String[] args) {
		// Ejemplos this y this()
		Archivo archivo1 = new Archivo();
		System.out.println(archivo1.toString());
		
		Archivo archivo2= new Archivo("lista_compra");
		System.out.println(archivo2.toString());
		
		Archivo archivo3 = new Archivo("lista_compra", "doc");
		System.out.println(archivo3.toString());
		
		Archivo archivo4 = new Archivo("lista_compra", "doc", "/home/ivan/Documents/");
		System.out.println(archivo4.toString());
		
		// Ejemplos this, this(), super y super() 
		Archivo imagen1 = new Imagen("foto", "png", "/home/ivan/Documents/Proyecto/");
		System.out.println(imagen1.toString());
		
		Archivo imagen2 = new Imagen("casa", "png", "/home/ivan/Documents/Proyecto/", 2500, 4000);
		System.out.println(imagen2.toString());
		
		Dimension dimensiones = new Dimension(300, 50);
		Imagen imagen3 = new Imagen("logo", "svg", "/home/ivan/Documents/Proyecto/", dimensiones);
		System.out.println(imagen3.toString());
	}

}
