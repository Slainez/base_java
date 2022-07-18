package poo;

public class User {
    //Attributs
    private String nom;
    private String prenom ;
    private String situationMaritale ;
    private int nombreEnfants ;

    public User(String nom , String prenom , String situationMaritale , int nombreEnfants){
        this.nom = nom ;
        this.prenom = prenom ;
        this.situationMaritale = situationMaritale ;
        this.nombreEnfants = nombreEnfants ;
    }

    // Getters

    public String getNom(){
        return nom ;
    }
    public String getPrenom(){
        return prenom ;
    }
    public String getSituationMaritale(){
        return situationMaritale ;
    }
    public int getNombreEnfants(){
        return nombreEnfants ;
    }

    // Setters

    public void setSituationMaritale(String situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    // autres methodes

    public String getCompleteName(){
        return prenom + " " + nom ;
    }
}
