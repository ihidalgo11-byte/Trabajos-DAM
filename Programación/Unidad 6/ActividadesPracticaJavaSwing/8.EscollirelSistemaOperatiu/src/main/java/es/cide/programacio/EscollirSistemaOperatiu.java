package es.cide.programacio;

import java.awt.*;
import javax.swing.*;

public class EscollirSistemaOperatiu {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Selector de Font (Mida)");
            ventanaPrincipal.setSize(1000,700);
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaPrincipal.setLayout(new FlowLayout());
        JLabel imagen = new JLabel();
        imagen.setSize(200,100);

        JRadioButton Windows = new JRadioButton("Windows");
        ImageIcon win = new ImageIcon("8.EscollirelSistemaOperatiu\\src\\main\\resources\\windows.png"); //Imagen Windows
        ImageIcon winEscalado = new ImageIcon(win.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)); //Tamaño de la imagen

        JRadioButton Linux = new JRadioButton("Linux");
        ImageIcon lin = new ImageIcon("8.EscollirelSistemaOperatiu\\src\\main\\resources\\linux.png"); //Imagen Linux
        ImageIcon linEscalado = new ImageIcon(lin.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));//Tamaño de la imagen

        JRadioButton macOS = new JRadioButton("macOS");
        ImageIcon mac = new ImageIcon("8.EscollirelSistemaOperatiu\\src\\main\\resources\\macOS.png"); //Imagen macOS
        ImageIcon macEscalado = new ImageIcon(mac.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));//Tamaño de la imagen

        ButtonGroup grupo = new ButtonGroup();
            grupo.add(Windows);
            grupo.add(Linux);
            grupo.add(macOS);

        Windows.addActionListener(e -> imagen.setIcon(winEscalado));
        Linux.addActionListener(e -> imagen.setIcon(linEscalado));
        macOS.addActionListener(e -> imagen.setIcon(macEscalado));

        ventanaPrincipal.add(Windows);
        ventanaPrincipal.add(Linux);
        ventanaPrincipal.add(macOS);
        ventanaPrincipal.add(imagen);
        ventanaPrincipal.setVisible(true);
    }
}