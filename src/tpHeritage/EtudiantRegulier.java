package tpHeritage;

public class EtudiantRegulier extends Etudiant {
    private double noteMoyenne ;

    public EtudiantRegulier(int identifiant, int annee , String nom , String nomDeSection,double noteMoyenne){
        super(identifiant,annee,nom,nomDeSection);
        this.noteMoyenne = noteMoyenne;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }
    @Override
    public String toString() {
        return "Etudiant Regulier \n" + super.toString()+ String.format("Note moyenne : %.1f\n",noteMoyenne);
    }
}
