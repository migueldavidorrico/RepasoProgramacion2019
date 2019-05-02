package es.orricoquiles.repaso.segunda;

import javax.swing.*;

public class Password {

    public static final String PASS = "1234";

    public static void main(String[] args) {
        String respuesta = JOptionPane.showInputDialog(null, "¿Pass?");
        int numeroIntentos = 0;
        while (PASS.equals(respuesta) && numeroIntentos++ < 4) {
            respuesta = JOptionPane.showInputDialog(null, "¿Pass?");
            if (respuesta == null) {
                JOptionPane.showMessageDialog(null, "¡¡¡¡NO CANCELES!!!!");
                continue;
            }
            if ("".equals(respuesta)) {
                JOptionPane.showMessageDialog(null, "¡¡¡¡ESCRIBE ALGO!!!!");
                continue;
            }
            if (respuesta.equals(PASS)) {
                break;
            }

            //MUCHA CARGA DE TRABAJO


        }
    }
}
