package poo.tppoo;

public class Main {
    public static void main(String[] args) {
        // Exercice du patient

        Patient firstPatient = new Patient(71.2,1.70);
        System.out.printf("Le patient mesure %F et pese %F : \n Son IMC est donc de %F",firstPatient.getTaille(),firstPatient.getPoids(),firstPatient.calculImc());
       // Exercice des souris
        Souris s1 = new Souris(50,"blanche",2);
        Souris s2 = new Souris(45,"grise");
        Souris s3 = new Souris(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

//        s1.vieillir();
//        s2.vieillir();
//        s3.vieillir();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
