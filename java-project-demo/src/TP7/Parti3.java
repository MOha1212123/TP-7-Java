package TP7;

public class Parti3 {

    public static double lireMontant(String valeur)
            throws NumberFormatException,
                   IllegalArgumentException {

        double montant = Double.parseDouble(valeur);

        if (montant < 0) {

            throw new IllegalArgumentException(
                    "Montant négatif interdit");
        }

        return montant;
    }

    public static void main(String[] args) {

        try {

            double m1 = lireMontant("150");
            System.out.println("Montant : " + m1);

            double m2 = lireMontant("abc");
            System.out.println("Montant : " + m2);

            double m3 = lireMontant("-50");
            System.out.println("Montant : " + m3);

        }

        catch (NumberFormatException e) {

            System.out.println(
                    "Erreur : valeur non numérique");
        }

        catch (IllegalArgumentException e) {

            System.out.println(
                    "Erreur : " + e.getMessage());
        }
    }
}
