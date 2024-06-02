public class Solution {

    // Método principal que calcula la suma de los múltiplos de 3 o 5 menores que un número dado.
    public static int solution(int numero) {
        
        // Variable para almacenar la suma acumulada de los múltiplos. Se inicializa en cero.
        int suma = 0; 

        // Bucle 'for' que itera desde 1 hasta 'numero - 1'. 
        // La variable 'i' representa el número actual que se está evaluando.
        for (int i = 1; i < numero; i++) {

            // Condición que verifica si 'i' es divisible por 3 o por 5.
            // El operador '%' (módulo) calcula el resto de la división. 
            // Si el resto es cero, significa que 'i' es divisible por el número.
            if (i % 3 == 0 || i % 5 == 0) {

                // Si 'i' es múltiplo de 3 o 5, se suma a la variable 'suma'.
                suma += i; 
            }
        }

        // Después de recorrer todos los números, se devuelve el valor total acumulado en 'suma'.
        return suma; 
    }

    // Método principal (main) donde comienza la ejecución del programa.
    public static void main(String[] args) {

        // Se define un número de ejemplo (10 en este caso) para probar la función.
        int numero = 10; 

        // Se llama a la función 'solution' para calcular la suma de los múltiplos de 3 o 5 menores que 'numero'.
        // El resultado se almacena en la variable 'resultado'.
        int resultado = solution(numero); 

        // Se imprime en la consola el resultado obtenido.
        System.out.println("La suma de los múltiplos de 3 o 5 menores que " + numero + " es: " + resultado);
    }
}