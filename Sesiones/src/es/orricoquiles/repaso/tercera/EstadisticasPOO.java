package es.orricoquiles.repaso.tercera;

public class EstadisticasPOO {
    public static void main(String[] args) {
        Coalicion ue = new Coalicion("UNION EUROPEA");
        ue.anyadePais(new Pais("ESP", 45));
        ue.anyadePais(new Pais("FRA", 25));
        ue.anyadePais(new Pais("ITA", 87));
        ue.muestraPaises();


    }
}
