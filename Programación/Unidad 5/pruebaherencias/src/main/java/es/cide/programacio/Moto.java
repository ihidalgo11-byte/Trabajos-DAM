package es.cide.programacio;

import java.util.Random;
public class Moto extends Vehicle implements Manteniment,Energia {
    Random random = new Random();
    boolean llest;
    
    public Moto(String propietari, String numBastidor) {
        super(propietari,numBastidor);
        
    }

    public void carregarBateria() {}

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
        System.out.println("Iniciant revisió de la moto...");
    }

    @Override
    public void finalitzarManteniment() {
        System.out.println("Manteniment finalitzat de la moto.");
    }

    @Override
    public boolean estaLlest() {
        int r = random.nextInt(5);
        if (r == 0 || r == 1 || r == 2) {
            return true;
        } else {
            return false;
        }
    }
}

