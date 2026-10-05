
import java.util.Scanner;

// Activitat 01 — Temperatures en bucle
public class TemperaturaBucle {
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

        Scanner teclat = new Scanner(System.in);

        int i = 0;
        while (i<=4) {
        
        System.out.println("Entra una temperatura en Fahrenheit: ");
        double temperatureF = teclat.nextDouble();
       
        double temperatureC = ((temperatureF - 32) * 5) / 9;
        System.out.println("La temperatura en graus Celsius es: " + temperatureC);
        i++;
        }
    }
}
