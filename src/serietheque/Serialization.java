package serietheque;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String args[]) {
        File fichier =  new File("/home/liz/Bureau/") ;

        try {
            ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fichier));
            Collection c =  new Collection();
            oos.writeObject(c);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
