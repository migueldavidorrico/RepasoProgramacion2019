package es.orricoquiles.repaso.segunda;

public class PaisMasPoblado {
    public static void main(String[] args) {
        Pais[] paises;
        paises = new Pais[6];
        paises[0] = new Pais("España", 47);
        paises[1] = new Pais("Portugal", 25);
        paises[5] = new Pais("USA", 200);
        paises[2] = new Pais("Francia", 70);
        paises[3] = new Pais("Alemania", 82);
        paises[4] = new Pais("UK", 36);

        for (Pais p :
                paises) {
            System.out.println(p);
        }
        Pais masPoblado = paises[0];
        for (int i = 0; i < paises.length; i++) {
            if (paises[i].getPoblacionMillones() > masPoblado.getPoblacionMillones()) {
                masPoblado = paises[i];
            }
        }
        System.out.println(masPoblado);


    }

}


class Pais {
    String nombre;
    int poblacionMillones;

    public Pais(String nombre, int poblacionMillones) {
        this.nombre = nombre;
        this.poblacionMillones = poblacionMillones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacionMillones() {
        return poblacionMillones;
    }

    public void setPoblacionMillones(int poblacionMillones) {
        this.poblacionMillones = poblacionMillones;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacionMillones=" + poblacionMillones +
                '}';
    }
}