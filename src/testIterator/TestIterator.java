package testIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Realiza los ejercicios de ListadoEstructuras y entrega el documento
 * "listadoEstructurasApellido1Apellido2Nombre.zip" donde aparecerán:
 * 
 * Códigos fuentes (*.java) del listado Documentos en PDF de las preguntas
 * teóricas (si fueran necesarias)
 * 
 * Temas tratados:
 * 
 * Cadenas Comparación Wrappers o envoltorios Autoboxing/inboxing instanceOf
 * Iteradores (Iterator, ListIterator) instanceof ArrayList
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestIterator {

	public static void main(String[] args) {
		// Creacion de un ArrayList
		ArrayList arrayList = new ArrayList();
		// Se añaden elementos.
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");

		// Recorrido hacia delante
		System.out.println("Contenido original: \t\t");
		Iterator iterator = arrayList.iterator();// 1. Obtención del iterador
													// (al principio de la
													// colección) mediante el
													// método iterator() de la
													// colección.
		while (iterator.hasNext()) {// 2. Bucle con hasNext();
			Object element = iterator.next();// 3. Dentro del bucle, obtención
												// del elemento mediante next();
			System.out.print(element + "\t");
		}
		System.out.println();

		// Modificacion de los objetos
		ListIterator listIterator = arrayList.listIterator();// 4.Obtencion del
																// iterador al
																// principio del
																// arrayList(listIterator(0))
		while (listIterator.hasNext()) {// 5. Bucle con hasNext();
			Object element = listIterator.next();// 6. Dentro del bucle,
													// obtencion del elemento
													// siguiente.
			listIterator.set(element + "*");// 7. Sustituye el último elemento
											// devuelto por next() o previous().

		}
		// 8. El listIterator está al final de la colección.

		// Recorrido hacia delante
		System.out.println("Lista modificada: \t\t");
		iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.print(element + "\t");
		}
		System.out.println();

		// Recorrido hacia atras.
		System.out.println("Lista modificada (Hacia atras): ");// 9. el
																// listIterator
																// parte del
																// final de la
																// coleccion.
		while (listIterator.hasPrevious()) {// 10. Bucle con hasPrevious();
			Object element = listIterator.previous();// 11. Dentro del bucle,
														// obtención del
														// elemento mediante
														// previous();
			System.out.print(element + "\t");
		}
		System.out.println();
		System.out.println("Reiniciado y recorriendo hacia atrás..");
		listIterator = arrayList.listIterator(arrayList.size());// Reiniciando
																// llamando al
																// metodo
																// listIterator
																// y pasandole
																// por parametro
																// la ultima
																// posicion del
																// cursor en el
																// arrayList.
		while (listIterator.hasPrevious()) {// 10. Bucle con hasPrevious();
			Object element = listIterator.previous();// 11. Dentro del bucle,
														// obtención del
														// elemento mediante
														// previous();
			System.out.print(element + "\t");
		}
		System.out.println();
	}

}
