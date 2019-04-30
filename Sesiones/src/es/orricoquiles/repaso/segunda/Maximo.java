package es.orricoquiles.repaso.segunda;

public class Maximo {
    public static void main(String[] args) {
        int[] numeros = {-6, -4, -3, -6, -100, -2, -10, -176};

        System.out.println(numeros.length);

        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println(maximo);

    }
}
