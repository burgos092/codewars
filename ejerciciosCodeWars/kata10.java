public class DuplicateEncoder {  // Define una clase pública llamada DuplicateEncoder

    public static String encode(String word) { // Método estático que recibe una cadena (word) y retorna un String codificado
        word = word.toLowerCase(); // Convierte la cadena de entrada a minúsculas para ignorar mayúsculas/minúsculas en la comparación

        StringBuilder encoded = new StringBuilder(); // Crea un StringBuilder (eficiente para construir cadenas dinámicamente)
        // para almacenar los resultados codificados

        for (char c : word.toCharArray()) { // Itera sobre cada carácter (c) en la cadena word convertida a un array de caracteres
            int count = 0; // Inicializa un contador para llevar la cuenta de las ocurrencias del carácter actual (c)

            // Bucle anidado para contar las ocurrencias de c en la cadena word
            for (char x : word.toCharArray()) { // Itera sobre cada carácter (x) en la cadena word nuevamente
                if (c == x) { // Compara si el carácter actual (c) es igual al carácter iterado (x)
                    count++; // Si son iguales, incrementa el contador
                }
            }

            // Agrega el carácter codificado al StringBuilder
            encoded.append(count > 1 ? ")" : "("); 
            // Si count es mayor que 1 (el carácter aparece más de una vez), agrega ")" al StringBuilder
            // Si no (el carácter aparece solo una vez), agrega "(" al StringBuilder
        }

        return encoded.toString(); // Convierte el StringBuilder a un String y lo devuelve como resultado
    }

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) {
        String[] examples = {"din", "recede", "Success", "(( @"}; // Ejemplos de cadenas a codificar

        // Itera sobre cada ejemplo
        for (String word : examples) {
            System.out.println(word + " => " + encode(word)); // Codifica la cadena y muestra el resultado original y codificado en la consola
        }
    }
}