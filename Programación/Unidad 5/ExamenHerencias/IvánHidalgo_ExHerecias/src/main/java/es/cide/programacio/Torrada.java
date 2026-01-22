package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
public class Torrada {
    String festivitat;
    String any;

    public Torrada(String festivitat, String any) {
        this.festivitat =  festivitat;
        this.any = any;
    }
    
    //Getters y setters

    public String getAny() {
        return any;
    }

    public String getFestivitat() {
        return festivitat;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public void setFestivitat(String festivitat) {
        this.festivitat = festivitat;
    }
}
