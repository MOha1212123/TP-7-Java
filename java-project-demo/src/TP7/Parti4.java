package TP7;

public class Parti4 {
    public static double lireTransaction(double[] tab, int index) {

        return tab[index];
    }
    public static void main(String[] args) {
        double[] transactions = {100, 200, 300};
        try {
            double t = lireTransaction(transactions, 5);

            System.out.println("Transaction : " + t);
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Erreur : indice invalide");
        }
        catch (NullPointerException e) {

            System.out.println(
              "Erreur : tableau non initialisé");
        }
    }
}