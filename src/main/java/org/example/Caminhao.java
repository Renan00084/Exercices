package org.example;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public double getCapacidadeCarga(){
        return capacidadeCarga;

    }

    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;

    }

    @Override
    public void exibirInformacao(){
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCapacidade de carga: " + getCapacidadeCarga());

    }

}
