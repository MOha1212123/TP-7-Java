package TP7;

public class Parti2  {

    public static double lireMontant(String valeur) {

        try {

            double montant = Double.parseDouble(valeur);

            // التحقق من القيمة السالبة
            if (montant < 0) {

                throw new IllegalArgumentException(
                        "Montant négatif interdit");
            }

            return montant;

        }

        catch (NumberFormatException e) {

            System.out.println("Erreur : valeur non numérique");
        }

        catch (IllegalArgumentException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        return 0;
    }

    public static void main(String[] args) {

        double m1 = lireMontant("150");
        System.out.println("Montant : " + m1);

        double m2 = lireMontant("abc");
        System.out.println("Montant : " + m2);

        double m3 = lireMontant("-50");
        System.out.println("Montant : " + m3);
    }
}