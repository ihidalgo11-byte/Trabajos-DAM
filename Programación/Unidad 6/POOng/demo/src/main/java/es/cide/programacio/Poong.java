package es.cide.programacio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Classe que representa un panell on es dibuixa un cercle que rebota
public class Poong extends JPanel implements ActionListener, KeyListener {
    private int x, y; // Coordenades inicials del cercle
    private int dx = 7, dy = 5; // Velocitat del moviment en X i Y
    private int rx, ry;
    private int ix, iy;
    private boolean inicializado = false;
    private int ancho = 60, alto = 150;
    private int vry = 20; //Velocidad pala
    private int xMarcadorRojo, yMarcadorRojo;
    private int xMarcadorAzul, yMarcadorAzul;
    private final int RADI = 20; // Radi del cercle
    private final int DELAY = 10; // Retard del temporitzador en mil·lisegons
    private Timer timer; // Temporitzador per controlar l'animació
    private Timer timerGiro;
    Image[] animacionBola = new Image[4]; // Array para 4 estados de la bola
    int frameActual = 0; // Índice para saber qué imagen mostrar
    int contadorGiro = 0;
    Image campo, palaAzul, palaRoja;
    private JLabel labelRojo,labelAzul;
    private int puntosAzul = 0;
    private int puntosRojo = 0;
    
    public Poong() {
        labelRojo = new JLabel("0"); // Puedes poner texto o dejarlo vacío
        labelRojo.setForeground(Color.RED); 
        labelRojo.setFont(new Font("Arial", Font.BOLD, 100));
        this.add(labelRojo);
        labelAzul = new JLabel("0"); // Puedes poner texto o dejarlo vacío
        labelAzul.setForeground(Color.BLUE);
        labelAzul.setFont(new Font("Arial", Font.BOLD, 100));
        this.add(labelAzul);
        campo = new ImageIcon("demo\\src\\main\\resources\\campo2.png").getImage();
        palaAzul = new ImageIcon("demo\\src\\main\\resources\\PalaAzul2.png").getImage();
        palaRoja = new ImageIcon("demo\\src\\main\\resources\\PalaRoja2.png").getImage();
        //Imagenes de la bola en diferentes angulos
        animacionBola[0] = new ImageIcon("demo\\src\\main\\resources\\bola.png").getImage();
        animacionBola[1] = new ImageIcon("demo\\src\\main\\resources\\bola2.png").getImage();
        animacionBola[2] = new ImageIcon("demo\\src\\main\\resources\\bola3.png").getImage();
        animacionBola[3] = new ImageIcon("demo\\src\\main\\resources\\bola4.png").getImage();
        timer = new Timer(DELAY, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
    }

    public void inicializarPosiciones() {
        //Da valor a las variables segun las medidas del monitor
        if (!inicializado) { //Si inicializado es false da valor a todo y lo cambia a true
            x = getWidth() / 2;
            y = getHeight() / 2;
            ix = 40;
            rx = getWidth() - 100;
            iy = getHeight() / 2 - (alto / 2);
            ry = getHeight() / 2 - (alto / 2);
            xMarcadorRojo = (getWidth() / 2) - 200;
            xMarcadorAzul = (getWidth() / 2) + 100;
            inicializado = true;
        }
    }

    // Mètode que s'executa a cada tic del temporitzador per moure el cercle
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(campo, 0, 0, getWidth(), getHeight(), this);
        g2d.drawImage(animacionBola[frameActual], x, y, RADI * 3, RADI * 3, this);
        g2d.drawImage(palaAzul, rx, ry, ancho, alto, this);
        g2d.drawImage(palaRoja, ix, iy, ancho, alto, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!inicializado) { //Revisa que las varibles tengan valores y si no tienen ejecuta inicializarPosiciones
            inicializarPosiciones();
            return; 
        }
        if (x + 3 * RADI >= getWidth()) { //Si sale por la derecha cambia la puntuacion, resetea la bola y cambia la direccion
            if (puntosRojo < 5) puntosRojo++;
            labelRojo.setText(String.valueOf(puntosRojo));
            x = getWidth() / 2;
            y = getHeight() / 2;
            dx = -dx;
            if (puntosRojo == 5) { //Si llega a 5 puntos sale mensaje de victoria
                finalizar("¡GANADOR EQUIPO ROJO!");
            }
        } 
        else if (x + 3 * RADI <= 0) { //Si sale por la izquierda cambia la puntuacion, resetea la bola y cambia la direccion
            if (puntosAzul < 5) puntosAzul++;
            labelAzul.setText(String.valueOf(puntosAzul));
            x = getWidth() / 2;
            y = getHeight() / 2;
            dx = -dx;
            if (puntosAzul == 5) { //Si llega a 5 puntos sale mensaje de victoria
                finalizar("¡GANADOR EQUIPO AZUL!");
            }
        }
        if (y + 3 * RADI >= getHeight() - 20 || y <= 20) {
            dy = -dy;
        }
        if (x < rx + ancho && x + 3 * RADI > rx && y < ry + alto && y + 3 * RADI > ry) {
            dx = -dx;
        }
        if (x < ix + ancho && x + 3 * RADI > ix && y < iy + alto && y + 3 * RADI > iy) {
            dx = -dx;
        }
        
        //Animacion bola
        contadorGiro++;
        if (contadorGiro >= 9) { //Cada vez que el contador es 9 o mas cambia la imagen de la bola y resetea el contador
            frameActual = (frameActual + 1) % 4;
            contadorGiro = 0;
        }
        // Actualitza la posició del cercle
        x += dx;
        y += dy;
        repaint(); 
    }

    // Mètode principal per iniciar l'aplicació
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Laser Poong");
            Poong panel = new Poong();
            frame.add(panel);
            frame.setResizable(false);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    private void finalizar(String mensaje) {
        timer.stop(); //Para la bola
        JOptionPane.showMessageDialog(this, mensaje , "Fin del Juego", JOptionPane.INFORMATION_MESSAGE); //Muestra popup con el ganador y se cierra el juego al darle ok
        System.exit(0); 
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && ry > 0) { //Si presionas la flecha arriba
            ry -= vry;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && ry < getHeight() - alto) { //Si presionas la flecha abajo
            ry += vry;
        }
        if (e.getKeyCode() == KeyEvent.VK_W && iy > 0) {//Si presionas la W
            iy -= vry;
        }
        if (e.getKeyCode() == KeyEvent.VK_S && iy < getHeight() - alto) {//Si presionas la S
            iy += vry;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}