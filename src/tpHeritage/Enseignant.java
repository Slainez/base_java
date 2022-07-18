package tpHeritage;

public class Enseignant extends Employe {
    private String sectionEnseignement ;

    public Enseignant (int identifiant, int annee , String nom , String nomLaboratoireOuInstitut,String role,int salaire,String sectionEnseignement){
        super( identifiant,  annee ,  nom ,  nomLaboratoireOuInstitut, role,salaire);
        this.sectionEnseignement = sectionEnseignement ;
    }

    public String getSectionEnseignement() {
        return sectionEnseignement;
    }

    public void setSectionEnseignement(String sectionEnseignement) {
        this.sectionEnseignement = sectionEnseignement;
    }
    @Override
    public boolean isEtudiant() {
        return false;
    }
    @Override
    public String toString() {
        return super.toString()+ String.format("section d'enseignement : %s\n",sectionEnseignement);
    }
}
