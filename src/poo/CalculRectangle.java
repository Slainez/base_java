package poo;

public class CalculRectangle {

    private int longueur ;
    private int largeur ;


    public int getLongueur(){
        return longueur ;
    }
    public int getLargeur(){
        return largeur ;
    }

    public void setLongueur(int longueur){
        this.longueur = longueur;
    }
    public void setLargeur(int largeur){
        this.largeur = largeur;
    }

    public int calculPerimetre(){
        return longueur+largeur*2;
    }
    public int calculAire(){
        return longueur*largeur;
    }
}
