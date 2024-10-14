public class MetodosOrdenamiento {

    // Método de ordenamiento por selección
    public int[] sortBySeleccion(int[] arreglo, boolean ascendente) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (ascendente) {
                    if (arreglo[j] < arreglo[indice]) {
                        indice = j;
                    }
                } else {
                    if (arreglo[j] > arreglo[indice]) {
                        indice = j;
                    }
                }
            }
            // Intercambio
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    // Método de ordenamiento por inserción
    public int[] sortInsertion(int[] arreglo, boolean ascendente) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            if (ascendente) {
                while (j >= 0 && arreglo[j] > actual) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
            } else {
                while (j >= 0 && arreglo[j] < actual) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
            }
            arreglo[j + 1] = actual;
        }
        return arreglo;
    }

    // Método de ordenamiento Burbuja
    public int[] sortByBubble(int[] arreglo, boolean ascendente) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (ascendente) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                } else {
                    if (arreglo[j] < arreglo[j + 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                }
            }
        }
        return arreglo;
    }

    // Método Burbuja mejorado
    public int[] sortBubbleAva(int[] arreglo, boolean ascendente) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (ascendente) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                    }
                } else {
                    if (arreglo[j] < arreglo[j + 1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                    }
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
}