package es.cide.programacio;

public class CotxeElectric extends Coche implements Recarregable {
    private int bateria;
    
    public CotxeElectric(String matricula, String marca, int plaçes, int velocitatMax) {
        super(matricula, marca, plaçes, velocitatMax);
        this.bateria = 100;
    }
    
    public double calcularPreuLloguer(int dies) {
        return 200 * dies;
    }
    
    public int getNivellBateria() {
        return bateria;
    }
    public void carregarBateria(){
        this.bateria = 100;
    }
}
