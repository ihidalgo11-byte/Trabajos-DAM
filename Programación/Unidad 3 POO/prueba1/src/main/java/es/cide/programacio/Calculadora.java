package es.cide.programacio;

public class Calculadora {
    //Atributos
    double operando1;
    double operando2;
    //Constructor
    public Calculadora(double operando11,double operando22) {
        this.operando1=operando11;
        this.operando2=operando22;
    }
    //Getters y Setters
    public void setOperando1(double operando33) {
        this.operando1=operando33;
    }   
    public double getOperando1() {
        return this.operando1;
    }
    //Metodos
    public double sumar() {
        double resultadoSuma = operando1+operando2;
        return resultadoSuma;
    }
    public double restar() {
        double resultadoResta = operando1-operando2;
        return resultadoResta;
    }
    public double multiplicar() {
        double resultadoMultiplicacion = operando1*operando2;
        return resultadoMultiplicacion;
    }
    public double dividir() {
        double resultadoDivision = operando1/operando2;
        return resultadoDivision;
    }
}
