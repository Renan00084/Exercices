package org.example;

public class Animal {
    protected String nome;
    protected double peso;

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public double getPeso(){
        return peso;

    }

    public void setPeso(double peso){
        this.peso = peso;

    }

    public void emitirSom(){
        System.out.println("Som de animal");

    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\nPeso: " + getPeso());

    }

}
