package es.cide.programacio;

public class Vehicle {
    String propietari;
    String numBastidor; //numero de serie

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
