package src.calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Operaciones op = new Operaciones();
        double resultado = 0;

        System.out.println("Ingrese el primer numero que quiere operar: ");
        int n1 = in.nextInt();
        System.out.println("Ingrese el segundo numero que quiere operar: ");
        int n2 = in.nextInt();
        System.out.println("Ingrese la operacion que desea realizar(+,-,/,*): ");
        char operacion = in.next().charAt(0);
        in.close();

        switch(operacion){
            case '+':
            resultado = op.suma(n1, n2);
            break;
            case '-':
            resultado = op.resta(n1, n2);
            break;
            case '/':
            resultado = op.division(n1, n2);
            break;
            case'*': 
            resultado = op.multiplicacion(n1, n2);
            break;
        }
        System.out.println("El resultado es: "+ resultado);


    }
}