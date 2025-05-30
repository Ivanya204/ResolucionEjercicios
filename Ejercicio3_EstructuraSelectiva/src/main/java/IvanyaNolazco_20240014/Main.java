package IvanyaNolazco_20240014;

import java.util.Scanner;

//Calculadora Simple
public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int op;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        String num1 = sc.nextLine();
        numero1 = Integer.parseInt(num1);

        System.out.println("Ingrese el segundo valor");
        String num2 = sc.nextLine();
        numero2 = Integer.parseInt(num2);

        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        op = sc.nextInt();
        switch (op){
            case 1: {
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            }
            case 2: {
                resultado = numero1-numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            }
            case 3:{
                resultado = numero1*numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            } case 4:{
                resultado = numero1/numero2;
                System.out.println("El resultado de la división es: " + resultado);
                break;
            } default:{
                System.out.println("Ingrese un número, no una letra");
                break;
            }
        }



    }
}