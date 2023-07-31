package src.calculadoraHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        HashMap<Character, Operaciones> operacionesMap = new HashMap<>();

        
        operacionesMap.put('+', new Suma());
        operacionesMap.put('-', new Resta());
        operacionesMap.put('*', new Multiplicacion());
        operacionesMap.put('/', new Division());

        // Realizar algunas operaciones
        System.out.println("Ingrese el valor del primer numero a operar: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo numero a operar: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingrese el caracter de la operacion que desea realizar(+, -, *, /): ");
        char operador = entrada.next().charAt(0);
        entrada.close();



        // Obtener la instancia de la operación correspondiente según el operador
        Operaciones operacionSeleccionada = operacionesMap.get(operador);

        // Realizar la operación y mostrar el resultado
        if (operacionSeleccionada != null) {
            double resultado = operacionSeleccionada.realizarOperacion(num1, num2);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operador no válido.");
        }
    }
}
