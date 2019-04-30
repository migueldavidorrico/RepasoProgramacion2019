package es.orricoquiles.repaso.segunda;

public class ArraysPruebas {
    public static void main(String[] args) {
        int[] valores = new int[10];

        int[] vacio;
        vacio = new int[10];
        System.out.println(vacio[2]);
        vacio[3] = 42;
        System.out.println(vacio.length);
        System.out.println("El último es:" + vacio[vacio.length - 1]);
        vacio[vacio[3] * 2 - 80] = 23;


    }
}
