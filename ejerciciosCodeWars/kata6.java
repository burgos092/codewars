public class DRoot {

    /**
     * Método para calcular la raíz digital de un número.
     * La raíz digital es el valor obtenido sumando los dígitos de un número
     * repetidamente hasta obtener un solo dígito.
     * 
     * @param n el número del cual se desea obtener la raíz digital.
     * @return la raíz digital del número n.
     */
    public static int digital_root(int n) {
        
        // Si el número es menor que 10, ya es un solo dígito, se retorna n.
        if (n < 10) {
            return n;
        }

        int sum = 0; // Inicializa la suma en 0.
        
        // Mientras n sea mayor que 0, sumar los dígitos de n.
        while (n > 0) {
            sum += n % 10; // Sumar el último dígito de n a la suma.
            n /= 10;       // Eliminar el último dígito de n.
        }
        
        // Llamada recursiva al método con la suma de los dígitos.
        return digital_root(sum); 
    }

    /**
     * Método principal para probar el método digital_root con diferentes valores.
     * 
     * @param args argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Prueba del método digital_root con diferentes números y muestra el resultado.
        System.out.println(digital_root(16));     // 7
        System.out.println(digital_root(942));    // 6
        System.out.println(digital_root(132189)); // 6
        System.out.println(digital_root(493193)); // 2
    }
}