package es.cide.programacio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        String[] autores = {
            "Gabriel García Márquez",
            "Jane Austen",
            "George Orwell",
            "Isabel Allende"
        };
        String[] titulos = {
            "Cien años de soledad",
            "Orgullo y prejuicio",
            "1984",
            "La casa de los espíritus"
        };
        Llibre[] arrayLlibres = new Llibre[4];
        for (int i = 0; i < 4; i++) {
            int aleatorio = random.nextInt(5)+1;
            arrayLlibres[i] = new Llibre(titulos[i], autores[i], aleatorio);
        }
        Usuario usuario1 = new Usuario("Hugo", 67, 3);
        Usuario usuario2 = new Usuario("Xisco", 69, 2);

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayLlibres[i]);

            if (usuario1.solicitarPrestec(arrayLlibres[i])) {
                System.out.println("El préstec del usuari1 ha estat reeixit");
                System.out.println("Cantidad de libros maximos: "+usuario1.getMaxLlibres());
                System.out.println("Cantidad de libros alquilados: "+usuario1.getLlibresPrestecs());
                System.out.println("");
            } else {
                System.out.println("El préstec del usuari1 no ha estat reeixit");
                System.out.println("");
            }
            if (usuario2.solicitarPrestec(arrayLlibres[i])) {
                System.out.println("El préstec del usuari2 ha estat reeixit");
                System.out.println("Cantidad de libros maximos: "+usuario2.getMaxLlibres());
                System.out.println("Cantidad de libros alquilados: "+usuario2.getLlibresPrestecs());
                System.out.println("");
            } else {
                System.out.println("El préstec del usuari2 no ha estat reeixit");
                System.out.println("");
            }
        }
        int libroAleatorio = random.nextInt(4);
        usuario1.retornarLlibre(arrayLlibres[libroAleatorio]);
        System.out.println("El usuario 1 ha devuelto uno de los libros");
        System.out.println("Usuario 1 tiene "+usuario1.getLlibresPrestecs()+" alquilados con un maximo de "+usuario1.getMaxLlibres());
        System.out.println("Usuario 2 tiene "+usuario2.getLlibresPrestecs()+" alquilados con un maximo de "+usuario2.getMaxLlibres());

    }
}