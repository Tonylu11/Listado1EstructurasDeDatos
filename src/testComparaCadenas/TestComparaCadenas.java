package testComparaCadenas;

/**
 * Entrega el siguiente código comentado con los resultados a la derecha de cada
 * System.out.println() y contesta: a. ¿Cómo se comparan dos cadenas? b. ¿Para
 * qué se utiliza el operador de comparación == entre objetos? c. Una cadena
 * puede crearse mediante new o directamente con su literal. ¿Se crean de igual
 * manera? ¿Se aprovecha la memoria de alguna manera?
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestComparaCadenas {
	public static void main(String[] args) {
		String string1 = new String("Hola");
		String string2 = new String("Hola");
		System.out.println("string1 == string2: " + (string1 == string2));// False
																			// ya
																			// que
																			// no
																			// son
																			// el
																			// mismo
																			// objeto.
		System.out.println("string1.equals(string2): " + (string1.equals(string2)));// True
																					// ya
																					// que
																					// tienen
																					// el
																					// mismo
																					// contenido.
		String string3 = "Hola";
		String string4 = "Hola";
		System.out.println("string3 == string4: " + (string3 == string4));// True
																			// ya
																			// que
																			// estamos
																			// igualando
																			// dos
																			// cadenas.
		System.out.println("string3.equals(string4): " + (string3.equals(string4)));// True
																					// ya
																					// que
																					// tienen
																					// el
																					// mismo
																					// contenido.
		String strinMay = "Hola";
		String strinMin = "hola";
		System.out.println("strinMay == strinMin: " + (strinMay == strinMin));// True
																				// ya
																				// que
																				// ambos
																				// son
																				// el
																				// mismo
																				// objeto.
		System.out.println("strinMay.equals(strinMin): " + (strinMay.equals(strinMin)));// False
																						// ya
																						// que
																						// no
																						// poseen
																						// el
																						// mismo
																						// contenido,
																						// distingue
																						// entre
																						// mayusculas
																						// y
																						// minusculas.
		System.out.println("strinMay.equalsIgnoreCase(strinMin): " + (strinMay.equalsIgnoreCase(strinMin)));// True
																											// ya
																											// que
																											// ignora
																											// las
																											// diferencias
																											// de
																											// mayusculas
																											// y
																											// minusculas.
	}

}
