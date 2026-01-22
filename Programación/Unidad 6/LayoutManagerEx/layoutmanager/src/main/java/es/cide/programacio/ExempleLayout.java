package es.cide.programacio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ExempleLayout {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Exemple de LayoutManager");
        finestra.setSize(500, 300);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new BorderLayout());


        JPanel panellSuperior =  new JPanel();
        panellSuperior.setLayout(new FlowLayout());
        panellSuperior.add(new JButton("Botó 1"));
        panellSuperior.add(new JButton("Botó 2"));
        panellSuperior.add(new JButton("Botó 3"));

        JPanel panellCentral = new JPanel();
        panellCentral.setLayout(new GridLayout(2,2));
        panellCentral.add(new JLabel("Etiqueta 1"));
        panellCentral.add(new JTextField("Text 1"));
        panellCentral.add(new JLabel("Etiqueta 2"));
        panellCentral.add(new JTextField("Text 2"));

        finestra.add(panellSuperior, BorderLayout.NORTH);
        finestra.add(panellCentral, BorderLayout.CENTER);
        try {
        UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");


        } catch (Exception e) {
                e.printStackTrace();
            }
        finestra.setVisible(true);

        
    }
}