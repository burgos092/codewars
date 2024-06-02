public class Kata {

    // Método principal para crear un número de teléfono formateado a partir de un arreglo de dígitos.
    public static String createPhoneNumber(int[] numbers) {

        // Validación de la entrada (asegura que el arreglo tenga exactamente 10 números)
        if (numbers.length != 10) { 
            // Si no hay 10 números, lanza una excepción indicando el error.
            throw new IllegalArgumentException("La matriz debe contener exactamente 10 números."); 
        }

        // Validación adicional (asegura que todos los números estén entre 0 y 9)
        for (int num : numbers) { // Itera sobre cada número 'num' en el arreglo 'numbers'
            if (num < 0 || num > 9) { 
                // Si algún número está fuera del rango permitido, lanza una excepción.
                throw new IllegalArgumentException("Los números deben estar entre 0 y 9."); 
            }
        }

        // Construcción del número de teléfono formateado
        // Utiliza String.format para dar formato a la cadena de salida.
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2], // Primeros tres dígitos (código de área)
                numbers[3], numbers[4], numbers[5], // Siguientes tres dígitos (prefijo)
                numbers[6], numbers[7], numbers[8], numbers[9]); // Últimos cuatro dígitos (línea)
    }

    // Método principal (main) donde comienza la ejecución del programa.
    public static void main(String[] args) {

        // Crea un arreglo de ejemplo con los dígitos del número de teléfono.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; 

        // Llama al método createPhoneNumber para formatear el número.
        String phoneNumber = createPhoneNumber(numbers); 

        // Imprime el resultado en la consola.
        System.out.println(phoneNumber); // Salida: (123) 456-7890
    }
}