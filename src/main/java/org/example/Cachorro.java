package org.example;

public class Cachorro extends Animal{
    private String raca;

    public String getRaca(){
        return raca;

    }

    public void setRaca(String raca){
        this.raca = raca;

    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\nPeso: " + getPeso() + "\nRaca: " + getRaca());

    }

    @Override
    public void emitirSom(){
        System.out.println("Au au!");

    }

}
