package exo_poo;

public class Compte {
    // declaration
    // attibut ---------------------------------------------------
    public double solde; // money

    // static ----------------------------------------------------------
    private static int nbOjects; //create var count
    static {nbOjects = 0;} // init counter

    //constance ------------------------------------------------------

    //builder --------------------------------------------------------
    public Compte(){nbOjects++;} // count nb objet

    public Compte(double pSolde){
        this.solde = pSolde;
        nbOjects++;
        afficher(this.solde);
    }


    //getter setter -----------------------------------------------

    //method static ------------------------------------------------
    public static void displayNbObjets() {
        System.out.println("NumberOfObjet: " + nbOjects);
    }

    public double deposer(double deposit){
        this.solde  = solde + deposit;
        afficher(this.solde);
        return solde;
    }

    public double retirer(double withdraw){
        this.solde = solde - withdraw;
        afficher(this.solde);
        return solde;
    }

    public void afficher(double solde){
        System.out.println(solde);
    }

    //method private
    //method public

    //metier

}
