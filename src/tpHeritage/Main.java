package tpHeritage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var chrisLis = new EtudiantRegulier(01,2013,"Chris Lisangola","Physique",12.00);
        var jihChed = new EtudiantRegulier(02,2011,"Jihane Cheddadi","Math Informatique",19.40);
        var bjoCDF = new EtudiantEchange(03,2012,"Bjorn cote de Fer","Physique","Paris 40");
        var zZKB9 = new Enseignant(04,1998,"Zinedine Benzema","Physique","Enseignant",5000,"Physique");
        var christLisa = new Employe(05,2005,"Christiane Lisangolanne","Chimie","Secretaire",5000);

        ArrayList<Person> listPersonne = new ArrayList<>();
        listPersonne.add(chrisLis);
        listPersonne.add(jihChed);
        listPersonne.add(bjoCDF);
        listPersonne.add(zZKB9);
        listPersonne.add(christLisa);

        int compteurEtudiant = 0 ;
        for(int i=0;i<=listPersonne.size()-1;i++) {
            System.out.println(listPersonne.get(i));
            if(listPersonne.get(i).isEtudiant()){
                compteurEtudiant++;
            }
        }
        System.out.printf("Le nombre de personne est de %d dont %d etudiants",listPersonne.size(),compteurEtudiant);

    }
}
