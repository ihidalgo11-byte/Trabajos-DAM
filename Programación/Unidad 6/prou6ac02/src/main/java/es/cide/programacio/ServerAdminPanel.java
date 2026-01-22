package es.cide.programacio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ServerAdminPanel extends JFrame {
    public static void main(String[] args) {
        JFrame ventanaP = new JFrame("Tauler d'Administració - Iván Hidalgo");
        ventanaP.setSize(800,600);
        ventanaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaP.setLayout(new GridLayout(2,2,15,15));
        
        //Panell d'Estat (Nord-Oest)
        JPanel panellEstat = new JPanel(); 
            panellEstat.setLayout(new GridLayout(2,1));
            panellEstat.setBackground(Color.cyan);
            panellEstat.setBorder(BorderFactory.createTitledBorder("Estat del Sistema"));
        JLabel info1 = new JLabel("CPU: 15% Ús", JLabel.CENTER);
        JLabel info2 = new JLabel("RAM: 4GB / 16GB", JLabel.CENTER);
            info1.setFont(new Font("Arial", Font.BOLD, 30));
            info2.setFont(new Font("Arial", Font.BOLD, 30));
            panellEstat.add(info1);
            panellEstat.add(info2);

        //Panell de Control (Nord-Est)
        JPanel panellControl = new JPanel();
            panellControl.setBorder(BorderFactory.createTitledBorder("Accions Ràpides"));
            panellControl.setLayout(new GridLayout(3,1,0,10));
        JPanel primerRow = new JPanel();
            primerRow.setLayout(new FlowLayout());
        JPanel segundoRow = new JPanel();
            segundoRow.setLayout(new FlowLayout());
        JPanel terderRow = new JPanel();
            terderRow.setLayout(new FlowLayout());
        JButton Iniciar = new JButton("▶ Iniciar Servei");
            Iniciar.setPreferredSize(new Dimension(150, 40));
            Iniciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JButton Aturar = new JButton("■ Aturar Servei");
            Aturar.setPreferredSize(new Dimension(150, 40));
            Aturar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JButton Reiniciar = new JButton("↻ Reiniciar");
            Reiniciar.setPreferredSize(new Dimension(150, 40));
            Reiniciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        
            primerRow.add(Iniciar);
            segundoRow.add(Aturar);
            terderRow.add(Reiniciar);
            panellControl.add(primerRow);
            panellControl.add(segundoRow);
            panellControl.add(terderRow);
        
        //Panell de Configuració (Sud-Oest)
        JPanel panellConfig = new JPanel();
        panellConfig.setBackground(Color.yellow);
        panellConfig.setBorder(BorderFactory.createTitledBorder("Paràmetres de Càrrega"));
        panellConfig.setLayout(new GridLayout(4,1));
        JLabel limit = new JLabel("Límit de Connexions (0-500):");
        JSlider barra = new JSlider();
        barra.setPaintTicks(true);

        //Panell de Registres
        JPanel panellRegis = new JPanel();
        panellRegis.setBackground(Color.green);
        panellRegis.setBorder(BorderFactory.createTitledBorder("Logs del Servidor en Viu"));
        ventanaP.add(panellEstat);
        ventanaP.add(panellControl);
        ventanaP.add(panellConfig);
        ventanaP.add(panellRegis);
        ventanaP.setVisible(true);
    }
}