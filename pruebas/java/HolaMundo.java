import javax.swing.*;

public class HolaMundo{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Hola mundo");
        String nombre=JOptionPane.showInputDialog(null, "¿Su nombre?");
        JOptionPane.showMessageDialog(null, "Hola "+nombre);
    }
}
