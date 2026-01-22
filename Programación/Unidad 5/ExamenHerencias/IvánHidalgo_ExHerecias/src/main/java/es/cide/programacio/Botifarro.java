package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
import java.util.Random;
public class Botifarro extends Torrada implements Menjar, Graella {
    Random random = new Random();
    boolean coent;
    public Botifarro(String festivitat, String any, boolean coent){
        super(festivitat, any);
        this.coent = coent;
    }

    //Getters y setters
    
    public String getFestivitat() {
        return festivitat;
    }

    public String getAny() {
        return any;
    }

    public boolean getCoent() {
        return coent;
    }

    public void setFestivitat(String festivitat) {
        this.festivitat = festivitat;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public void setCoent(boolean coent) {
        this.coent = coent;
    }

    //Metodos
    @Override
    public boolean crema() { //Delvuelve false si el numero random es 0
        int i = random.nextInt(2);
            if (i == 0) {
                return false;
            } else {
                return true;
            }
    }

    @Override
    public boolean estaFet() { //Si en numero generado es 0, 3 o 7 devuelve true
        int i = random.nextInt(10);
            if (i == 0 || i == 3 || i == 7) {
                return true;
            } else {
                return false;
            }
    }

    @Override
    public void posarCarnAGraella() {
        System.out.println("He posat el botifarró a la graella.");
    }

    public void llevarCarnDeGraella() {
    }

    @Override
    public void assaborir() {
        if (this.coent) { //Si coent es true delvuelve mensaje diferente
            System.out.println("Estic assaborint el botifarró i es coent.");
        } else {
            System.out.println("Estic assaborint el botifarró.");
        }
    }
}
