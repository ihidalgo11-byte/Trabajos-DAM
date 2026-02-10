package es.cide.programacio;

import java.util.Random;
public class Cotxe extends Vehicle implements Manteniment, Energia{
    Random random = new Random();
    private boolean esTesla;

    public Cotxe(String propietari, String numBastidor, boolean esTesla) {
        super(propietari, numBastidor);
        this.esTesla = esTesla;
    }

    public void setEsTesla(boolean esTesla) {
        this.esTesla = esTesla;
    }

    public boolean getEsTesla() {
        return esTesla;
    } 
    
    @Override
    public boolean estaLlest() {
        int i = random.nextInt(1,5);
        if (i == 3) {
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
    public void finalitzarManteniment() {
        if (esTesla == true) {
            System.out.println("Manteniment finalitzat del cotxe. És un Tesla.");
        } else {
            System.out.println("Manteniment finalitzat del cotxe.");
        }
    }
    public void revisarVehicle() {
        System.out.println("Iniciant revisió del cotxe...");
    }
    public void carregarBateria() {
        if (esTesla == true && estaLlest()) {
            System.out.println("Bateria del cotxe al 100%");
        }
    }
    

}
