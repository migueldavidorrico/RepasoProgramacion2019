package es.orricoquiles.repaso.segunda;

import javax.swing.*;

public class MediaNotas {
    public static void main(String[] args) {

        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas notas quieres?"));
        int[] notas = new int[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota " + (i + 1)));
        }

        String resumen = "Resumen\n";
        for (int i = 0; i < notas.length; i++) {
            resumen += notas[i] + "\n";
        }


        JOptionPane.showMessageDialog(null, resumen);
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        int media = suma / notas.length;

        JOptionPane.showMessageDialog(null, "La media es :" + media);


        /*for (int i = 0;i < 5;i++) {
            System.out.println(i);
        }
*/
        /*
        int numeroNotas=2;
        int[] notas=new int[numeroNotas];
        notas[0]=Integer.parseInt(JOptionPane.showInputDialog("Nota 1:"));
        notas[1]=Integer.parseInt(JOptionPane.showInputDialog("Nota 2:"));
        int media=(notas[0]+notas[1]/notas.length;
        JOptionPane.showMessageDialog(null,"La media es :"+media);
        */

        /*
        int nota1=Integer.parseInt(JOptionPane.showInputDialog("Nota 1:"));
        //JOptionPane.showMessageDialog(null,nota1);
        int nota2=Integer.parseInt(JOptionPane.showInputDialog("Nota 2:"));
        //JOptionPane.showMessageDialog(null,nota2);
        int nota3=Integer.parseInt(JOptionPane.showInputDialog("Nota 3:"));
        //JOptionPane.showMessageDialog(null,nota3);
        //int nota4=Integer.parseInt(JOptionPane.showInputDialog("Nota 4:"));
        //JOptionPane.showMessageDialog(null,nota4);
        int media=(nota1+nota2+nota3)/3;
        JOptionPane.showMessageDialog(null,"La media es :"+media);

         */
    }
}
