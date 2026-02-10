package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Ficha de Película");
            ventanaPrincipal.setSize(400,400);
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaPrincipal.setLayout(new FlowLayout());
            ventanaPrincipal.setResizable(false);
        Font arial = new Font("Arial", Font.BOLD, 12);
        JLabel tituloL = new JLabel("Título de la película:");
            tituloL.setFont(arial);
        JTextField tituloTF = new JTextField(20);
        JLabel genero = new JLabel("Género:");
            genero.setBorder(new EmptyBorder(0,0,0,67));
        JComboBox<Object> comboBox = new JComboBox<>();
            comboBox.setPreferredSize(new Dimension(223, 20));
            comboBox.addItem("Acció");
            comboBox.addItem("Comèdia");
            comboBox.addItem("Drama");
            comboBox.addItem("Terror");
            comboBox.addItem("Ciència Ficció");
            comboBox.addActionListener(e -> {
                String seleccion = comboBox.getSelectedItem().toString();
                if (seleccion.equals("Terror")){
                    JOptionPane.showMessageDialog(null, "Advertencia: El género Terror puede no ser apto para todos.");
                }
            });
        JLabel any = new JLabel("Año de estreno:");
            any.setBorder(new EmptyBorder(0,0,0,20));
        JSlider sliderAny = new JSlider(1900, 2025, 2000);
            sliderAny.setPreferredSize(new Dimension(223, 50));
            sliderAny.setPaintTicks(true);
            sliderAny.setPaintLabels(true);
            sliderAny.setMajorTickSpacing(25);
            sliderAny.setMinorTickSpacing(5);
        JLabel anyL = new JLabel("Año seleccionado:");
            anyL.setBorder(new EmptyBorder(0,0,0,20));
        JLabel anySeleccionado = new JLabel("2000");
            anySeleccionado.setBorder(new EmptyBorder(0,0,0,180));
            sliderAny.addChangeListener(e -> {
                int valor = sliderAny.getValue();
                anySeleccionado.setText(String.valueOf(valor));
        });
        JLabel infoPeli = new JLabel();
            infoPeli.setBorder(new EmptyBorder(0,20,0,20));
        JButton ficha = new JButton("Mostrar Ficha");
            ficha.setPreferredSize(new Dimension(360,20));
            ficha.addActionListener(e -> {
                infoPeli.setText("Pel·lícula: " + tituloTF.getText() + " | Gènere: " + comboBox.getSelectedItem() + " | Any: " + anySeleccionado.getText());
            });
        JLabel selectVocal = new JLabel("Selecciona una vocal: ");
        JComboBox<Object> vocal = new JComboBox<>();
            vocal.setPreferredSize(new Dimension(200, 20));
            vocal.addItem("A");
            vocal.addItem("E");
            vocal.addItem("I");
            vocal.addItem("O");
            vocal.addItem("U");
        JLabel cantidadVocales = new JLabel("Número de vocales: ");
        JButton contarVocal = new JButton("Contar vocal");
        contarVocal.setPreferredSize(new Dimension(360, 20));
        contarVocal.addActionListener(e -> {
            String titulo = tituloTF.getText().toLowerCase();
            String vocalSeleccionada = vocal.getSelectedItem().toString().toLowerCase();
            int vocales = 0;
            for (int i = 0; i < titulo.length(); i++) {
                if (String.valueOf(titulo.charAt(i)).equals(vocalSeleccionada)) {
                    vocales++;
                }
            }
            cantidadVocales.setText("Número de vocales: " + vocales);
        });
        ventanaPrincipal.add(tituloL);
        ventanaPrincipal.add(tituloTF);
        ventanaPrincipal.add(genero);
        ventanaPrincipal.add(comboBox);
        ventanaPrincipal.add(any);
        ventanaPrincipal.add(sliderAny);
        ventanaPrincipal.add(anyL);
        ventanaPrincipal.add(anySeleccionado);
        ventanaPrincipal.add(ficha);
        ventanaPrincipal.add(infoPeli);
        ventanaPrincipal.add(selectVocal);
        ventanaPrincipal.add(vocal);
        ventanaPrincipal.add(contarVocal);
        ventanaPrincipal.add(cantidadVocales);

        ventanaPrincipal.setVisible(true);
    }
}