import java.util.ArrayList;

public class Catégorie {
    private String nom, description ;
    private ArrayList<Ordinateur> ordinaturs;

    public Catégorie(String nom, ArrayList<Ordinateur> ordinaturs, String description) {
        this.nom = nom;
        this.ordinaturs = ordinaturs;
        this.description = description;
    }

    public void ajouterOrdinateur(Ordinateur or){
        ordinaturs.add(or);
    }
    public void supprimerOrdinateur(Ordinateur or){
        ordinaturs.remove(or);
    }
    public ArrayList<Ordinateur> rechercherPrixOrdinateur(float prix){
         ArrayList<Ordinateur> a=new ArrayList<>();  //a must be initializer
        for (Ordinateur or : ordinaturs) {
            if (or.getPrix()==prix){
                a.add(or);

            }
        }
   return a; }
}
