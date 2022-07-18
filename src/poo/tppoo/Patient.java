package poo.tppoo;

public class Patient {
    private double taille ;
    private double poids ;
    private double imc ;

    public Patient (double poids , double taille){
        this.poids=poids;
        this.taille=taille;
    }

    public double getTaille(){
        return taille ;
    }
    public double getPoids(){
        return poids ;
    }

    public double calculImc(){
        return poids/taille*taille;
    }
}
