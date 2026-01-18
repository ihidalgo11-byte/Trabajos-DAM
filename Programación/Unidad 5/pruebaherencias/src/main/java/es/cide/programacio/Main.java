package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Vehicle v;
        Cotxe c = new Cotxe("Andres", "1234", false);
        Moto m = new Moto("Alex", "5678");

        System.out.println("Vehicle registrat: Cotxe de " + c.getPropietari() + " y numero de bastidor " + c.getNumBastidor());
        System.out.println("Vehicle registrat: Moto de " + m.getPropietari() + " y numero de bastidor " + m.getNumBastidor());
        c.revisarVehicle();
        m.revisarVehicle();
        System.out.println("Estat de la reparació:");
        
        while (!c.estaLlest() || !m.estaLlest()) {
            if (c.estaLlest() && !m.estaLlest()) {
                System.out.println("El cotxe encara està al taller i la moto està llesta. Cal esperar.");
            } else if (!c.estaLlest() && m.estaLlest()) {
                System.out.println("El cotxe encara està al taller i la moto està llesta. Cal esperar.");
            } else if (!c.estaLlest() && !m.estaLlest()) {
                System.out.println("El cotxe encara està al taller i la moto encara està en al taller. Cal esperar.");
            }
        }
        System.out.println("El cotxe està llest i la moto està llesta. Vehicles entregats!");
        c.finalitzarManteniment();
        m.finalitzarManteniment();
    }
}