
import java.util.Random;
import java.util.Scanner;

// Activitat 30 — Pedra, paper o tisora, a 3 victòries
public class PedraPaperTisoraA3 {

    public static void main(String[] args) {
        // TODO: amb un bucle while, la condició del qual combini "l'ordinador té
        //   menys de 3 victòries" I "l'usuari té menys de 3 victòries" (condició
        //   d'acabament complexa, sense break):
        //     demana la jugada de l'usuari (pedra/paper/tisora)
        //     genera la jugada de l'ordinador (Random: 0=pedra, 1=paper, 2=tisora)
        //     decideix qui guanya la ronda (o si empaten) i actualitza els
        //     comptadors de victòries
        //     mostra el resultat de la ronda i el marcador
        //   Quan acabi el bucle (algú ha arribat a 3 victòries), mostra qui ha
        //   guanyat la partida
        Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();

        int usuariWin = 0;
        int ordinadorWin = 0;

        String jugadaUsuari;
        String jugadaOrdinador;

        while (usuariWin < 3 && ordinadorWin < 3) {
            System.out.println("Entra pedra, paper o tisora: ");
            jugadaUsuari = teclat.next().toLowerCase();
            if (!jugadaUsuari.equals("pedra") && !jugadaUsuari.equals("paper") && !jugadaUsuari.equals("tisora")) {
                System.out.println("Jugada no vàlida, torna-ho a provar.");
            } else {
                int numero = aleatori.nextInt(3);
                if (numero == 0) {
                    jugadaOrdinador = "pedra";
                } else if (numero == 1) {
                    jugadaOrdinador = "paper";
                } else {
                    jugadaOrdinador = "tisora";
                }

                if (jugadaUsuari.equals("pedra") && jugadaOrdinador.equals("pedra")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    System.out.println("Heu empatat!! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else if (jugadaUsuari.equals("paper") && jugadaOrdinador.equals("paper")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    System.out.println("Heu empatat!! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else if (jugadaUsuari.equals("tisora") && jugadaOrdinador.equals("tisora")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    System.out.println("Heu empatat!! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else if (jugadaUsuari.equals("pedra") && jugadaOrdinador.equals("tisora")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    usuariWin++;
                    System.out.println("Has guanyat! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else if (jugadaUsuari.equals("paper") && jugadaOrdinador.equals("pedra")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    usuariWin++;
                    System.out.println("Has guanyat! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else if (jugadaUsuari.equals("tisora") && jugadaOrdinador.equals("paper")) {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    usuariWin++;
                    System.out.println("Has guanyat! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);
                } else {
                    System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                    ordinadorWin++;
                    System.out.println("Has perdut! Ordinador: " + ordinadorWin + " , tú: " + usuariWin);

                }
            }

        }
        if (usuariWin >= 3) {
            System.out.println("Has guanyat la partida!");
        } else {
            System.out.println("Has perdut la partida!");
        }
        //al corregir he visto que podia haber puesto jugadaUsuari.equals(jugadaOrdinador)
        //y poner el ordinador ha tret... una sola vez, pero ya lo dejo asi, lo tendre en cuenta

    }
}
