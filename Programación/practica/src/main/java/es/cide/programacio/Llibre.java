package es.cide.programacio;

public class Llibre {

    private String titol;
    private String autor;
    private int numExemplars;
    private int disponibles;

    public Llibre(String titol, String autor, int numExemplars) {
        this.titol = titol;
        this.autor = autor;
        this.numExemplars = numExemplars;
        this.disponibles = numExemplars;
    }

    public String getAutor() {
        return autor;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public int getNumExemplars() {
        return numExemplars;
    }

    public String getTitol() {
        return titol;
    }
    
    public boolean prestar() {
        
        if (disponibles > 0) {
            disponibles--;
            return true;
        } else {
            return false;
        }
    }
    
    public void retornar() {
        disponibles++;
    }

    public String toString() {
         return "Titol: "+getTitol()+ ", Autor: "+ getAutor()+ ", Exemplars totals: "+getNumExemplars()+ " y disponibles "+getDisponibles();
    }
     
}
