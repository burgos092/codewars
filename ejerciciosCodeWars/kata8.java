public class BitCounting {

    /**
     * Función para contar el número de bits que son iguales a uno
     * en la representación binaria de un número entero.
     * 
     * @param n el número entero del cual se desea contar los bits iguales a uno.
     * @return el número de bits iguales a uno en la representación binaria de n.
     */
    public static int countBits(int n) {
        // Convierte el número a su representación binaria
        String binaryString = Integer.toBinaryString(n);
        
        // Inicializa el contador de bits en uno
        int count = 0;
        
        // Recorre cada caracter de la cadena binaria
        for (char c : binaryString.toCharArray()) {
            // Incrementa el contador si el caracter es '1'
            if (c == '1') {
                count++;
            }
        }
        
        // Retorna el conteo de bits en uno
        return count;
    }

    public static void main(String[] args) {
        // Pruebas de ejemplo
        System.out.println(countBits(1234)); // 5
        System.out.println(countBits(0)); // 0
        System.out.println(countBits(1)); // 1
        System.out.println(countBits(1023)); // 10
    }
}