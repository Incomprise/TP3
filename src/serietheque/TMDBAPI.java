package serietheque;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import serietheque.Saison;
import serietheque.Serie;

public class TMDBAPI {
    private static final String API_KEY = "963e30959e03e2668d9f098fb9daa538";
    private static final String SERIE_ENDPOINT_URL = "https://api.themoviedb.org/3/tv/%SERIE_ID%?api_key="+API_KEY+"&language=fr";
    private static final String SAISON_ENDPOINT_URL = "https://api.themoviedb.org/3/tv/%SERIE_ID%/season/%SAISON_ID%?api_key="+API_KEY+"&language=fr";

}
