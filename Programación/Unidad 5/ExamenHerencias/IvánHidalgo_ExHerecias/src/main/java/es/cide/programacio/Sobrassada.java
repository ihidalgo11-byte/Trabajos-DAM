package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
import java.util.Random;
public class Sobrassada extends Torrada implements Graella, Menjar {
    Random random = new Random();
    public Sobrassada(String festivitat, String any){
        super(festivitat, any);
    }
    
    //Getters y setters

    public String getAny() {
        return any;
    }

    public String getFestivitat() {
        return festivitat;
    }

    public void setAny(String any) {
        this.any = any;
    }

    
    public void setFestivitat(String festivitat) {
        this.festivitat = festivitat;
    }
    //Metodos
    @Override
    public boolean estaFet() { //Delvuelve false si el numero random es 0 o true si es 1
        int i = random.nextInt(2);
            if (i == 0) {
                return false;
            } else {
                return true;
            }
    }

    @Override
    public boolean crema() { //Delvuelve false si el numero random es 0 o true si es 1
        int i = random.nextInt(2);
            if (i == 0) {
                return false;
            } else {
                return true;
            }
    }

    @Override
    public void posarCarnAGraella() {
        System.out.println("He posat la sobrassada a la graella.");
    }

    public void llevarCarnDeGraella() {
    }

    @Override
    public void assaborir() {
        System.out.println("Estic assaborint la sobrassada.");
    }

    
}
