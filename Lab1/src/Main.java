//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc,num1,num2;

        do {
            System.out.println("------------------------------");
            System.out.println("BIENVENIDO");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACIÓN");
            System.out.println("4. DIVISIÓN");
            System.out.println("5. SALIR");
            System.out.println("------------------------------");

            System.out.println("\nIngrese el numero de operacion que desea realizar");
            opc = scanner.nextInt();

            switch (opc){

                case 1:
                    //SUMA
                    System.out.println("Ingrese el primer numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = scanner.nextInt();
                    SUMA(num1, num2);
                    System.out.println("La respuesta es:" + SUMA(num1,num2));
                    break;

                case 2:
                    //RESTA
                    System.out.println("Ingrese el primer numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = scanner.nextInt();
                    RESTA(num1,num2);
                    System.out.println("La respuesta es:" + RESTA(num1,num2));
                    break;

                case 3:
                    //MULTIPLICACION
                    System.out.println("Ingrese el primer numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = scanner.nextInt();
                    MULT(num1,num2);
                    System.out.println("La respuesta es: " + MULT(num1,num2));
                    break;

                case 4:
                    //DIVISION
                    System.out.println("Ingrese el primer numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = scanner.nextInt();
                    DIV(num1,num2);
                    System.out.println("La respuesta es: " + DIV(num1,num2));
                    break;

                case 5:
                    //SALIR
                    System.out.println("Muchas gracias :) ");
                    break;

                default:
                    System.out.println("Indique una opccion valida por favor");
            }
        }while (opc != 5);
        }
        public static int SUMA(int num1 , int num2){
        return  num1 + num2 ;
        }
        public static  int RESTA(int num1 , int num2){
        return  num1 - num2;
        }
        public static  int MULT(int num1 , int num2){
        return  num1 * num2;
        }
        public static int DIV(int num1 , int num2) {
            if (num2 == 0) {
                System.out.println("SYNTAX ERROR");
            }
            return num1/num2;     }
    }
