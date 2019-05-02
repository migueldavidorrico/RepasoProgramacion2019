package es.orricoquiles.repaso.tercera;

import javax.swing.*;

public class ESGUI implements PaisMostrable {

    @Override
    public Pais leePais() {
        return new Pais(
                JOptionPane.showInputDialog("Nombre del país?"),
                Integer.parseInt(JOptionPane.showInputDialog("Población?"))
        );
    }

    @Override
    public void muestraPais(Pais p) {
        JOptionPane.showMessageDialog(null, "<html><h1 style=\"color:red;\">" + p.info());
    }
}


