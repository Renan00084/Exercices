package org.example;

public class Administrativo extends Colaborador{
    @Override
    public double calcularSalario(){
        aux = salarioBase;
        aux += (aux * 0.10);
        return aux;

    }

}
