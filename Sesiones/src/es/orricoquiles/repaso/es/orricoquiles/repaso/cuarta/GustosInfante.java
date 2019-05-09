package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GustosInfante implements Serializable {
    List<Integer> numerosPreferidos = new ArrayList<>();
    List<String> coloresFavoritos = new ArrayList<>();
    Infante infante;


    public String info() {
        String salida = "";
        salida += infante.getNombre().toUpperCase() + "\nNúmeros:   ";
        for (Integer i : numerosPreferidos) {
            salida += i + " ";
        }
        salida += ("\nColores:     ");
        for (String color : coloresFavoritos) {
            salida += color + " ";
        }
        salida += ("\n");
        return salida;
    }
}
