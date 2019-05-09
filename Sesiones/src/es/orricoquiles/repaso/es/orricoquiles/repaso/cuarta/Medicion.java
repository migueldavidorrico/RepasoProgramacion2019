package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

public class Medicion {
    final Infante infante;
    final String mes;
    final int anyo;

    public Medicion(Infante infante, String mes, int anyo) {

        this.infante = new Infante(infante);
        this.mes = mes;
        this.anyo = anyo;
    }

    public Infante getInfante() {
        return infante;
    }

    public String getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }
}
