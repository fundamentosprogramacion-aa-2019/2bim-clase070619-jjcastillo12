/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo3 {

    /*Generar un programa que permita determinar el numero de vocales utilizadas
    por un usuario en un conjunto de palabras de acuerdo al primer caracter
    Reporte Final     
    Vocal a - numero de veces usada: ?
    Vocal e - numero de veces usada: ?
    Vocal i - numero de veces usada: ?
    Vocal o - numero de veces usada: ?
    Vocal u - numero de veces usada: ?
     */
    public static void main(String[] args) {
        //Scanner para uso de datos
        Scanner entrada = new Scanner(System.in);
        //Reporte que aparecera al final del programa
        String reporteFinal = "";
        //Arreglos
        String[] vocales = {"a", "e", "i", "o", "u"};
        int[] contador = new int[5];
        //Variables
        String palabra = "";

        boolean bandera = true;
        int salir;
        //Ciclo repetitivo para preguntar al usuario datos y pedir si quiere salir
        while (bandera == true) {
            System.out.println("Ingrese la palabra que desea contabilizar");
            palabra = entrada.nextLine();
            //Uso del char para capturar la primera inicial de la palabra
            char vocal = palabra.charAt(0);
            //Uso del switch para operar las palabras introducidas por teclado
            switch (vocal) {
                case 'A':
                case 'a':
                    contador[0] = contador[0] + 1;
                    break;
                case 'E':
                case 'e':
                    contador[1] = contador[1] + 1;
                    break;
                case 'I':
                case 'i':
                    contador[2] = contador[2] + 1;
                    break;
                case 'O':
                case 'o':
                    contador[3] = contador[3] + 1;
                    break;
                case 'U':
                case 'u':
                    contador[4] = contador[4] + 1;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            System.out.println("Desea salir del ciclo, ingrese el numero 0");
            salir = entrada.nextInt();
            if (salir == 0) {
                bandera = false;
            }
            //Limpieza del scanner
            entrada.nextLine();
        }
        //Reporte con el encabezado del informe
        reporteFinal = String.format("%sReporte de notas\n", reporteFinal);
        //Uso del ciclo repetitivo para operar cuantas palabras se hayan introducido
        for (int i = 0; i < contador.length; i++) {
            //Reporte concatenado 
            reporteFinal = String.format("%s Vocal %s - número de veces usada: %d\n",
                    reporteFinal, vocales[i], contador[i]);
        }
        //Impresion de datos
        System.out.printf("%s\n", reporteFinal);
    }

}
