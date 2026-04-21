package org.example;

public class Colaborador {
    protected String nome;
    protected double salarioBase, aux;

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public double getSalarioBase(){
        return salarioBase;

    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;

    }

    public double calcularSalario(){
        return salarioBase;

    }

    public void exibirInformacao(){
        System.out.println("Nome: " + getNome() + "\nSalario Base: " + getSalarioBase());

    }

}
