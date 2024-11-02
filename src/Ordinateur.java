public class Ordinateur {
   private String nom, marque, description ;
   private float prix;
   private int nombreEnStock;


    public Ordinateur(String nom, String marque, String description, float prix, int nombreEnStock) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nombreEnStock = nombreEnStock;


    }

    public float  prixPourQuantite(int quantite){
    return quantite * prix;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public String getDescription() {
        return description;
    }

    public float getPrix() {
        return prix;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }
}

