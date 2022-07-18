package poo.tppoo;

public class Souris {
    private final int ESPERANCE_DE_VIE = 36;
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;

    private boolean cloned;

    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_DE_VIE;
        this.cloned = false;

        System.out.println("Une nouvelle souris");
    }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0;
        this.esperanceVie = ESPERANCE_DE_VIE;
        this.cloned = false;

        System.out.println("Une nouvelle souris");
    }

    public Souris(Souris souris) {
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = 0;
        this.esperanceVie = (ESPERANCE_DE_VIE * 4) / 5;
        this.cloned = true;

        System.out.println("Clonage d'une souris");
    }


    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString () {
        String estClone = cloned ? "clonée," : "";
        return String.format(" Une souris %s,%s de %d mois et pesant %d grammes", couleur, estClone, age, poids);
    }

    public void vieillir () {
        this.age++;
        if ((this.cloned) &&(this.age >= (esperanceVie / 2))) {
            this.couleur = "Verte";
        }
    }

    public void evolue () {
        while (this.age < this.esperanceVie) {
            this.vieillir();
        }
    }
}


