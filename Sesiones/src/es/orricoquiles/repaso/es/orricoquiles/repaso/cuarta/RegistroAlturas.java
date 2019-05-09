package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

import java.util.ArrayList;
import java.util.List;

public class RegistroAlturas {
    List<Medicion> mediciones;

    public RegistroAlturas() {
        this.mediciones = new ArrayList<>();
    }

    public void anyadeMedicion(Medicion m) {
        mediciones.add(m);
    }

    public String info() {
        String salida = "";
        for (Medicion medicion : mediciones) {
            salida += "En " + medicion.getMes() + " de "
                    + medicion.getAnyo()
                    + " " + medicion.getInfante().getNombre() + " medía:" +
                    medicion.getInfante().getAltura() + " centímetros\n";
        }
        return salida;
    }
}
