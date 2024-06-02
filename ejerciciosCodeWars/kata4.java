public class FindOdd {
    // Método principal que encuentra el número impar
    public static int findIt(int[] a) {
        int result = 0;      // Inicializa el resultado en 0
        
        // Itera sobre cada elemento del arreglo 'a'
        for (int num : a) {  
            result ^= num;   // Realiza la operación XOR bit a bit entre el resultado actual y el número iterado
        }
        
        return result;       // Retorna el resultado final, que será el número que aparece un número impar de veces
    }

    // Método main para probar la función findIt() con diferentes arreglos
    public static void main(String[] args) {
        int[] arr1 = {7};
        int[] arr2 = {0};
        int[] arr3 = {1, 1, 2};
        int[] arr4 = {0, 1, 0, 1, 0};
        int[] arr5 = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};

        // Llama a la función findIt() para cada arreglo y muestra el resultado en la consola
        System.out.println(findIt(arr1)); // 7
        System.out.println(findIt(arr2)); // 0
        System.out.println(findIt(arr3)); // 2
        System.out.println(findIt(arr4)); // 0
        System.out.println(findIt(arr5)); // 4
    }
}
