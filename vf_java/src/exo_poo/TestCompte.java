package exo_poo;

public class TestCompte {
    public TestCompte(double solde) {
    }

    public static void testCompte(double solde) {
        Compte c1 = new Compte(solde);
        c1.afficher(solde);
        Compte c2 = new Compte(solde-50);
        Compte.displayNbObjets();
    }
}
