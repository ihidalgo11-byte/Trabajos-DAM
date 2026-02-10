package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Vehicle v;
        Cotxe c = new Cotxe("Alex", "J7423G", false);
        Moto m = new Moto("Hugo","K9834M");
        System.out.println("Benvingut al taller de reparacions 2026.");
        System.out.println("Vehicle registrat: Cotxe de " + c.getPropietari());
        System.out.println("Vehicle registrat: Moto de " + m.getPropietari());
        c.revisarVehicle();
        m.revisarVehicle();
        System.out.println("Estat de la reparació:");
        while (!c.estaLlest() && !m.estaLlest()) {
            if (!c.estaLlest() && m.estaLlest()) {
                System.out.println("El cotxe encara està al taller i la moto està llesta. Cal esperar.");
            }
            if (c.estaLlest() && !m.estaLlest()) {
                System.out.println("La moto encara està al taller i es cotxe està llest. Cal esperar.");
            }
        }
        System.out.println("El cotxe està llest i la moto està llesta. Vehicles entregats!");
        c.finalitzarManteniment();
        m.finalitzarManteniment();
    }
}