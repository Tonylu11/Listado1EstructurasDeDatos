package testReferencia;

/**
 * Crea el siguiente c�digo. Contesta a las siguientes preguntas: a. �Cu�ndo la
 * comparaci�n de dos referencias es true? b. � Siempre se inicializa una
 * referencia a null? c. �Por qu� vector1 y vector2 han de ser static? �Cu�l
 * ser�a otra soluci�n?
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
			System.out.println("vector vale null: " + vector1 + ". Todav�a no apunta a la memoria din�mica");
		vector1 = new char[5];// Reserva de memoria y asignaci�n
		vector2 = vector1;// ASIGNACI�N: ambas apuntan al mismo trozo de memoria

		if (vector1 == vector2)// COMPARACI�N
			System.out.println("Ambas apuntan al mismo trozo de memoria.");
		vector2 = new char[5];// Reserva de memoria y asignaci�n
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
