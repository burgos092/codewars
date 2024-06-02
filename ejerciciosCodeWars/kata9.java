import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    // Método para contar caracteres duplicados en una cadena
    public static int duplicateCount(String str) {
        // Convertir la cadena a minúsculas para hacer el conteo sin distinguir entre mayúsculas y minúsculas
        str = str.toLowerCase();
        
        // Crear un mapa para almacenar caracteres y su frecuencia de ocurrencia
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterar sobre cada caracter de la cadena
        for (char c : str.toCharArray()) {
            // Incrementar el recuento del caracter en el mapa
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            // La función getOrDefault() devuelve el valor del caracter si está en el mapa, 
            // de lo contrario devuelve 0 y luego se incrementa en 1. 
            // Esto asegura que el contador comience en 1 si el caracter es nuevo en el mapa.
        }
        
        // Inicializar el contador de caracteres duplicados
        int duplicateCount = 0;
        
        // Iterar sobre los valores del mapa para contar caracteres duplicados
        for (int count : charCountMap.values()) {
            if (count > 1) {
                duplicateCount++; // Incrementar el contador si el recuento es mayor a 1
            }
        }
        
        // Retornar el conteo de caracteres duplicados
        return duplicateCount;
    }

    // Método main para pruebas
    public static void main(String[] args) {
        // Pruebas de ejemplo
        System.out.println(duplicateCount("abcde")); // 0
        System.out.println(duplicateCount("aabbcde")); // 2
        System.out.println(duplicateCount("aabBcde")); // 2
        System.out.println(duplicateCount("indivisibilidad")); // 1
        System.out.println(duplicateCount("Indivisibilidades")); // 2
        System.out.println(duplicateCount("aA11")); // 2
        System.out.println(duplicateCount("ABBA")); // 2
    }
}