package es.cide.programacio;

import java.util.Random;
public class Cotxe extends Vehicle implements Manteniment,Energia {
    Random random = new Random();
    boolean esTesla;
    boolean llest;
    public Cotxe(String propietari, String numBastidor, boolean esTesla) {
        super(propietari,numBastidor);
        this.esTesla = esTesla;
        llest = false;
    }


    public void carregarBateria(){}

    @Override
    public boolean teCorrent() {
        int i = random.nextInt(2);
        if (i == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void revisarVehicle() {
        System.out.println("Iniciant revisió del cotxe...");
    }

    @Override
    public void finalitzarManteniment() {
        if (esTesla) {
            System.out.println("Manteniment finalitzat del cotxe. És un Tesla.");
        } else {
            System.out.println("Manteniment finalitzat del cotxe.");
        } 
    }

    @Override
     public boolean estaLlest() {
        if (llest) {
            return true;
        }
        int r = random.nextInt(5);
        if (r == 1) {
            llest = true;
            return true;
        } else {
            return false;
        }
    }
    
}
