package es.cide.programacio;

import java.util.Random;

public class Moto extends Vehicle implements Manteniment, Energia{
    Random random = new Random();
    public Moto(String propietari, String numBastidor){
        super(propietari, numBastidor);

    }

    @Override
    public boolean estaLlest() {
        int i = random.nextInt(1,5);
        if (i == 3 || i == 4 || i == 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean teCorrent() {
        int i = random.nextInt(0,1);
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
    public void carregarBateria() {
        if (estaLlest()) {
            System.out.println("Bateria de la moto al 100%");
        }
    }

}
