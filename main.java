package src.java; // Define donde se encuentra el archivo

import java.util.InputMismatchException;
import java.util.Scanner;
// Al estar en la misma carpeta no hace falta usar import src.java.zeller;

public class main {
    public static void main(String[] args) {
        try (Scanner key = new Scanner(System.in);) { // Un try que usa una orden como argumento, este inicia el objeto y al final de su ejecución lo cierra
            String[] quotes = null; // Le dice al compilador que esta variable recibira un valor tarde o temprano
            System.out.println("1. English / 2. Español");
            int lang = key.nextInt(); // Input
            if ((lang != 1) && (lang != 2)) { // Si falla el idioma corta
                System.out.println("That's not a posible option / Esa no es una opción posible");
                System.exit(-1);
            }
            if (lang == 1) { // Defino listas con las frases que se diran dependiendo del idioma
                quotes = new String[] {"Give the numeric day", "Give me the numeric month",
                "Give me the last 2 numbers of the year", "Finally I need the 2 first numbers of the year",
                "The result is ", ", AKA ", };
            }
            else if (lang == 2) {
                quotes = new String[] {"Dame el dia numerico", "Dame el mes numerico",
                "Dame los 2 ultimos numeros del año", "Finalmente necesito los 2 primeros numeros del año",
                "El resultado es ", ", que seria ",};
            }
            System.out.println(quotes[0]);
            int q = key.nextInt();
            System.out.println(quotes[1]);
            int w = key.nextInt();
            System.out.println(quotes[2]);
            int k = key.nextInt();
            System.out.println(quotes[3]);
            int j = key.nextInt();
            zeller capstone = new zeller(lang, q, w, k, j);
            capstone.check();
            int h = capstone.zellercalc();
            String h_name = capstone.day(h);
            System.out.println(quotes[4] + h + quotes[5] + h_name);
        }
        catch(InputMismatchException e){ // ValueErrors en python
            System.err.println("You have introduce a wrong type of value / Has introducido un valor equivocado");
            System.err.println(e);
            System.exit(-1);
        }
    }
}