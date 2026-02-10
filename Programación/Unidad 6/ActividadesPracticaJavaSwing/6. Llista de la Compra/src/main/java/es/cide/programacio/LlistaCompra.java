package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LlistaCompra {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Llista de la Compra");
        ventanaPrincipal.setSize(300,200);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new FlowLayout());
        JTextField elemento = new JTextField();
        elemento.setColumns(10);
        JButton boton = new JButton("Añadir");
        DefaultListModel<String> modelo = new DefaultListModel<>(); //Modelo de JList
        JList<String> lista = new JList<>(modelo); //Creacion de la lista con el modelo
        lista.setVisibleRowCount(10); //Cantidad de lineas de la lista
        lista.setFixedCellWidth(200); //Define el tamaño de cada linea de la lista
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 String texto = elemento.getText(); //Recoje el valor de elemento y lo guarda en texto
                if (!texto.isEmpty()) { //Si texto no esta vacio añade a modelo lo que tiene dentro texto y vacia la varible elemento
                    modelo.addElement(texto);
                    elemento.setText("");
                }
            }
        });
        ventanaPrincipal.add(elemento);
        ventanaPrincipal.add(boton);
        ventanaPrincipal.add(lista);
        ventanaPrincipal.setVisible(true);
    }
}