// Activitat 04 — Temperatures en bucle (quantitat per teclat)

import java.util.Scanner;

public class TemperaturaBucleN {
    public static void main(String[] args) {
        // TODO: demana quantes temperatures (N) vol convertir l'usuari
        //   i després, amb un bucle, llegeix N temperatures en Fahrenheit
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
         Scanner teclat = new Scanner(System.in);
         
        System.out.println("Quantes temperatures vols convertir? ");
        int temperatures = teclat.nextInt();
        int i = 0;
        while (i<temperatures) {
        
        System.out.println("Entra una temperatura en Fahrenheit: ");
        double temperatureF = teclat.nextDouble();
       
        double temperatureC = ((temperatureF - 32) * 5) / 9;
        System.out.println("La temperatura en graus Celsius es: " + temperatureC);
        i++;
        }
    }
}
