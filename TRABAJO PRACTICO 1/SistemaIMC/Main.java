import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    /**
     *
     */
    private static final Scanner SCANNER = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X CONOCE TU INDICE DE MASA CORPORAL X");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        DecimalFormat df = new DecimalFormat("###,###.#");

        System.out.println("ingrese el valor del peso:");
        double peso = SCANNER.nextDouble();

        System.out.println("ingrese el valor de la altura:");
        double altura = SCANNER.nextDouble();

        double alturaAlCuadrado = Math.pow(altura, 2);
        double imc = peso / alturaAlCuadrado;

        System.out.println("Su indice de masa corporal es:" + df.format(imc));

        /* valores para testing */
        /* peso     altura      estado */
        /* 40       1.70        delgadez muy severa */
        /* 45       1.70        delgadez severa */
        /* 50       1.70        delgadez */
        /* 65       1.70        peso correcto */
        /* 75       1.70        sobrepeso */
        /* 90       1.70        obesidad moderada */
        /* 105      1.70        obesidad severa */
        /* 40       1.70        obesidad mórbida */
        if (imc <= 15) {
            System.out.println(Colores.ANSI_RED);
            System.out.println("""
                
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Delgadez muy severa X");
            System.out.println("X X X X X X X X X X X X X X X X X X X");
        }
        if (imc >= 15 && imc <= 15.9) {
            System.out.println(Colores.ANSI_PURPLE);
            System.out.println("""
                
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);

            System.out.println("X X X X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Delgadez severa X");
            System.out.println("X X X X X X X X X X X X X X X X X");
        }
        if (imc >= 16 && imc <= 18.4) {
            System.out.println(Colores.ANSI_YELLOW);
            System.out.println("""             
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Delgadez. X");
            System.out.println("X X X X X X X X X X X X X X");
        }
        if (imc >= 18.5 && imc <= 24.9) {
                        System.out.println(Colores.ANSI_GREEN);
            System.out.println("""

                ░░░░░░░░░░░░░░░░░░░░░░█████████
    ░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███
    ░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███
    ░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
    ░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███
    ░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██
    ░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
    ░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██
    ░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██
    ██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██
    █▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██
    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
    ░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
    ░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█
    ░░████████████░░░█████████████████
                    """);
            System.out.println("X X X X X X X X X X X X X X X X X X");
            System.out.println("X Usted está en el peso correcto. X");
            System.out.println("X X X X X X X X X X X X X X X X X X");
        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println(Colores.ANSI_YELLOW);
            System.out.println("""             
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Sobrepeso X");
            System.out.println("X X X X X X X X X X X X X X");
        }
        if (imc >= 30 && imc <= 34.9) {
            System.out.println(Colores.ANSI_BLUE);
            System.out.println("""             
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Obesidad moderada X");
            System.out.println("X X X X X X X X X X X X X X X X X X");
        }
        if (imc >= 35 && imc <= 39.9) {
            System.out.println(Colores.ANSI_PURPLE);
            System.out.println("""             
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Obesidad severa X");
            System.out.println("X X X X X X X X X X X X X X X X X");
        }
        if (imc >= 40) {
            System.out.println(Colores.ANSI_RED);
            System.out.println("""             
                  §§                     
                 §§§§                   
                §§  §§
               §§    §§
              §§  §§  §§
             §§   §§   §§
            §§    §§    §§
           §§     §§     §§
          §§              §§
         §§       §§       §§
        §§                  §§
       §§§§§§§§§§§§§§§§§§§§§§§§
                    """);
            System.out.println("X X X X X X X X X X X X X X X X X X");
            System.out.println("X Su estado es: Obesidad Mórbida. X");
            System.out.println("X X X X X X X X X X X X X X X X X X");
        }
        System.out.println(Colores.ANSI_RESET);
    }
}