package serietheque;

public class Episode {

    public Episode(int numeroSaison, int numero, String titre, int duree) {
        this.numero = numero;
        this.numeroSaison = numeroSaison;
        this.duree = duree;
        this.titre = titre;
    }
    private int numero;
    private int numeroSaison;
    private int duree;
    private String titre;

    public int getDuree() {
        return duree;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroSaison() {
        return numeroSaison;
    }
}
