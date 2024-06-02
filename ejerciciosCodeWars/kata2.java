class Solution {

    // Método principal para generar el texto de "me gusta".
    public static String whoLikesIt(String... names) {
        
        // Determina la cantidad de nombres en el arreglo "names".
        int cantidad = names.length; 

        // Utiliza una estructura switch para manejar diferentes casos según la cantidad de nombres.
        switch (cantidad) {
            
            // Caso 0: Si no hay nombres, devuelve "no one likes this".
            case 0:
                return "no one likes this"; 
            
            // Caso 1: Si hay un nombre, devuelve "[nombre] likes this".
            case 1:
                return names[0] + " likes this"; 
            
            // Caso 2: Si hay dos nombres, devuelve "[nombre1] and [nombre2] like this".
            case 2:
                return names[0] + " and " + names[1] + " like this"; 
            
            // Caso 3: Si hay tres nombres, devuelve "[nombre1], [nombre2] and [nombre3] like this".
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this"; 
            
            // Caso por defecto (default): Si hay cuatro o más nombres, devuelve 
            // "[nombre1], [nombre2] and [cantidad - 2] others like this".
            default:
                return names[0] + ", " + names[1] + " and " + (cantidad - 2) + " others like this"; 
        }
    }

    // Método principal (main) donde se ejecutan pruebas.
    public static void main(String[] args) {

        // Se crean varios arreglos de nombres para probar diferentes escenarios.
        String[] nombres1 = {};        // Arreglo vacío
        String[] nombres2 = {"Peter"}; // Un nombre
        String[] nombres3 = {"Jacob", "Alex"}; // Dos nombres
        String[] nombres4 = {"Max", "John", "Mark"}; // Tres nombres
        String[] nombres5 = {"Alex", "Jacob", "Mark", "Max"}; // Cuatro nombres

        // Se llama al método 'whoLikesIt' para cada arreglo de nombres y se imprime el resultado.
        System.out.println(whoLikesIt(nombres1)); 
        System.out.println(whoLikesIt(nombres2)); 
        System.out.println(whoLikesIt(nombres3)); 
        System.out.println(whoLikesIt(nombres4)); 
        System.out.println(whoLikesIt(nombres5)); 
    }
}