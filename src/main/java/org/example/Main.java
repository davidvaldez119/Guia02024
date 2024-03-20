package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //ejercico8 guia 0
        System.out.println("ingrese nombre :.....");
        Scanner sl =new Scanner(System.in);
        String name =sl.next();
        System.out.println( name );

        */
        /*
         //ejercicio9

        System.out.println("ingrese un numero:.....");
        Scanner num =new Scanner(System.in);
        Integer nume=num.nextInt();
        Integer doble=2*nume;
        Integer triple=3*nume;
        System.out.println("el doble es:.... "+doble +"   "+"el triple es:... "+triple);
          */

        //ejercicio10
        /*
        System.out.println("ingrese los grados farenheith:.....");
        Scanner num =new Scanner(System.in);
        double nume=num.nextInt();
        double f=( (nume-32)*5)/9;
        System.out.println("grados celcius :   "+f );
         */
        //ejercicio11
       /*
        System.out.println("ingrese el radio de circunferencia:.....");
        Scanner num =new Scanner(System.in);
        double radio=num.nextInt();
        double p=2*(3.1416)*radio;
        double a=(3.1416)*radio*radio;
        System.out.println("perimetro circunferencia :..."+p+" area: ...."+a );
         */
        //regionejercicio17




        System.out.println("ingrese el numero:.....");
        Scanner scaner = new Scanner(System.in);
        Integer num = scaner.nextInt();
        String str = num.toString();


        for (Integer i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        }

        //endregion


    }
}