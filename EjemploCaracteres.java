public class EjemploCaracteres {

    public static void main(String[] args) {
        String cuota1 = "10";
        String cuota2 = "20";
        System.out.println(cuota1 + cuota2);

        String saludo = "Hola, mi nombre es ";
        String nombre = "Rómulo ";
        String continuacion = "y mi edad es ";
        int edad = 100;
        System.out.println(saludo + nombre + continuacion + edad);

        char letra = 'a';
        System.out.println(letra);

        char valor = 65; // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1); // Compila!
        System.out.println(valor);

        String palabra = "Palabra";
        System.out.println(palabra);

        palabra = palabra + 2020;
        System.out.println(palabra);
    }
}
