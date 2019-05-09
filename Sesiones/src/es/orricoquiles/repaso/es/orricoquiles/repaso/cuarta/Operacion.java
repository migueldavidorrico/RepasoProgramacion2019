package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

public abstract class Operacion {
    String etiqueta;
    boolean finalizar;

    public abstract int realizarOperacion();

    public abstract String registro();

    public Operacion(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }
}


abstract class OperacionUnitaria extends Operacion {

    private int operando;

    public OperacionUnitaria(String etiqueta) {
        super(etiqueta);
    }

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }

    @Override
    public int realizarOperacion() {
        return operacionUnitaria(operando);
    }

    protected abstract int operacionUnitaria(int operando);
}

abstract class OperacionBinara extends Operacion {
    int operando1;
    int operando2;


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

    public OperacionBinara(String etiqueta) {
        super(etiqueta);
    }

    @Override
    public int realizarOperacion() {
        return operacionUnitaria(operando1, operando2);
    }

    protected abstract int operacionUnitaria(int operando1, int operando2);
}

class Salir extends OperacionUnitaria {

    public Salir() {
        super("Salir");
    }

    @Override
    public String registro() {
        return "Salimos de la aplicación";
    }

    @Override
    protected int operacionUnitaria(int operando) {
        this.finalizar = true;
        return 0;
    }
}

class Suma extends OperacionBinara {

    public Suma() {
        super("Suma");
    }

    @Override
    public String registro() {
        return "Partimos de " + operando1 + " y le sumamos " + operando2 + " obteniendo " + operacionUnitaria(operando1, operando2);
    }

    @Override
    protected int operacionUnitaria(int operando1, int operando2) {
        return operando1 + operando2;
    }
}

class ElevarAlCuadrado extends OperacionUnitaria {

    public ElevarAlCuadrado() {
        super("Elevar al cuadrado");
    }

    @Override
    public String registro() {
        return "Elevo " + getOperando() + " al cuadrado";
    }

    @Override
    protected int operacionUnitaria(int operando) {
        return operando * operando;
    }
}

class PasarDeKbAByte extends OperacionUnitaria {

    public PasarDeKbAByte() {
        super("PASAR DE KB A BYTES");
    }

    @Override
    public String registro() {
        return "He pasado a Bytes";
    }

    @Override
    protected int operacionUnitaria(int operando) {
        return operando * 1024;
    }
}

class PasarDeMbAByte extends OperacionUnitaria {

    public PasarDeMbAByte() {
        super("PASAR DE MB A BYTES");
    }

    @Override
    public String registro() {
        return "He pasado de Megas a Bytes";
    }

    @Override
    protected int operacionUnitaria(int operando) {
        return operando * 1024 * 1024;
    }
}

class Establecer extends OperacionBinara {

    public Establecer() {
        super("Establecer a numero");
    }

    @Override
    public String registro() {
        return "Establezco a " + getOperando2();
    }


    @Override
    protected int operacionUnitaria(int operando1, int operando2) {
        return operando2;
    }
}