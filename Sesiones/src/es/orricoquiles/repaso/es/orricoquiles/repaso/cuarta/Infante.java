package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

public class Infante {
    final String nombre;
    int altura;

    public Infante(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public Infante(Infante infante) {
        this.nombre = infante.getNombre();
        this.altura = infante.getAltura();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
