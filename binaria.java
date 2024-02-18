/*
Enunciado: Escribir una función en Java que realice una búsqueda binaria en un array ordenado y devuelva el índice del elemento buscado, si está presente. Si no está presente, devolver -1.
*/

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == elemento)
                return medio;
            else if (array[medio] < elemento)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Array ordenado
        int elemento = 13; // Elemento a buscar

        int resultado = busquedaBinaria(array, elemento);

        if (resultado != -1)
            System.out.println("O elemento " + elemento + " foi encontrado no índice " + resultado);
        else
            System.out.println("O elemento " + elemento + " non foi encontrado no array.");
    }
}
