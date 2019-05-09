package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

public class Conversor {
    public static void main(String[] args) {
        MenuCalculador menuCalculador = new MenuCalculador();
        menuCalculador.operacionesPosibles.add(new Salir());
        menuCalculador.operacionesPosibles.add(new PasarDeKbAByte());
        menuCalculador.operacionesPosibles.add(new PasarDeMbAByte());
        menuCalculador.operacionesPosibles.add(new Establecer());
        menuCalculador.operacionesPosibles.add(new OperacionBinara("Tanto por ciento") {
            @Override
            protected int operacionUnitaria(int operando1, int operando2) {
                return operando1 * operando2 / 100;
            }

            @Override
            public String registro() {
                return "Calculo un tanto por ciento";
            }
        });

        menuCalculador.buclePrincipal();
        for (String s : menuCalculador.operacionesRealizadas) {
            System.out.println(s);
        }
    }
}
