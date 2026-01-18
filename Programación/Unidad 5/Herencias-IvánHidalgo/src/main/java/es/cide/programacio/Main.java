package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        CotxeCombustio cotxeCombustio = new CotxeCombustio("1000HTP", "Citroen", 4, 130, 10);
        CotxeElectric cotxeElectric = new CotxeElectric("1001HDO", "Tesla", 5, 150);
        Patinet patinet = new Patinet("1002NDR", "Xiaomi", 500);

        double precio = cotxeCombustio.calcularPreuLloguer(20);
        cotxeCombustio.mostrarInfo();
        System.out.println("Preu cotxe combustio: " + precio);

        cotxeElectric.mostrarInfo();
        double precioElectrico = cotxeElectric.calcularPreuLloguer(20);
        System.out.println("Preu cotxe electric: " + precioElectrico);

        double precioPatinete = patinet.calcularPreuLloguer(20);
        patinet.mostrarInfo();
        System.out.println("Preu patinet: " + precioPatinete);
    }
}