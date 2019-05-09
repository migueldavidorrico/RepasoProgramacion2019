package es.orricoquiles.repaso.es.orricoquiles.repaso.cuarta;

public class PP {
    public static void main(String[] args) {
        Infante pepito = new Infante("Pepe", 50);
        RegistroAlturas registro = new RegistroAlturas();
        registro.anyadeMedicion(new Medicion(pepito, "enero", 2019));
        pepito.setAltura(pepito.getAltura() + 3);
        registro.anyadeMedicion(new Medicion(pepito, "febrero", 2019));
        pepito.setAltura(pepito.getAltura() + 6);
        registro.anyadeMedicion(new Medicion(pepito, "marzo", 2019));
        pepito.setAltura(pepito.getAltura() + 2);
        registro.anyadeMedicion(new Medicion(pepito, "abril", 2019));
        pepito.setAltura(pepito.getAltura() + 1);
        registro.anyadeMedicion(new Medicion(pepito, "mayo", 2019));

        System.out.println(registro.info());
    }
}
