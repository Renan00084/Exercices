package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0, opcao2 = 0;

        do{
            System.out.println("--- EXERCÍCIOS ---");
            System.out.println("1. Carros");
            System.out.println("2. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    int velocidade, ano;
                    double acelerar, frear;
                    String marca, modelo;

                    Carro carro = new Carro();

                    System.out.println("Digite a marca do carro: ");
                    marca = scanner.nextLine();
                    carro.setMarca(marca);

                    System.out.println("Digite o modelo do carro: ");
                    modelo = scanner.nextLine();
                    carro.setModelo(modelo);

                    System.out.println("Digite o ano do carro: ");
                    ano = scanner.nextInt();
                    carro.setAno(ano);
                    scanner.nextLine(); // limpa o buffer, ou seja, o enter que não é lido pelo nextInt

                    System.out.println("Digite a velocidade atual do carro: ");
                    velocidade = scanner.nextInt();
                    carro.setVelocidadeAtual(velocidade);
                    scanner.nextLine();

                    do{
                        System.out.println("--- CARRO ---");
                        System.out.println("1. Mostrar Velocidade Atual");
                        System.out.println("2. Acelerar");
                        System.out.println("3. Frear");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                carro.exibirVelocidade();

                            break;
                            case 2:
                                System.out.println("Digite o quanto voce deseja acelerar");
                                acelerar = scanner.nextInt();
                                scanner.nextLine();
                                carro.acelerar(acelerar);

                            break;
                            case 3:
                                System.out.println("Digite o quanto voce quer frear");
                                frear = scanner.nextInt();
                                scanner.nextLine();
                                carro.frear(frear);

                            break;
                        }


                    }while(opcao2 != 4);

                break;


            }

        }while(opcao != 2);

    }
}
