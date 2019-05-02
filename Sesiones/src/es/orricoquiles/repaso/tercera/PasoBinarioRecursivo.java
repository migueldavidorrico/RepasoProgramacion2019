package es.orricoquiles.repaso.tercera;

import java.util.Arrays;

public class PasoBinarioRecursivo {

    public static void main(String[] args) {
        final int[] prueba = {4, 5, 6, 7};
        final int p = 34;
        pasaBinario(16);
        cambia(prueba);
        System.out.println(Arrays.toString(prueba));
        System.out.println(p);
    }

    private static void cambia(final int[] prueba) {
        prueba[2] = 0;
    }

    private static void pasaBinario(int i) {
        int numeroDivididoEntreDos = i / 2;
        int restoDivision = i % 2;
        if (numeroDivididoEntreDos < 2) {
            System.out.print(numeroDivididoEntreDos);
        } else {
            pasaBinario(numeroDivididoEntreDos);
            System.out.print(restoDivision);
        }

    }
}
