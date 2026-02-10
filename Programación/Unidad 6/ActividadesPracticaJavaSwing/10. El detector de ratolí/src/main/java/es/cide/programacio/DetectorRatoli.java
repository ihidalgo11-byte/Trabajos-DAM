package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DetectorRatoli {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Detector de Ratolí");
            ventanaPrincipal.setSize(1000,800);
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaPrincipal.setLayout(new FlowLayout());
        JLabel coords = new JLabel();
        JPanel detectorRaton = new JPanel();
            detectorRaton.setPreferredSize(new Dimension(1000, 800));
            detectorRaton.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                coords.setText("X: " + e.getX() + " Y: " + e.getY());
            }
            });
            ventanaPrincipal.add(coords);
            ventanaPrincipal.add(detectorRaton);
            ventanaPrincipal.setVisible(true);
    }
}