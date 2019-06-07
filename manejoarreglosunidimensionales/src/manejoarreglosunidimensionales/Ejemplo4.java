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
public class Ejemplo4 {

    public static void main(String[] args) {
        //Scanner para entrada de datos
        Scanner entrada = new Scanner(System.in);
        //Cadena para presentar el reporte
        String reporteFinal = "";
        //Arreglos
        String[] peliculas = {"Comedia", "Terror", "Drama", "Familiar"};
        int[] tipoPeliculas = new int[4];
        //variables
        int preferencia;
        int casos = 4;
        String aterisco = "";
        boolean bandera = true;
        /*Uso de la bandera para pedir datos al usuario y preguntarle si 
        desea seguir con la ejecucion del programa*/
        while (bandera == true) {
            System.out.println("Que preferencias de peliculas tiene:\n"
                    + "Comedia=0\nTerror=1\nDrama=2\nFamiliar=3");
            preferencia = entrada.nextInt();
            //Uso del switch para asignar valores a los arreglos
            switch (casos) {
                case 1:
                    if (preferencia == 0) {
                        tipoPeliculas[0] = tipoPeliculas[0] + 1;
                    }
                    break;
                case 2:
                    if (preferencia == 1) {
                        tipoPeliculas[1] = tipoPeliculas[1] + 1;
                    }
                    break;
                case 3:
                    if (preferencia == 2) {
                        tipoPeliculas[2] = tipoPeliculas[2] + 1;
                    }
                    break;
                case 4:
                    if (preferencia == 3) {
                        tipoPeliculas[3] = tipoPeliculas[3] + 1;
                    }
                    break;
            }
            //Salida del bucle si el lo usuario lo pide
            int salir;
            System.out.println("Desea salir del ciclo, ingrese el numero 0");
            salir = entrada.nextInt();
            if (salir == 0) {
                bandera = false;
            }

        }
        //Cadena que presenta el prime encabezado del reporte
        reporteFinal = String.format("Reporte de preferencias de películas",
                reporteFinal);
        //Ciclo repetitivo para asignar valores a las posiciones del arreglo
        for (int i = 0; i < tipoPeliculas.length; i++) {
            int j = tipoPeliculas[i];

            for (int k = 0; k < j; k++) {
        // Aqui se empieza a trabajar para que en el resultado se presente un asterisco        
                aterisco = String.format("%s*", aterisco);
            }
            //Concatenacion de cadenas
            reporteFinal = String.format("%s\n%s = %s",
                    reporteFinal, peliculas[i], aterisco);
        }
        //Impresión de dartos
        System.out.printf("%s\n", reporteFinal);
    }
}
