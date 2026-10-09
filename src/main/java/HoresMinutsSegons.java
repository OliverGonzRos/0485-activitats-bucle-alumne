// Activitat 05 — Hores, minuts i segons, en bucle

import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: repeteix 4 vegades (amb un bucle):
        //   demana els segons per teclat i mostra les hores, minuts i segons que representen
        //   Hores  = segons / 3600
        //   Minuts = (segons % 3600) / 60
        //   Segons = segons % 60

    Scanner teclat = new Scanner(System.in);
    int i = 0;   
    while (i<4)  {
    System.out.println("Entra el número de segons: ");
    int segons = teclat.nextInt();

        int hores = segons / 3600;
        System.out.println("Hores:"+ hores);
        segons = segons % 3600;

        int minuts = segons / 60;
        System.out.println("Minuts:"+ minuts);
        segons = segons % 60;
        System.out.println("Segons:"+ segons);
        i++;
    }
    }
}
