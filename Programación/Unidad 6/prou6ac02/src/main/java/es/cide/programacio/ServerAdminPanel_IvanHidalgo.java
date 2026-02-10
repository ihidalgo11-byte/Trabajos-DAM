package es.cide.programacio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ServerAdminPanel_IvanHidalgo extends JFrame {
    public static void main(String[] args) {
        JFrame ventanaP = new JFrame("Tauler d'Administració - Iván Hidalgo");
        ventanaP.setSize(800,600);
        ventanaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaP.setLayout(new GridLayout(2,2,15,15));
        ventanaP.setResizable(false); //Desactiva poder modificar el tamaño de la ventana

        //Panell d'Estat (Nord-Oest)
        JPanel panellEstat = new JPanel(); 
            panellEstat.setLayout(new GridLayout(2,1));
            panellEstat.setSize(200, 100);
            panellEstat.setBorder(new TitledBorder("Estat del Sistema"));
        JPanel linea1 = new JPanel(new BorderLayout());
        JLabel info1 = new JLabel("CPU: 15% Ús", JLabel.CENTER);
            linea1.add(info1,BorderLayout.SOUTH);
        JPanel linea2 = new JPanel(new BorderLayout());
        JLabel info2 = new JLabel("RAM: 4GB / 16GB", JLabel.CENTER);
            linea2.add(info2,BorderLayout.NORTH);
            info1.setFont(new Font("Arial", Font.BOLD, 30));
            info2.setFont(new Font("Arial", Font.BOLD, 30));
            panellEstat.add(linea1);
            panellEstat.add(linea2);

        //Panell de Control (Nord-Est)
        JPanel panellControl = new JPanel();
            panellControl.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Accions Ràpides"),new EmptyBorder(70,100,70,100)));
            panellControl.setLayout(new GridLayout(3,1,0,10));
        JButton Iniciar = new JButton("▶ Iniciar Servei");
            Iniciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JButton Aturar = new JButton("■ Aturar Servei");
            Aturar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JButton Reiniciar = new JButton("↻ Reiniciar");
            
            Reiniciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
            panellControl.add(Iniciar);
            panellControl.add(Aturar);
            panellControl.add(Reiniciar);
        
        //Panell de Configuració (Sud-Oest)
        JPanel panellConfig = new JPanel();
        panellConfig.setBorder(new TitledBorder("Paràmetres de Càrrega"));
        panellConfig.setLayout(new GridLayout(4,1));
        JLabel limit = new JLabel("Límit de Connexions (0-500):");
        limit.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JSlider barra = new JSlider(0,500,250);
            barra.setPaintTicks(true);
            barra.setPaintLabels(true);
            barra.setMajorTickSpacing(50);
            barra.setMinorTickSpacing(25);
        JLabel timeout = new JLabel("Timeout (segons):");
            timeout.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
        JTextField zonaTexto = new JTextField("60");
            zonaTexto.setPreferredSize(new Dimension(360, 25));
        JPanel linea4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            linea4.add(zonaTexto,BorderLayout.CENTER);
            
            panellConfig.add(limit);
            panellConfig.add(barra);
            panellConfig.add(timeout);
            panellConfig.add(linea4);

        //Panell de Registres
        JPanel panellRegis = new JPanel(new BorderLayout());
            panellRegis.setBorder(new TitledBorder("Logs del Servidor en Viu"));
        JTextArea textoPR = new JTextArea(
                        "[Info] Servei iniciat IP 10.1.1.1\n" + 
                        "[Warning] Connexió lenta IP 10.2.2.2\n" + 
                        "[Info] Verificant servidor IP 10.3.3.3\n" + 
                        "[Warning] Retard resposta IP 10.4.4.4\n" + 
                        "[Info] Xarxa carregada IP 10.5.5.5\n" + 
                        "[Warning] Pèrdua paquets IP 10.6.6.6\n" + 
                        "[Info] Procés actiu IP 10.7.7.7\n" + 
                        "[Warning] Amplada limitada IP 10.8.8.8\n" + 
                        "[Info] Connexió establerta IP 10.9.9.9\n" + 
                        "[Warning] Retard connexió IP 10.10.10.10\n" + 
                        "[Info] Monitoratge actiu IP 10.11.11.11\n" + 
                        "[Warning] Temps variable IP 10.12.12.12\n" + 
                        "[Info] Servidor sincronitzat IP 10.13.13.13\n" + 
                        "[Warning] Errors intermitents IP 10.14.14.14\n" + 
                        "[Info] Estat estable IP 10.15.15.15\n"
                        );
            textoPR.setFont(new Font("Monospaced", Font.PLAIN, 12));
            textoPR.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textoPR);
            panellRegis.add(scrollPane,BorderLayout.CENTER);

        //Final
        ventanaP.add(panellEstat);
        ventanaP.add(panellControl);
        ventanaP.add(panellConfig);
        ventanaP.add(panellRegis);
        ventanaP.setVisible(true);
    }
}