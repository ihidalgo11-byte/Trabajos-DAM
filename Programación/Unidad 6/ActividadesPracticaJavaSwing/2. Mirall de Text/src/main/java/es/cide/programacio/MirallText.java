package es.cide.programacio;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
 
public class MirallText {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mirall de Text");
        ventana.setSize(300,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());
        JTextField campoTexto = new JTextField();
        campoTexto.setColumns(20); //Cambiar tamaño campo de texto
        JLabel texto = new JLabel();
        campoTexto.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                texto.setText(campoTexto.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                texto.setText(campoTexto.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                texto.setText(campoTexto.getText());
            }
        });
        ventana.add(campoTexto);
        ventana.add(texto);
        ventana.setVisible(true);
    }
}