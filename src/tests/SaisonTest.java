package tests;

import org.junit.Assert;
import org.junit.Test;
import serietheque.Episode;
import serietheque.Saison;
import static org.junit.Assert.assertArrayEquals;

public class SaisonTest {
    @Test
    public void nbEpisodeTest() {
    Saison saison = new Saison();
    Episode episode = new Episode(1,1, "ep1", 60);
    saison.addEpisode(episode);
    Assert.assertEquals(saison.nbEpisode(), 1);
    }

    @Test
    public void getDureeTotaleTest() {
        Saison saison = new Saison();
        Assert.assertEquals(saison.getDureeTotale(), 0);
    }

}
