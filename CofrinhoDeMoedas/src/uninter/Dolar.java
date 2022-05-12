package uninter;

public class Dolar extends Moeda{
	
	public double converterDolarParaRealOuEuro(String moedaParaConverter) {
		/*
		Converte Dolar em Real.
		*/
		if(moedaParaConverter=="Real") {
			if(this.getDolar()==null || this.getDolar()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getDolar()*5.08;
			}
		}
		/*
		Converte Dolar em Euro.
		*/
		else if(moedaParaConverter=="Euro") {
			if(this.getDolar()==null || this.getDolar()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getDolar()*0.95;
			}
		}
		else {
			System.out.println("Opção Invalida!");
		}
		return moedaConvertida;	
	}
}
