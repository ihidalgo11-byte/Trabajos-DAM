package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InterruptorMagic {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setSize(300,200);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new FlowLayout());
        JCheckBox checkBox = new JCheckBox("Activa el botó");
        JButton boton = new JButton("Boton");
        boton.setEnabled(false);
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boton.setEnabled(checkBox.isSelected()); //Si el checkBox esta seleccionado delvuelve true
            }
        });

        ventanaPrincipal.add(boton);
        ventanaPrincipal.add(checkBox);
        ventanaPrincipal.setVisible(true);
    }   
}
