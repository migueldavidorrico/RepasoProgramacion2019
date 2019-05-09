public abstract class Operacion {
    private final String etiquetaMenu;
    boolean finalizar;

    public abstract int realizarOperacion();

    public Operacion(String etiquetaMenu) {
        this.etiquetaMenu = etiquetaMenu;
    }

    public String getEtiquetaMenu() {
        return etiquetaMenu;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }


    public abstract String registro();
}


abstract class OperacionUnitaria extends Operacion {

    private int operando;

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }

    public OperacionUnitaria(String etiquetaMenu) {
        super(etiquetaMenu);
    }

    @Override
    public int realizarOperacion() {
        return operacionUnitaria(operando);
    }

    protected abstract int operacionUnitaria(int numero);

}

abstract class OperacionBinaria extends Operacion {
    private int operando1;
    private int operando2;

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public OperacionBinaria(String etiquetaMenu) {
        super(etiquetaMenu);
    }

    @Override
    public int realizarOperacion() {
        return operacionBinaria(operando1, operando2);
    }

    protected abstract int operacionBinaria(int operando1, int operando2);
}


class Salir extends OperacionUnitaria {

    public Salir() {
        super("Salir");
    }

    @Override
    protected int operacionUnitaria(int numero) {
        this.finalizar = true;
        return 0;
    }

    @Override
    public String registro() {
        return "Se sale de la aplicacion";
    }
}

class Suma extends OperacionBinaria {
    public Suma() {
        super("Sumar");
    }

    @Override
    protected int operacionBinaria(int operando1, int operando2) {
        return operando1 + operando2;
    }

    @Override
    public String registro() {
        return "Teníamos " + getOperando1() + " y le sumamos " + getOperando2() + " para obtener " + this.realizarOperacion();
    }
}

class Establecer extends OperacionBinaria {

    public Establecer() {
        super("Establecer a un número");
    }

    @Override
    public String registro() {
        return "Establecemos el número a " + getOperando2();
    }

    @Override
    protected int operacionBinaria(int operando1, int operando2) {
        return operando2;
    }
}

class PasarDeBytesAKiloBytes extends OperacionUnitaria {

    public PasarDeBytesAKiloBytes() {
        super("Pasar a KiloBytes");
    }

    @Override
    public String registro() {
        return "Pasamos " + getOperando() + " a Kbytes y obtenemos " + realizarOperacion();
    }

    @Override
    protected int operacionUnitaria(int numero) {
        return numero / 1024;
    }
}