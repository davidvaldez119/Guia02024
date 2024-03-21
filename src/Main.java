import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*region
    //ejercicio1

    int N = 10;
    double a=12.5;
    char c='A';
     double add= N+a;
     double sus= N-a;
        System.out.print(add+"  "+sus+"  "+c);
     /*endRegion*/
       /*region
     //ejercicio2
      int x=10;
      int y=12;
      double n,m;
      n=13.5;
      m=10.75;
        double res =n-m-x-y;
        double div=m+n+x+y/n;

        System.out.println("suma :"+ n+m+x+y  +" multiplicacion: " + n*m*x*y  );
        System.out.println("resta "+res + " division : "+div );

     /*endRegion*/
      /*region
      //ejercicio3

        int N=60;
        System.out.println("resultado :"+ ((N+77)-3)*2);

      /*endRegion*/
      /*region
      //ejercicio4
        int A=10;
        int B=12;
        int C=34;
        int D=21;
        B=C;
        C=A;
        A=D;
        D=B;
        System.out.println("a :"+A+" ,b :"+B+" ,c :"+C+" ,d :"+D );

       /*endregion*/

        //ejercico5
       /*region
        int a=14;
        boolean par=false;
        if(a %2 ==0){
                      par=true;
                    }
        System.out.println("si es par true si es false no es par...: "+ par);
         /*endRegion*/

        //ejercicio6
        /*int a=14;
        if(a>0){
            System.out.println("mayor a cero");
               }else {
            System.out.println("menor a cero");
        }
*/
        }
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

       /*


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
        */
    //regionejercicio16
    //ejercicio16


     System.out.println("ingrese el numero:.....");

    Scanner scanner=new Scanner(System.in);
    Integer num = scanner.nextInt();
    String str=num.toString();

    for (Integer i=0; i<2 ; i++){

        System.out.println(str.charAt(i));
    }
//endregion
    }
