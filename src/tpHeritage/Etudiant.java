package tpHeritage;


abstract public class Etudiant extends Person {

    private String nomDeSection ;

    public Etudiant(int identifiant, int annee , String nom , String nomDeSection){
        super(identifiant,annee,nom);
        this.nomDeSection = nomDeSection ;
    }

    @Override
    public boolean isEtudiant() {
        return true;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Nom de section: %s\n",nomDeSection);
    }


}
