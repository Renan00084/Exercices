package org.example;

public class Retangulo extends FormaGeometrica{
    private double base, altura;

    public double getBase(){
        return base;

    }

    public void setBase(double base){
        this.base = base;

    }

    public double getAltura(){
        return altura;

    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    @Override
    public double calcularArea(){
        aux = base * altura;
        return aux;

    }

    public void exibirInformacao(){
        System.out.println("Base: " + getBase() + "\nAltura: " + getAltura());

    }

}
