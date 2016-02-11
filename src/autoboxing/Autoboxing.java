package autoboxing;

/**
 * ¿Qué es el autoboxing/unboxing ? Explícalo mediante tu propio código en Java
 * “autoboxing.java”
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Autoboxing {

	public static void main(String[] args) {
		Integer autoboxing = 23;// Autoboxing de tipo int a tipo Integer
		Integer envoltorioInteger = new Integer(5);// Creado de tipo Integer
		int tipoPrimitivoInt = envoltorioInteger;// El tipo integer pasa a ser
													// int mediante unboxing, de
													// envoltorio a tipo
													// primitivo.
	}

}
