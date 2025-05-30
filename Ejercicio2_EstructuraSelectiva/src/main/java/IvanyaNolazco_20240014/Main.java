package IvanyaNolazco_20240014;

import java.util.Scanner;
//Determina si un número es par o impar
public class Main {
    public static void main(String[] args)
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        String entrada = sc.nextLine();
        num = Integer.parseInt(entrada);

        String resultado = verificar(num);

        System.out.println(resultado);


    }
    public static String verificar(int numero){
        if (numero % 2 == 0){
            return "El numero es par";
        }else{
            return "El numero es impar";
        }

    }
}