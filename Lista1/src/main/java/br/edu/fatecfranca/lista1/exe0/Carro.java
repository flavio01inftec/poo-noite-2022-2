package br.edu.fatecfranca.lista1.exe0;

public class Carro { 
    public String marca, modelo;
    public double velAtual;
    public boolean StatusMotor;


public Carro(){

}

public Carro (String marca, String modelo, double velAtual, boolean StatusMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velAtual = velAtual;
        this.StatusMotor = StatusMotor;
}

public void ligar() {
        if (this.StatusMotor){
        this.StatusMotor = true;
        }
}

public void desligar() {
        if (this.velAtual > 0){
            this.velAtual = 0;
        }
        if (this.StatusMotor){
        this.StatusMotor = false;
        }
}

public void acelerar(double x) {
    if(this.StatusMotor){
        this.velAtual += x;
    }
        else System.out.println("Carro desligado!");
    }

public void frear(double x) {
    if(this.StatusMotor)
       if(this.velAtual <= x) {
            this.velAtual -= x;
    }
       else System.out.println("Carro desligado!");
}
}


