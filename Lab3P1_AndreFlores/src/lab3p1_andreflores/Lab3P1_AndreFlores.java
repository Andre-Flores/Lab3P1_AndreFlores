package lab3p1_andreflores;

import java.util.Scanner;

public class Lab3P1_AndreFlores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" Menu");
            System.out.println("1 -> Diptongo");
            System.out.println("2 -> Sumatoria PI");
            System.out.println("3 -> Time clock");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    String palabra,
                     palabra2;
                    System.out.println(" Usted ha escogido la opcion de Diptongo");
                    System.out.println(" Ingrese la palabra");
                    palabra = leer.next();
                    palabra2 = palabra.toLowerCase();
                    int contador = 0;
                    for (int i = 0; i < palabra2.length(); i++) {
                        char letra = palabra2.charAt(i);
                        //  System.out.println(letra);
                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                contador++;
                                break;
                            default:
                                contador = 0;
                                break;
                        } // fin switch letra 
                        if (contador == 2) {

                            break;
                        }
                    }
                    if (contador == 2) {
                        System.out.println("si es");
                        break;
                    } else {
                        System.out.println("no es");
                    }
                    break;

                case 2:
                    System.out.println(" Usted ha escogido la opcion de Sumatoria");
                    double total = 0;

                    int limit = 0;
                    limit = leer.nextInt();
                    for (int i = 0; i < limit; i++) {
                        double arriba = Math.pow(-1, i);
                        double abajo = (2 * i) + 1;
                        total += arriba / abajo;

                    }
                    total *= 4;
                    System.out.println(total);
                    break;
                case 3:
                    System.out.println(" Usted ha escogido la opcion de Time clock");
                    int linea;
                    System.out.println(" ingrese numero de lineas:  ");
                    linea = leer.nextInt();
                    while (linea % 2 == 0) {
                        System.out.println(" Ingrese un numero IMPAR:  ");
                        linea = leer.nextInt();
                    }
                    int spaces = 0;
                    for (int i = 1; i <= (linea + 1) / 2; i++) {
                        for (int j = 1; j <= linea; j++) {

                            if ((j >= i && j < linea - i) || (j <= i) && j > spaces++) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } // fin otro for
                        if (i <= (linea + 1) / 2) {
                            spaces++;
                        } else {
                            spaces--;
                        }
                        System.out.println();

                    } // fin for linea 
                    for (int i = 1; i <= linea; i++) {
                        for (int j = 1; j <= linea; j++) {

                            if ((i >= j && i > linea - j) || (i <= j) && i > spaces++) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } // fin otro for
                        if (i <= (linea + 1) / 2) {
                            spaces++;
                        } else {
                            spaces--;
                        }
                        System.out.println();
                    }
            } // fin switch
        } // fin do
        while (opcion != 4);
    } // fin  main

} // fin class
