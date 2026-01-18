package es.cide.programacio;

public class CotxeCombustio extends Coche {

    private int capacitatDiposit;

    public CotxeCombustio(String matricula, String marca, int plaçes, int velocitatMax, int capacitatDiposit) {
        super(matricula, marca, plaçes, velocitatMax);
        this.capacitatDiposit = capacitatDiposit;
    }
    
    public double calcularPreuLloguer(int dies) {
        return 100 * dies;
    }
}
