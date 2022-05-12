package uninter;

public class Euro extends Moeda {
	public double converterEuroParaRealOuDolar(String moedaParaConverter) {
		/*
		Converte Euro em Real.
		*/
		if(moedaParaConverter=="Real") {
			if(this.getEuro()==null || this.getEuro()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getEuro()*5.24;
			}
		}
		/*
		Converte Euro em Dolar.
		*/
		else if(moedaParaConverter=="Dolar") {
			if(this.getEuro()==null || this.getEuro()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getEuro()*1.05;
			}
		}
		else {
			System.out.println("Opção Invalida!");
		}
		return moedaConvertida;	
	}
}
