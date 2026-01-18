package es.cide.programacio;

public class Vehicle {
    
    String propietari;
    String numBastidor;

    public Vehicle(String propietari, String numBastidor) {
        this.propietari = propietari;
        this.numBastidor = numBastidor;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }
    
}
