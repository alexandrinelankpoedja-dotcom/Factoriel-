public class MoyenneEtudiant {

    public static void main(String[] args) {

        // Déclaration des 3 notes
        double note1 = 12;
        double note2 = 9;
        double note3 = 14;

        // Calcul de la moyenne
        double moyenne = (note1 + note2 + note3) / 3;

        // Affichage de la moyenne
        System.out.println("La moyenne est : " + moyenne);

        // Condition
        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }

    }
}
