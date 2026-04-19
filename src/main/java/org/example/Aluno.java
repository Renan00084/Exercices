package org.example;

public class Aluno {
    private String nome, matricula;
    private double nota1, nota2, calculo = 0;

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getMatricula(){
        return matricula;

    }

    public void setMatricula(String matricula){
        this.matricula = matricula;

    }

    public double getNota1(){
        return nota1;

    }

    public void setNota1(double nota1){
        this.nota1 = nota1;

    }

    public double getNota2(){
        return nota2;

    }

    public void setNota2(double nota2){
        this.nota2 = nota2;

    }

    public void calcularMedia(){
        calculo = (getNota1() + getNota2()) / 2;

        System.out.println("A sua Media foi: " + calculo);

    }

    public void verificarAprovacao(){
        if(calculo == 0){
            System.out.println("Primeiro calcule sua media!");

        }else{
            if(calculo >= 7){
                System.out.println("Voce foi aprovado! Media: " + calculo);

            }else{
                System.out.println("Voce nao foi aprovado ;-;. Media: " + calculo);

            }
        }

    }

}
