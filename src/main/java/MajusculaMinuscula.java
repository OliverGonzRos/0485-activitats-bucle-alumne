
import java.util.Scanner;

// Activitat 09 — Majúscula, minúscula o no és una lletra
public class MajusculaMinuscula {
    public static void main(String[] args) {
        // TODO: demana 10 cops per teclat un caràcter (amb un bucle) i digues si és
        //   una lletra majúscula, una lletra minúscula, o no és una lletra
        //   Pots comparar el codi Unicode: 'A'..'Z' majúscules, 'a'..'z' minúscules
        Scanner teclat = new Scanner(System.in);
        int i=0;


        while (i<10) {
          System.out.println("Introdueix un caràcter: ");
          char lletra = teclat.next().charAt(0);
          if (lletra >= 'A' && lletra <= 'Z') {
            System.out.println("És una lletra majúscula");
        } else
          if (lletra >= 'a' && lletra <= 'z') {
             System.out.println("És una lletra minúscula");
        }
        else {System.out.println("No és una lletra");}
        i++;
        }

       
    


    }
}
