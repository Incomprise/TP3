package serietheque;
import java.util.ArrayList;
import java.util.List;

public class Serie {
    public Serie(int id, String titre){
        this.id = id;
        this.titre = titre;
    }

    private int id;
    private String titre;
    private ArrayList<Saison> saisons = new ArrayList<>();

    public void addSaison(Saison saison) {
        this.saisons.add(saison);
    }

    public int getNbSaison() {
        return this.saisons.size();
    }

    public int getNbEpisode() {
        int nbEpisode = 0;
        for (Saison saison : this.saisons) {
            nbEpisode = nbEpisode + saison.nbEpisode();
        }
        return nbEpisode;
    }

    public int getDureeTotale() {
        int dureeTotale = 0;
        for (Saison saison : this.saisons) {
            dureeTotale = dureeTotale + saison.getDureeTotale();
        }
        return dureeTotale;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public ArrayList<Saison> getSaisons() {
        return saisons;
    }
}
