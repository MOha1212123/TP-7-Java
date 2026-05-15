package TP7;

public class exceptions {

    // Méthode de paiement
    public static double effectuerPaiement(double montant, double solde) {

        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être supérieur à zéro");
        }

        if (montant > solde) {
            throw new ArithmeticException("Solde insuffisant");
        }

        return solde - montant;
    }

    public static void main(String[] args) {

        double solde = 5000;

        try {

            double nouveauSolde = effectuerPaiement(1200, solde);

            System.out.println("Paiement effectué");
            System.out.println("Nouveau solde : " + nouveauSolde);

        } catch (IllegalArgumentException e) {

            System.out.println("Erreur de saisie : " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("Erreur de paiement : " + e.getMessage());

        } finally {

            System.out.println("Fin de la transaction");
        }
    }
}