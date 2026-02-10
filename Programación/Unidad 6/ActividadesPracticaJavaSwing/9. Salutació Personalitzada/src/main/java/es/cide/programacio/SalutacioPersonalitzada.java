package es.cide.programacio;

import javax.swing.*;
import java.awt.*;

public class SalutacioPersonalitzada {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Salutacio Personalitzada");
            ventanaPrincipal.setSize(300,200);
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaPrincipal.setLayout(new FlowLayout());

            JComboBox comboBox = new JComboBox<>();
                comboBox.addItem("Sr.");
                comboBox.addItem("Sra.");
                comboBox.addItem("Dr.");
            JTextField nombre = new JTextField();
                nombre.setColumns(20);
            JButton saludo = new JButton("Saluda");
            JOptionPane mensaje = new JOptionPane();
            saludo.addActionListener(e -> mensaje.showMessageDialog(mensaje,"Hola " + comboBox.getSelectedItem() + " " + nombre.getText()));

            ventanaPrincipal.add(comboBox);
            ventanaPrincipal.add(nombre);
            ventanaPrincipal.add(saludo);
            ventanaPrincipal.setVisible(true);
    }
}