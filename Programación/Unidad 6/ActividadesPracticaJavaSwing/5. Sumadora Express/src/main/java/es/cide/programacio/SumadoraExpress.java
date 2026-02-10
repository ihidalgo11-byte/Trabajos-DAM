package es.cide.programacio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumadoraExpress {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Sumadora Express");
        ventanaPrincipal.setSize(300,200);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new FlowLayout());
        JTextField n1 = new JTextField();
        n1.setColumns(10);
        JTextField n2 = new JTextField();
        n2.setColumns(10);
        JButton sumar = new JButton("Sumar");
        JLabel suma = new JLabel("0");

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                int numero1 = Integer.parseInt(n1.getText()); //El texto de n1 se transforma en int y se guarda
                int numero2 = Integer.parseInt(n2.getText());
                int res = numero1 + numero2; //Guarda la suma de los numeros
                suma.setText(String.valueOf(res));
                }
            catch (NumberFormatException ex) { //Si pones alguna letra falla y pone mensaje de error
                suma.setText("Error: pon solo numeros");
                }
            }
        });

        ventanaPrincipal.add(n1);
        ventanaPrincipal.add(n2);
        ventanaPrincipal.add(sumar);
        ventanaPrincipal.add(suma);
        ventanaPrincipal.setVisible(true);
    }
}