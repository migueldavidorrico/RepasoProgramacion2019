package es.orricoquiles.repaso.tercera;

import java.util.Scanner;

public class EstadisticasPaises {
    public static final int NUM_PAISES = 5;

    static String[] nombres = new String[NUM_PAISES];
    static int[] poblaciones = new int[NUM_PAISES];
    static Scanner sc = new Scanner(System.in);
    static String[] leyendas = {"Mínimo", "Máximo", "Media"};
    static double[] datos = new double[3];

    public static void main(String[] args) {
        String[] ue = new String[27];
        int[] pobUE = new int[27];
        leerPaises(ue, pobUE);
        String[] CPI = new String[15];
        int[] pobCPI = new int[15];
        leerPaises(CPI, pobCPI);
        hacerCalculos();
        imprimirResultados();
    }

    private static void imprimirResultados() {
        System.out.println("El " + leyendas[0] + " es " + nombres[(int) datos[0]] + " con una poblacion de " + poblaciones[(int) datos[0]]);
        System.out.println("El " + leyendas[1] + " es " + nombres[(int) datos[1]] + " con una poblacion de " + poblaciones[(int) datos[1]]);
        System.out.println("La " + leyendas[2] + " es " + datos[2]);
    }

    private static void hacerCalculos() {
        int min = Integer.MAX_VALUE;
        int posMin = -1;
        for (int i = 0; i < NUM_PAISES; i++) {
            if (poblaciones[i] < min) {
                min = poblaciones[i];
                posMin = i;
            }
        }
        int max = Integer.MIN_VALUE;
        int posMax = -1;
        for (int i = 0; i < NUM_PAISES; i++) {
            if (poblaciones[i] > max) {
                max = poblaciones[i];
                posMax = i;
            }
        }

        int suma = 0;
        for (int i = 0; i < NUM_PAISES; i++) {
            suma += poblaciones[i];
        }
        double media = suma / (double) NUM_PAISES;
        datos[0] = posMin;
        datos[1] = posMax;
        datos[2] = media;


    }

    private static void leerPaises(String[] nombres, int[] poblaciones) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
            System.out.print("Población " + (i + 1) + ":");
            poblaciones[i] = sc.nextInt();
            sc.nextLine();
        }
    }
}
