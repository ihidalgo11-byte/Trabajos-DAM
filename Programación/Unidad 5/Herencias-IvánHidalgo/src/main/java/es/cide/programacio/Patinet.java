package es.cide.programacio;

public class Patinet extends Vehicle implements Recarregable {
    
    private double preu;
    private int bateria;


    public Patinet(String matricula, String marca, int bateria) {
        super(matricula, marca);
        this.bateria = bateria;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== FITXA PATINET ===");
        System.out.println("Marca del patinet: " + marca);
        System.out.println("Matrícula del patinet: " + matricula);
    }
    public void carregarBateria(){
        this.bateria = 100;
    }
    
    public int getNivellBateria() {
        return bateria;
    }
    
    public double calcularPreuLloguer(int dies) {
        return 50 * dies;
    }
} 
