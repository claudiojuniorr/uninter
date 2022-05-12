package uninter;
import java.util.HashMap;

public class Cofrinho {
	static HashMap<String,Double> listaMoedas = new HashMap<String,Double>();
	/* 
	 Método para adicionar um valor ao cofre onde irá receber uma entrada informando qual a moeda e em seguida 
	 será adicionado o valor.
	*/
	public void adicionar(String moeda) {
		if(moeda=="Dolar") {
			double totalDolar;
			if(listaMoedas.get("Dolar")==null) {
				totalDolar = Principal.dolarValor;
				listaMoedas.put(moeda, totalDolar);
			}else {
				totalDolar = listaMoedas.get("Dolar")+ Principal.dolarValor;
				listaMoedas.put(moeda, totalDolar);
			}	
		}else if(moeda=="Euro") {
			double totalEuro;
			if(listaMoedas.get("Euro")==null) {
				totalEuro = Principal.euroValor;
				listaMoedas.put(moeda, totalEuro);
			}else {
				totalEuro = listaMoedas.get("Euro")+ Principal.euroValor;
				listaMoedas.put(moeda, totalEuro);
			}
		}else if(moeda=="Real") {
			double totalReal;
			if(listaMoedas.get("Real")==null) {
				totalReal = Principal.realValor;
				listaMoedas.put(moeda, totalReal);
			}else{
				totalReal = listaMoedas.get("Real")+ Principal.realValor;
				listaMoedas.put(moeda, totalReal);
			}
		}
	}
	/* 
	 Método para remover um valor ao cofre onde irá receber uma entrada informando qual a moeda e em seguida 
	 será removido o valor informado.
	*/
	public void remover(String moeda, double valores) {
		double removeDolar;
		// Remover valor em Dolar.
		if(moeda=="Dolar") {
			if(listaMoedas.get("Dolar")==null || listaMoedas.get("Dolar")<=0 || Principal.dolarValor>listaMoedas.get("Dolar")) {
				System.out.println("\nValor indisponível para saque!");
			}else {
				removeDolar = listaMoedas.get("Dolar")- Principal.dolarValor;
				listaMoedas.put(moeda, removeDolar);
			}
		// Remove valor em Euro.
		}else if(moeda=="Euro") {
			double removeEuro;
			if(listaMoedas.get("Euro")==null || listaMoedas.get("Euro")<=0 || Principal.euroValor>listaMoedas.get("Euro")) {
				System.out.println("\nValor indisponível para saque!");
			}else {
				removeEuro = listaMoedas.get("Euro")- Principal.euroValor;
				listaMoedas.put(moeda, removeEuro);
			}
		// Remove valor em Real.
		}else if(moeda=="Real") {
			double removeReal;
			if(listaMoedas.get("Real")==null || listaMoedas.get("Real")<=0 || Principal.realValor>listaMoedas.get("Real")) {
				System.out.println("\nValor indisponível para saque!");
			}else {
				removeReal = listaMoedas.get("Real")- Principal.realValor;
				listaMoedas.put(moeda, removeReal);
			}
		}	
	}
	/*
	Método para listar os valores de cada moeda.
	*/
	public void listagemMoedas() {
		for( String chave : listaMoedas.keySet()) {
			System.out.println(chave+": " + listaMoedas.get(chave));
		}
	}
	/*
	Método no qual irá retornar o valor convertido em cada moeda. 
	*/
	public double moedaConvertida(int opcao) {
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		Real real = new Real();
		double totalMoedaConvertido = 0;
		while(true) {
			// Dolar para Real.
			if(opcao==1) {
				dolar.converterDolarParaRealOuEuro("Real");
				Moeda.info();
				break;
			}
			// Dolar para Euro.
			else if(opcao==2) {
				dolar.converterDolarParaRealOuEuro("Euro");
				Moeda.info();
				break;
			}
			// Euro para Real.
			else if(opcao==3) {
				euro.converterEuroParaRealOuDolar("Real");
				Moeda.info();
				break;
			}
			// Euro para Dolar.
			else if(opcao==4) {
				euro.converterEuroParaRealOuDolar("Dolar");
				Moeda.info();
				break;
			}
			// Real para Dolar.
			else if(opcao==5) {
				real.converterRealParaDolarOuEuro("Dolar");
				Moeda.info();
				break;
			}
			// Real para Euro.
			else if(opcao==6) {
				real.converterRealParaDolarOuEuro("Euro");
				Moeda.info();
				break;
			}
			// Total dos valores em Real.
			else if(opcao==7) {
				for(String chave : listaMoedas.keySet()) {
					if(chave=="Dolar") {
						totalMoedaConvertido += dolar.converterDolarParaRealOuEuro("Real");
					}else if(chave=="Euro") {
						totalMoedaConvertido += euro.converterEuroParaRealOuDolar("Real");
					}else if(chave=="Real") {
						totalMoedaConvertido += listaMoedas.get("Real");
					}
				}
				if(totalMoedaConvertido>0) {
					System.out.println("Cotação atual do Dolar em Real R$5,08");
					System.out.println("Cotação atual do Euro em Real R$5,24\n");
					System.out.printf("Total Convertido: R$%.2f %n ", totalMoedaConvertido);
					break;
				}else {
					System.out.println("Cofrinho Zerado\n");
					System.out.printf("Valor: R$%.2f %n ", totalMoedaConvertido);
					break;
				}
			}
			else if(opcao==0) {
				break;
			}else {
				System.out.println("Opção Invalida!\n");
				break;
			}
		}
		return totalMoedaConvertido;
	}
}