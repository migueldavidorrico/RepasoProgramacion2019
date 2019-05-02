package es.orricoquiles.repaso.tercera;

import java.io.File;

public class LSRecursivo {
    public static void main(String[] args) {
        File inicio = new File(".");
        long longitud = inicio.length();

        listaFicheros(inicio);
    }

    private static void listaFicheros(File inicio) {
        listaFicheros(inicio, 0);
    }

    private static void listaFicheros(File inicio, int profundidad) {
        for (File f : inicio.listFiles()) {
            for (int i = 0; i < profundidad; i++) {

                System.out.print(" ");
            }
            if (f.isFile()) {
                System.out.println(f + " " + f.length());
            } else if (f.isDirectory()) {
                System.out.println("DIR: " + f);
                listaFicheros(f, profundidad + 1);
            }
        }
    }
}
