package tests;

import org.junit.Assert;
import org.junit.Test;
import serietheque.Episode;
import serietheque.Saison;

public class EpisodeTest {
    @Test
    public void getDureeTest() {
        Episode episode = new Episode(1, 1, "ep1", 60);
        Assert.assertEquals(episode.getDuree(), 60);
    }

    @Test
    public void getTitreTest() {
        Episode episode = new Episode(1, 1, "ep1", 60);

    }
}
