package es.orricoquiles.repaso.tercera;

import java.util.ArrayList;
import java.util.List;

public class Coalicion {
    private List<Pais> paises = new ArrayList<>();
    private final String nombre;

    public Coalicion(String nombre) {
        this.nombre = nombre;
    }

    public void anyadePais(Pais p) {
        paises.add(p);
    }


    public String getNombre() {
        return nombre;
    }

    public void muestraPaises() {
        ESGUI esgui = new ESGUI();
        for (Pais pais : paises) {
            esgui.muestraPais(pais);
        }
    }
}
