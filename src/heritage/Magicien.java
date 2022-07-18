package heritage;

public class Magicien extends Personnage{

    private String baguette;

    public Magicien(String nom, int dureeDeVie, String baguette) {
        super(nom,dureeDeVie);
        this.baguette = baguette;
    }

    public String getBaguette() {
        return baguette;
    }

    public void setBaguette(String baguette) {
        this.baguette = baguette;
    }

    public void rencontrer(){
        System.out.println("Je vais te faire disparaitre");
    }
    public String toString(){
        return super.toString()+String.format("Baguette: %s",this.baguette);
    }


}

