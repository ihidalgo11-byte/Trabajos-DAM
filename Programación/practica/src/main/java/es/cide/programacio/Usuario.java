package es.cide.programacio;

public class Usuario {
    private  String nom;
    private int id;
    private int maxLlibres;
    private  int llibresPrestecs;

    public Usuario(String nom, int id, int maxLlibres) {
        this.nom = nom;
        this.maxLlibres = maxLlibres;
        llibresPrestecs = 0;
    }

    public int getId() {
        return id;
    }

    public int getLlibresPrestecs() {
        return llibresPrestecs;
    }

    public int getMaxLlibres() {
        return maxLlibres;
    }

    public String getNom() {
        return nom;
    }
    
    public boolean solicitarPrestec(Llibre llibre) {
        if (llibresPrestecs < maxLlibres) {
            if (llibre.prestar()) {
                llibresPrestecs++;
                return true;
            } else {
            return false;
        }
        } else {
            return false;
        }
    }
    public void retornarLlibre(Llibre llibre) {
        llibre.retornar();
        llibresPrestecs--;
    }
}
