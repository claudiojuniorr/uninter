package uninter;

import java.util.Scanner;

public class Principal {
	public static double dolarValor;
	public static double euroValor;
	public static double realValor;
	public static void main(String[] args) {
		Cofrinho cofre = new Cofrinho();
		Scanner entrada = new Scanner(System.in);
		/*
		Início do código com o Menu.
		*/
		while(true) {
			Menu.infoMenu();
			int opcao = entrada.nextInt();
			if(opcao==1) {
				while(true) {
					int moeda;
					Menu.infoMoedas();
					moeda = entrada.nextInt();
					// Uso do Método adicionar(String moeda) da Classe Cofrinho.
					if(moeda==1) {
						System.out.println("Informe o valor de deposito: ");
						dolarValor = entrada.nextInt();
						cofre.adicionar("Dolar");
					}else if(moeda==2) {
						System.out.println("Informe o valor de deposito: ");
						euroValor = entrada.nextInt();
						cofre.adicionar("Euro");
					}else if(moeda==3) {
						System.out.println("Informe o valor de deposito: ");
						realValor = entrada.nextInt();
						cofre.adicionar("Real");
					}else if(moeda==0) {
						break;
					}
					else {
						System.out.println("Opção Invalida!");
					}	
				}		
			}
			// Uso do Método remover(String moeda, double valores) da Classe Cofrinho.
			else if(opcao==2){
				while(true) {
					int moeda;
					Menu.infoMoedas();
					moeda = entrada.nextInt();
					if(moeda==1) {
						System.out.println("Informe o valor de saque: ");
						dolarValor = entrada.nextInt();
						cofre.remover("Dolar", dolarValor);
					}else if(moeda==2) {
						System.out.println("Informe o valor de saque: ");
						euroValor = entrada.nextInt();
						cofre.remover("Euro", euroValor);
					}else if(moeda==3) {
						System.out.println("Informe o valor de saque: ");
						realValor = entrada.nextInt();
						cofre.remover("Real", realValor);
					}else if(moeda==0) {
						break;
					}else {
						System.out.println("Opção Invalida!");
					}					
				}						
			}
			// Uso do Método listagemMoedas() da Classe Cofrinho.
			else if(opcao==3) {
				cofre.listagemMoedas();
			}
			// Uso do Método moedaConvertida(int opcao) da Classe Cofrinho.
			else if(opcao==4) {
				Menu.infoConverterMoedas();
				int opcaoConversao = entrada.nextInt();
				cofre.moedaConvertida(opcaoConversao);
			}
			else if(opcao==5) {
				break;
			}else {
				System.out.println("Opção Invalida!");
			}
		}				
	}
}
