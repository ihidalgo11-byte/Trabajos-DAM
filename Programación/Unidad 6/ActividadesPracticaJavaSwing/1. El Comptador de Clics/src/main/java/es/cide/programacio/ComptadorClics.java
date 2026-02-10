package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComptadorClics {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Comptador de Clics");
        ventanaPrincipal.setSize(300,150);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new FlowLayout());
        JLabel texto = new JLabel("0");
        JButton boton = new JButton("Sumar");
        boton.addActionListener(new ActionListener() {
            int numero = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                numero++;
                texto.setText(String.valueOf(numero));
            }
        });
        ventanaPrincipal.add(texto);
        ventanaPrincipal.add(boton);
        ventanaPrincipal.setVisible(true);
    }
}