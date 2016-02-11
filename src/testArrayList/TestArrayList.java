package testArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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
public class TestArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Creacion de una lista vacia.
		ArrayList arrayList = new ArrayList();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());

		// Se añaden distintos elementos, de distintos tipos.
		arrayList.add(1);
		arrayList.add(new String("hola"));
		arrayList.add(new String("hola"));
		arrayList.add(new Double(0));
		arrayList.add(new Date());

		System.out.println("Tamaño del ArrayList: " + arrayList.size());
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		System.out.println("arrayList.contains(\"hola\"): " + arrayList.contains("hola"));
		System.out.println("arrayList.contains(\"adios\"): " + arrayList.contains("adios"));
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		// último elemento
		System.out.println("arrayList.get(arrayList.size() - 1): " + arrayList.get(arrayList.size() - 1));
		// Primer elemento.
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(0) instanceof Integer: " + (arrayList.get(0) instanceof Integer));
		// recorrido con Iterator
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object + " - ");
		}
		System.out.println("\narrayList.indexOf(\"hola\"): " + arrayList.indexOf("hola"));
		// conversion a array
		Object[] array = arrayList.toArray();
		for (Object object : array) {
			System.out.print(object + " - ");
		}
		// borrado de elementos
		System.out.println("\narrayList.remove(0): " + arrayList.remove(0));
		System.out.println("arrayList.remove(\"hola\"): " + arrayList.remove("hola"));
		// se borran todos los elementos de la lista.
		arrayList.clear();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
	}

}
