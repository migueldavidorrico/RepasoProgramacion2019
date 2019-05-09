package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeeGustos {
    public static void main(String[] args) {
        GustosInfante leido = null;
        //leer objeto
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pepe.obj"))) {
            leido = (GustosInfante) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(leido.info());

    }
}
