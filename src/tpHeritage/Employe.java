package tpHeritage;

 public class Employe extends Person {
    private String nomLaboratoireOuInstitut ;
    private String role;
    private int salaire ;

    public Employe(int identifiant, int annee , String nom , String nomLaboratoireOuInstitut,String role,int salaire){
        super(identifiant,annee,nom);
        this.nomLaboratoireOuInstitut = nomLaboratoireOuInstitut ;
        this.role = role ;
        this.salaire = salaire ;
    }

     public String getNomLaboratoireOuInstitut() {
         return nomLaboratoireOuInstitut;
     }

     public void setNomLaboratoireOuInstitut(String nomLaboratoireOuInstitut) {
         this.nomLaboratoireOuInstitut = nomLaboratoireOuInstitut;
     }

     public String getRole() {
         return role;
     }

     public void setRole(String role) {
         this.role = role;
     }

     public int getSalaire() {
         return salaire;
     }

     public void setSalaire(int salaire) {
         this.salaire = salaire;
     }

     @Override
    public boolean isEtudiant() {
        return false;
    }
     @Override
     public String toString() {
         return String.format("%s\n",role) + super.toString()+ String.format("Salaire : %s\nLaboratoire : %s\n",salaire ,nomLaboratoireOuInstitut);
     }
}
