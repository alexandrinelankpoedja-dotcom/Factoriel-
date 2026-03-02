
import java.util.Scanner;

public class Factoriel {

    public static long factoriel(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factoriel(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erreur : le factoriel n'est pas défini pour les entiers négatifs.");
        } else {
            long resultat = factoriel(n);
            System.out.println(n + "! = " + resultat);
        }

        scanner.close();
    }