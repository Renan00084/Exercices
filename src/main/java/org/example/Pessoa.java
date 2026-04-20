package org.example;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean flag = false;

    Scanner scan = new Scanner(System.in);

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public int getIdade(){
        return idade;

    }

    public void setIdade(int idade){
        do{
            if((idade > 0) && (idade < 100)){
                this.idade = idade;
                flag = true;

            }else{
                System.out.println("Idade invalida, tente novamente");
                System.out.println("Digite a idade da pessoa: ");
                idade = scan.nextInt();
                scan.nextLine();

            }

        }while (flag == false);

    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + " anos");

    }
}
