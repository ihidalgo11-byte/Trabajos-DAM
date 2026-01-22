package es.cide.programacio;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hola mundo");
        frame.getContentPane().add(label);
        frame.pack();
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);       
    }
}