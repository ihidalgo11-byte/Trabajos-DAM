package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraSwingIvan {
    public static void main(String[] args) {
        double[] numero = {0}; //Guarda el primer numero
        String[] operacion = {""}; //Guarda el signo ("+,-,/,*")
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { //LookAndFeel
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame ventanaPrincipal = new JFrame("Calculadora - Iván");
        ventanaPrincipal.setSize(290,410);
        ventanaPrincipal.setLayout(new FlowLayout());
        ImageIcon iconoCalc = new ImageIcon("src\\main\\resources\\IconoCalc.jpg"); //Icono
        ventanaPrincipal.setIconImage(iconoCalc.getImage());
        ventanaPrincipal.setResizable(false);
        JTextField entradaPrincipal = new JTextField(); //Entrada principal
            entradaPrincipal.setColumns(7);
            entradaPrincipal.setFont(new Font("Arial", Font.BOLD, 38));
            entradaPrincipal.setEditable(false);
            entradaPrincipal.setHorizontalAlignment(JTextField.RIGHT);
        JLabel historial = new JLabel(); //Historial de la calculadora
            historial.setPreferredSize(new Dimension(260,35));
            historial.setFont(new Font("Arial", Font.PLAIN, 20));
            historial.setForeground(new Color(0, 0, 0, 128));
            historial.setHorizontalAlignment(JLabel.RIGHT);
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
            botones[i].setFocusable(false); // Evita que el boton le robe el foco al teclado
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

        botones[12].setBackground(new Color(222, 77, 51));
        botones[12].setForeground(Color.white);
        botones[12].addActionListener(e -> { //ActionListener que vacia el texto de historial y entradaPrincipal
            historial.setText(" ");
            entradaPrincipal.setText(" ");
        });

        //Al darle al boton si el TextField no esta vacio entra, convierte el texto del TextField en doble, lo guarda y guarda el operador correspondiente al boton
        botones[15].addActionListener(e -> { //SUMA
        if (!entradaPrincipal.getText().isEmpty()) { 
            numero[0] = Double.parseDouble(entradaPrincipal.getText());
            operacion[0] = "+"; 
            historial.setText(entradaPrincipal.getText() + " +");
            entradaPrincipal.setText("");
            }
            });
        botones[3].addActionListener(e -> { //RESTA
        if (!entradaPrincipal.getText().isEmpty()) {
            numero[0] = Double.parseDouble(entradaPrincipal.getText());
            operacion[0] = "/";
            historial.setText(entradaPrincipal.getText() + " /");
            entradaPrincipal.setText("");
            }
            });
        botones[7].addActionListener(e -> { //MULTIPLACION
        if (!entradaPrincipal.getText().isEmpty()) {
            numero[0] = Double.parseDouble(entradaPrincipal.getText());
            operacion[0] = "*";
            historial.setText(entradaPrincipal.getText() + " *");
            entradaPrincipal.setText("");
            }
            });
        botones[11].addActionListener(e -> { //DIVISION
        if (!entradaPrincipal.getText().isEmpty()) {
            numero[0] = Double.parseDouble(entradaPrincipal.getText());
            operacion[0] = "-";
            historial.setText(entradaPrincipal.getText() + " -");
            entradaPrincipal.setText("");
            }
            }); 
        botones[14].setBackground(new Color(51, 148, 222));
        botones[14].addActionListener(e -> { //IGUAL
        if (!entradaPrincipal.getText().isEmpty() && !operacion[0].isEmpty()) { //Entra si el TextField no esta vacio (segundo numero) y hay un signo de operacion guardado
            double segundoNumero = Double.parseDouble(entradaPrincipal.getText()); //Cambia el string a double
            double resultado = 0; //Inicia la varible para guarda el resultado

            //Revisa el signo guardado y hace la operacion correspondiente
            if (operacion[0].equals("+")) {
                resultado = numero[0] + segundoNumero;
            } else if (operacion[0].equals("-")) {
                resultado = numero[0] - segundoNumero;
            } else if (operacion[0].equals("*")) {
                resultado = numero[0] * segundoNumero;
            } else if (operacion[0].equals("/")) {
                if (segundoNumero != 0) { //Comprueba si el segundo numero es un 0
                    resultado = numero[0] / segundoNumero;
                } else { //Sale mensaje de error en caso de que lo sea
                    entradaPrincipal.setText("Error");
                    JOptionPane.showMessageDialog(null,"No puedes dividir entre 0" );
                    return;
                }
            }
            //Actualiza el historial y la entrada principal
            historial.setText(historial.getText() + " " + entradaPrincipal.getText() + " =");
            entradaPrincipal.setText(String.valueOf(resultado));
            operacion[0] = ""; //Reset de la operación para la siguiente
        }
        });
        //Permite que la ventana principal reciba eventos de teclado
        ventanaPrincipal.setFocusable(true);
        ventanaPrincipal.requestFocusInWindow();
        ventanaPrincipal.addKeyListener(new KeyAdapter() { //KeyListener para poder escribir los numero con el teclado
            @Override
            public void keyTyped(KeyEvent e) {
                char tecla = e.getKeyChar();
                //Verifica si el carácter es un numero
                if (Character.isDigit(tecla)) {
                    entradaPrincipal.setText(entradaPrincipal.getText() + tecla);
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //Al pulsar Intro ejecuta el boton "="
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botones[14].doClick();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) { //Si pulsas la tecla back space guarda el texto actual en un string
                    String textoActual = entradaPrincipal.getText();
                    if (textoActual.length() > 0) { //Revisa si tiene mas de 0 caracteres (sin el if funciona pero la consola se llena de errores)
                        //Gracias al substring guardas desde el caracter primer caracter hasta las longitud  del texto -1 para quitar el ultimo caracter
                        entradaPrincipal.setText(textoActual.substring(0, textoActual.length() - 1)); 
                    }
                }
            } 
        });
        ventanaPrincipal.setVisible(true);
    }
}