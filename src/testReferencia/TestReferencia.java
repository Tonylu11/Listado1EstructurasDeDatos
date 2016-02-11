package testReferencia;

/**
 * Crea el siguiente código. Contesta a las siguientes preguntas: a. ¿Cuándo la
 * comparación de dos referencias es true? b. ¿ Siempre se inicializa una
 * referencia a null? c. ¿Por qué vector1 y vector2 han de ser static? ¿Cuál
 * sería otra solución?
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestReferencia {
	static char[] vector1;// referencia (puntero a memoria dinamica)
	static char[] vector2;// referencia (puntero a memoria dinamica)

	public static void main(String[] args) {
		if (vector1 == null)
			System.out.println("vector vale null: " + vector1 + ". Todavía no apunta a la memoria dinámica");
		vector1 = new char[5];// Reserva de memoria y asignación
		vector2 = vector1;// ASIGNACIÓN: ambas apuntan al mismo trozo de memoria

		if (vector1 == vector2)// COMPARACIÓN
			System.out.println("Ambas apuntan al mismo trozo de memoria.");
		vector2 = new char[5];// Reserva de memoria y asignación
		if (vector1 != vector2)
			System.out.println("NO apuntan al mismo trozo de memoria");
		// Se comprueba que ambos vectores contienen lo mismo
		for (char caracter : vector1) {
			System.out.println(caracter + "-");
		}
		System.out.println();
		for (char caracter : vector2) {
			System.out.println(caracter + "-");
		}
	}

}
