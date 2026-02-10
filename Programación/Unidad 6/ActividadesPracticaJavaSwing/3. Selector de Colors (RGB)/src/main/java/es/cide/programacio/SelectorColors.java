package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SelectorColors {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Selector de Colors");
        ventana.setSize(300,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(1,1));
        JPanel panelCentral = new JPanel();
        
        JButton rojo = new JButton("Vermell");
        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.red);
            }
        });
        JButton verde = new JButton("Verd");
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.green);
            }
        });
        JButton azul = new JButton("Blau");
        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.blue);
            }
        });
        panelCentral.add(rojo);
        panelCentral.add(verde);
        panelCentral.add(azul);
        ventana.add(panelCentral);

        ventana.setVisible(true);
    }
}