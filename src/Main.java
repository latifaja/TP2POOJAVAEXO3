//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Ordinateur ordinateur1 = new Ordinateur("Ordinateur1", "MarqueA", "High-performance laptop", 1500.0f, 10);
        Ordinateur ordinateur2 = new Ordinateur("Ordinateur2", "MarqueB", "Gaming desktop", 2000.0f, 5);
        Ordinateur ordinateur3 = new Ordinateur("Ordinateur3", "MarqueC", "Ultra-portable laptop", 1200.0f, 8);

        ArrayList<Ordinateur> ordinateurs = new ArrayList<>();
        ordinateurs.add(ordinateur1);
        ordinateurs.add(ordinateur2);
        ordinateurs.add(ordinateur3);


        Catégorie catégorie = new Catégorie("Ordinateurs portables", ordinateurs, "Different types of laptops");

ArrayList<Commande> cmds = new ArrayList<>();
        Client cl =new Client("ali","aLA","SETTAT","a@A","SETTAT","06666",cmds);
Commande commande= new Commande("encore", new Date(),1);
cl.ajouterCommande(commande);
        LigneCommande ligneCommande1 = new LigneCommande(2, commande, ordinateur1);
        LigneCommande ligneCommande2 = new LigneCommande(1, commande, ordinateur2);
        LigneCommande ligneCommande3 = new LigneCommande(3, commande, ordinateur3);
        ArrayList<LigneCommande> lignesCommande = new ArrayList<>();
        lignesCommande.add(ligneCommande1);
        lignesCommande.add(ligneCommande2);
        lignesCommande.add(ligneCommande3);
        System.out.println("Informations de la commande : ");

        System.out.println("Référence de la commande : " + commande.getRéférence());
        System.out.println("État de la commande : " + commande.getEtatCommande());
        System.out.println("Date de la commande : " + commande.getDateCommande());

        System.out.println("\nClient :");
        System.out.println("Nom : " + cl.getNom() + " " + cl.getPrénom());
        System.out.println("Adresse : " + cl.getAdresse() + ", " + cl.getVille());
        System.out.println("Email : " + cl.getEmail());
        System.out.println("Téléphone : " + cl.getTéléphone());

        System.out.println("\nDétails de la commande :");
        float totalCommande = 0;
        for (LigneCommande ligne : lignesCommande) {
            Ordinateur ordinateur = ligne.getOrdinateur();
            float totalLigne = ordinateur.prixPourQuantite(ligne.getQuantité());
            totalCommande += totalLigne;

            System.out.println("- Ordinateur : " + ordinateur.getNom() + " (" + ordinateur.getMarque() + ")");
            System.out.println("  Description : " + ordinateur.getDescription());
            System.out.println("  Quantité commandée : " + ligne.getQuantité() );
            System.out.println("  Prix unitaire : " + ordinateur.getPrix() + " EUR");
            System.out.println("  Total pour cette ligne : " + totalLigne + " EUR\n");
        }

        System.out.println("Prix total de la commande : " + totalCommande + " EUR");
}}