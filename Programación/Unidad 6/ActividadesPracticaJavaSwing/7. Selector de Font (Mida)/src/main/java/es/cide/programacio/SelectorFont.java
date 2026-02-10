package es.cide.programacio;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SelectorFont {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Selector de Font (Mida)");
        ventanaPrincipal.setSize(300,200);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new FlowLayout());
        JSlider barra = new JSlider(10,50);
        JLabel medida = new JLabel();
        barra.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = barra.getValue();
                medida.setText(String.valueOf(valor));
            }
        });
        ventanaPrincipal.add(barra);
        ventanaPrincipal.add(medida);
        ventanaPrincipal.setVisible(true);
    }
}