import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int[] arreglo = null;

        while (true) {
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño de su arreglo: ");
                    int tamano = scanner.nextInt();
                    arreglo = new int[tamano];
                    for (int i = 0; i < tamano; i++) {
                        System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
                        arreglo[i] = scanner.nextInt();
                    }
                    System.out.println("Arreglo ingresado: " + Arrays.toString(arreglo));
                    break;

                case 2:
                    if (arreglo == null) {
                        System.out.println("Primero debe ingresar un arreglo");
                        break;
                    }
                    System.out.println("Escoja un método de ordenamiento:");
                    System.out.println("1. Método Burbuja");
                    System.out.println("2. Método Selección");
                    System.out.println("3. Método Inserción");
                    System.out.println("4. Método Burbuja Mejorado");
                    System.out.print("Seleccione una opción: ");
                    int metodo = scanner.nextInt();

                    System.out.println("Escoja el orden:");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    int orden = scanner.nextInt();
                    boolean ascendente = orden == 1;

                    // Nueva opción: Mostrar pasos
                    System.out.println("¿Mostrar pasos intermedios?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    int pasosOpcion = scanner.nextInt();
                    boolean mostrarPasos = pasosOpcion == 1;

                    switch (metodo) {
                        case 1:
                            arreglo = metodos.sortByBubble(arreglo, ascendente, mostrarPasos);
                            break;
                        case 2:
                            arreglo = metodos.sortBySeleccion(arreglo, ascendente, mostrarPasos);
                            break;
                        case 3:
                            arreglo = metodos.sortInsertion(arreglo, ascendente, mostrarPasos);
                            break;
                        case 4:
                            arreglo = metodos.sortBubbleAva(arreglo, ascendente, mostrarPasos);
                            break;
                        default:
                            System.out.println("Método no válido");
                            break;
                    }
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
