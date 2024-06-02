public class SpinWords {

    /**
     * Función para invertir las palabras de una cadena que tienen cinco o más letras.
     * 
     * @param sentence la cadena de entrada que contiene una o más palabras.
     * @return la misma cadena con las palabras de cinco o más letras invertidas.
     */
    public static String spinWords(String sentence) {
        
        // Divide la cadena en palabras usando espacios como delimitadores
        String[] words = sentence.split(" ");
        // StringBuilder para almacenar la cadena resultante
        StringBuilder result = new StringBuilder();
        
        // Recorre cada palabra en el arreglo de palabras
        for (String word : words) {
            
            // Verifica si la longitud de la palabra es mayor o igual a cinco
            if (word.length() >= 5) {
                
                // Invierte la palabra usando StringBuilder
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                result.append(reversedWord.toString());
            } else {
                // Si la palabra tiene menos de cinco letras, agregarla tal cual
                result.append(word);
            }
            // Agrega un espacio después de cada palabra (excepto la última)
            result.append(" ");
        }
        
        // Retorna la cadena resultante sin el último espacio extra
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Pruebas de ejemplo para verificar el funcionamiento del método
        System.out.println(spinWords("Hey fellow warriors")); // "Hey wollef sroirraw"
        System.out.println(spinWords("This is a test")); // "This is a test"
        System.out.println(spinWords("This is another test")); // "This is rehtona test"
    }
}