import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCalculadora {
    List<Operacion> operacionesPosibles = new ArrayList<>();
    List<String> operacionesRealizadas = new ArrayList<>();
    int numeroActual = 0;

    public void anyadeItem(Operacion operacion) {
        operacionesPosibles.add(operacion);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuCalculadora menuPrincipal = new MenuCalculadora();
        //MenuCalculadora.anyadeItem(new Suma());
        menuPrincipal.anyadeItem(new Salir());
        menuPrincipal.anyadeItem(new Suma());
        menuPrincipal.anyadeItem(new Establecer());
        menuPrincipal.anyadeItem(new PasarDeBytesAKiloBytes());
        menuPrincipal.buclePrincipal();
        for (String s : menuPrincipal.operacionesRealizadas) {
            System.out.println(s);
        }
    }

    private void buclePrincipal() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("El número actual es:" + numeroActual);
            for (int i = 0; i < operacionesPosibles.size(); i++) {
                System.out.println("  " + i + ". " + operacionesPosibles.get(i).getEtiquetaMenu());
            }
            System.out.println("ELIJA UNA OPERACION");
            int elegida = sc.nextInt();
            if (elegida < 0 || elegida > operacionesPosibles.size() - 1) {
                System.out.println("Opción no disponible. Elija una de las posibles");
                continue;
            }
            Operacion operacionActual = operacionesPosibles.get(elegida);
            if (operacionActual instanceof OperacionUnitaria) {
                ((OperacionUnitaria) operacionActual).setOperando(numeroActual);
            } else {
                System.out.print("Número a " + operacionActual.getEtiquetaMenu() + ":");
                ((OperacionBinaria) operacionActual).setOperando1(numeroActual);
                ((OperacionBinaria) operacionActual).setOperando2(sc.nextInt());

            }
            operacionesRealizadas.add(operacionActual.registro());
            numeroActual = operacionActual.realizarOperacion();
            salir = operacionActual.finalizar;
        }
    }
}
