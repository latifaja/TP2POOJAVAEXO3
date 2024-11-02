import java.util.ArrayList;

public class Client {
    private String nom, prénom, adresse, email, ville, téléphone;
    private ArrayList<Commande> commandes;

    public Client(String nom, String prénom, String adresse, String email, String ville, String téléphone, ArrayList<Commande> commandes) {
        this.nom = nom;
        this.prénom = prénom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.téléphone = téléphone;
        this.commandes = commandes;
    }

    public void ajouterCommande(Commande cm){

    for (Commande com : commandes) {
        if (cm.getRéférence()!=com.getRéférence()){
        commandes.add(cm);
    }}}
    public void supprimerCommande(Commande cm){
        for (Commande com : commandes) {
            if (cm.getRéférence() == com.getRéférence()) {
            commandes.remove(com);
        }}
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public String getTéléphone() {
        return téléphone;
    }

    public String getVille() {
        return ville;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPrénom() {
        return prénom;
    }

    public String getNom() {
        return nom;
    }
}
