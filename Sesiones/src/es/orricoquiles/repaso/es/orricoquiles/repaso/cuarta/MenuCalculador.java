package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCalculador {
    List<Operacion> operacionesPosibles = new ArrayList<>();
    List<String> operacionesRealizadas = new ArrayList<>();
    int numeroActual;

    public static void main(String[] args) {
        MenuCalculador menuCalculador = new MenuCalculador();
        menuCalculador.operacionesPosibles.add(new Salir());
        menuCalculador.operacionesPosibles.add(new Suma());
        menuCalculador.operacionesPosibles.add(new ElevarAlCuadrado());

        menuCalculador.buclePrincipal();
        for (String s : menuCalculador.operacionesRealizadas) {
            System.out.println(s);
        }
    }

    public void buclePrincipal() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("El número actual es: " + numeroActual);
            for (int i = 0; i < operacionesPosibles.size(); i++) {
                System.out.println("  " + i + ". " + operacionesPosibles.get(i).getEtiqueta());
            }

            Operacion operacionActual = operacionesPosibles.get(sc.nextInt());
            if (operacionActual instanceof OperacionUnitaria) {
                ((OperacionUnitaria) operacionActual).setOperando(numeroActual);
            } else {
                System.out.println("Numero a " + operacionActual.getEtiqueta());
                ((OperacionBinara) operacionActual).setOperando1(numeroActual);
                ((OperacionBinara) operacionActual).setOperando2(sc.nextInt());

            }
            operacionesRealizadas.add(operacionActual.registro());
            numeroActual = operacionActual.realizarOperacion();
            salir = operacionActual.finalizar;
        }
    }
}
