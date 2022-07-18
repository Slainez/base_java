package tpHeritage;

abstract public class Person {
    private int identifiant ;
    private int annee ;
    private String nom ;


    public Person(int identifiant,int annee, String nom) {
        this.identifiant = identifiant;
        this.annee = annee;
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }


    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return String.format("Nom : %s\nAnnee: %d\n",nom,annee);
    }
    public abstract boolean isEtudiant();

}
