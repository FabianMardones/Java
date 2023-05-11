package Clase02;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
        public static void main(String[] args){

            System.out.println("Buscador de números primos");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su número");
            int numero = scanner.nextInt();

            esPrimo(numero);
        }
        public static void esPrimo (int numero){

            if (numero == 2 || numero == 3 || numero == 5 || numero == 7){
                System.out.println(numero + " Es primo");
            }
            else if (numero == 1 || numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0){
                System.out.println(numero + " No es primo");
            }
            else {
                System.out.println(numero + " Es primo");
            }
        }
}
