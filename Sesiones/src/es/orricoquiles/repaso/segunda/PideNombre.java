package es.orricoquiles.repaso.segunda;

import javax.swing.*;

public class PideNombre {
    public static void main(String[] args) {
        boolean nameIsFine = false;
        while (!nameIsFine) {
            String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");

            System.out.println(nombre);
            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Has cancelado");
                nameIsFine = false;
            } else if ("".equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Has escrito nombre vacío");
                nameIsFine = false;
            } else {
                nameIsFine = true;
            }

            if (nameIsFine) {
                JOptionPane.showMessageDialog(null, "Encantado, " + nombre);
            } else {
                JOptionPane.showMessageDialog(null, "NOOO");
            }
        }

    }
}
