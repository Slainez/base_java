package tpHeritage;

public class EtudiantEchange extends Etudiant {
    private String universiteOriginelle  ;

    public EtudiantEchange(int identifiant, int annee , String nom , String nomDeSection,String universiteOriginelle){
        super(identifiant,annee,nom,nomDeSection);
        this.universiteOriginelle = universiteOriginelle ;
    }

    public String getUniversiteOriginelle() {
        return universiteOriginelle;
    }

    public void setUniversiteOriginelle(String universiteOriginelle) {
        this.universiteOriginelle = universiteOriginelle;
    }
    @Override
    public String toString() {
        return "Etudiant d'echange \n" + super.toString()+ String.format("Universite d'origine : %s\n",universiteOriginelle);
    }
}

