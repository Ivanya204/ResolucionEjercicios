package IvanyaNolazco_20240014;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número para verificar si es negativo o positivo");
        String entrada = scn.nextLine();
        if (entrada.matches("\\d+")){
            num = Integer.parseInt(entrada);
            if(num > 0){
                System.out.println("El número es positivo");

            }else if (num <0){
                System.out.println("El número es negativo");
            }else {
                System.out.println("El número colocado es cero");
            }

        }else{
            System.out.println("Ingrese un número, no una letra");
        }

    }

}