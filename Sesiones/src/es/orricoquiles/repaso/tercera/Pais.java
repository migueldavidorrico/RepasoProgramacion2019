package es.orricoquiles.repaso.tercera;

import java.util.Objects;

public class Pais {
    private final String nombre;
    private int poblacion;


    Pais(Pais p) {
        this.nombre = p.nombre;
        this.poblacion = p.poblacion;
    }


    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return poblacion == pais.poblacion &&
                Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, poblacion);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Pais(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public Pais(String nombre) {
        this(nombre, 0);
    }

    public String info() {
        return nombre.toUpperCase() + "-" + poblacion;
    }
}
