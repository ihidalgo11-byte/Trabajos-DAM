package es.cide.programacio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class CalculadoraSwing {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Calculadora - Iván Hidalgo");
        ventanaPrincipal.setSize(320,400);
        ventanaPrincipal.setLayout(new FlowLayout());
        ventanaPrincipal.setResizable(false);
        JTextField entradaPrincipal = new JTextField();
            entradaPrincipal.setColumns(7);
            entradaPrincipal.setFont(new Font("Arial", Font.BOLD, 38));
            entradaPrincipal.setEditable(false);
        JLabel historial = new JLabel();
            historial.setPreferredSize( new Dimension(260,35));
            historial.setFont(new Font("Arial", Font.BOLD, 30));
        String[] valorBotones = { //Array con el texto de lo botones
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };
        JButton[] botones = new JButton[valorBotones.length]; //Array de botones
        
        
        ventanaPrincipal.add(historial);
        ventanaPrincipal.add(entradaPrincipal);
        for (int i = 0; i < botones.length; i++) { //Bucle que crea los botones, les pone tamaño, les cambia la fuente y los añade
            botones[i] = new JButton(valorBotones[i]);
            botones[i].setPreferredSize(new Dimension(60,60));
            botones[i].setFont(new Font("Arial",Font.BOLD,20));
            ventanaPrincipal.add(botones[i]);
        }

        //Añade ActionListener a todos lo botones numericos
        botones[0].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 7));
        botones[1].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 8));
        botones[2].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 9));

        botones[4].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 4));
        botones[5].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 5));
        botones[6].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 6));

        botones[8].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 1));
        botones[9].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 2));
        botones[10].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 3));

        botones[13].addActionListener(e -> entradaPrincipal.setText(entradaPrincipal.getText() + 0));

        botones[12].addActionListener(e -> { //ActionListener que vacia el texto de historial y entradaPrincipal
            historial.setText(" ");
            entradaPrincipal.setText(" ");
        });
        botones[15].addActionListener(e -> {
            historial.setText(entradaPrincipal.getText() + "+");
            entradaPrincipal.setText("");
        });


        ventanaPrincipal.setVisible(true);
    }
}