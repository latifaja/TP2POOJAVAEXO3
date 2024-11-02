import javax.xml.crypto.Data;
import java.util.Date;


public class Commande {
    private String  EtatCommande;
    private int référence;
    private Client client ;
    private Date dateCommande ;

    public Commande(String etatCommande, Date dateCommande, int référence) {
        EtatCommande = etatCommande;
        this.dateCommande = dateCommande;
        this.référence = référence;

    }

    public String getEtatCommande() {
        return EtatCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public int getRéférence() {
        return référence;
    }

    public Client getClient() {
        return client;
    }
}
