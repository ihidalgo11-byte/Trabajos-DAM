package es.cide.programacio;

public class PirataNormal extends Pirata {
    
    private Boolean vivo;
    
    public PirataNormal(String[] insultos, String[] respuestas, String nom, int vida) {
        super(insultos, respuestas, nom, vida);
        this.vivo = true;
        
    }

    public void sayHello() {
        System.out.println("Mira quién se atreve a poner un pie en estas aguas…");
    }
    
    public void sayGoodBye() {
        System.out.println("¡Juro… que… volveré… como fantasma!");
    }

    public void defensar(){}

}
