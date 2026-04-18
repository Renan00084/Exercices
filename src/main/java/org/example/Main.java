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
                    do{
                        int velocidade, ano, acelerar, frear;
                        String marca, modelo;

                        Carro carro = new Carro();

                        System.out.println("Digite a marca do carro: ");
                        marca = scanner.nextLine();
                        Carro.setMarca(String marca);
                        scanner.nextLine();

                        System.out.println("Digite o modelo do carro: ");
                        modelo = scanner.nextLine();
                        Carro.setModelo(String modelo);
                        scanner.nextLine();

                        System.out.println("Digite o ano do carro: ");
                        ano = scanner.nextInt();
                        Carro.setAno(int ano);
                        scanner.nextLine();

                        System.out.println("Digite a velocidade atual do carro: ");
                        velocidade = scanner.nextInt();
                        Carro.setVelocidadeAtual(int velocidade);
                        scanner.nextLine();

                        System.out.println("--- CARRO ---");
                        System.out.println("1. Mostrar Velocidade Atual");
                        System.out.println("2. Acelerar");
                        System.out.println("3. Frear");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                Carro.exibirVelocidade();

                            break;
                            case 2:
                                System.out.println("Digite o quanto voce deseja acelerar");
                                acelerar = scanner.nextInt();
                                Carro.acelerar(double acelerar);

                            break;
                            case 3:
                                System.out.println("Digite o quanto voce quer frear");
                                frear = scanner.nextInt();
                                Carro.frear(double frear);

                            break;
                        }


                    }while(opcao2 != 4);

                break;


            }

        }while(opcao != 2);

    }
}
