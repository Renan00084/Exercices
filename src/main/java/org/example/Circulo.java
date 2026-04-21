package org.example;

public class Circulo extends FormaGeometrica{
    private double raio;

    public double getRaio(){
        return raio;

    }

    public void setRaio(double raio){
        this.raio = raio;

    }

    @Override
    public double calcularArea(){
        aux = 2 * 3.14 * raio;
        return aux;

    }

    public void exibirInformacao(){
        System.out.println("Raio: " + getRaio());

    }


}
