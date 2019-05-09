package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

import java.io.*;

public class FicheroPepe {
    public static void main(String[] args) {
        GustosInfante gustosPepe = new GustosInfante();
        gustosPepe.infante = new Infante("Pepe", 110);
        gustosPepe.coloresFavoritos.add("Añil");
        gustosPepe.coloresFavoritos.add("lila");
        gustosPepe.numerosPreferidos.add(4);
        gustosPepe.numerosPreferidos.add(42);
        gustosPepe.numerosPreferidos.add(387);
        System.out.println(gustosPepe.info());


        File fichero = new File("pepe.otm");
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(fichero);
            br = new BufferedReader(reader);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("pepe.obj"))){
//            oos.writeObject(gustosPepe);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
