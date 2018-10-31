package thisysuper;

import java.awt.Dimension;

public class Imagen extends Archivo {
	private Integer ancho;
	private Integer alto;
	
	//Constructor call must be the first statement in a constructor
	public Imagen(String nombre, String extension, String ruta) {
		super(nombre, extension, ruta);
		this.ancho = 1920;
		this.alto = 1080;
	}
	
	//Implicit super constructor Archivo() is undefined. Must explicitly invoke another constructor
	public Imagen(String nombre, String extension, String ruta, Integer ancho, Integer alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Imagen(String nombre, String extension, String ruta, Dimension dimensiones) {
		this(nombre, extension, ruta, dimensiones.width, dimensiones.height);
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dimensiones: " + this.ancho + " X " + this.alto;
	}

}
