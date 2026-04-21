package org.example;

public class Vendedor extends Colaborador{
    private double comissao;

    public double getComissao(){
        return comissao;

    }

    public void setComissao(double comissao){
        this.comissao = comissao;

    }

    @Override
    public void exibirInformacao(){
        System.out.println("Nome: " + getNome() + "\nSalario Base: " + getSalarioBase() + "\nComissao: " + getComissao());

    }

    @Override
    public double calcularSalario(){
        aux = salarioBase;
        aux += comissao;
        return aux;

    }

}
