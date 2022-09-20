package EjerciciosEnClase;

public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a = 5; //declaro las variables a y a continuacion guardo en ella un valor 5
        // las variablles se declaran en minusculas
        System.out.println("la variable a vale " + a);
        // se puede modificar
        a = 8;
        System.out.println("la variable a vale " + a);

        // reglas para nombrar variables
        // no puede tener caracteres especiales( signos de puntuacion,...)a excepcion de los caracteres
        int _variable = 3;
        // no puede contener espacios
        // int otra variable; --> no compila

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("=============");
        System.out.println("Las variables se declaran poniendo 1 " +
                "el tipo de variable que es y 2 el nombre que ledamos a la variable");
        System.out.println("Variables para numemros enteros: byte, short, long");
        System.out.println("byte");
        byte variableBytePos = 127; // es el numero mas grande que puedo guardar en una variable de tipo byte
        byte variableByteNeg = -128; // numero mas pequeño
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Numeros con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println("numero");
        float otroDecimal = 8.43f; // si declaras una variable de tipo

    }
}
