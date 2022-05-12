package uninter;

public class Real extends Moeda{
	public double converterRealParaDolarOuEuro(String moedaParaConverter) {
		/*
		Converte Real em Dolar.
		*/
		if(moedaParaConverter=="Dolar") {
			if(this.getReal()==null || this.getReal()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getReal()*0.20;
			}
		}
		/*
		Converte Real em Euro.
		*/
		else if(moedaParaConverter=="Euro") {
			if(this.getReal()==null || this.getReal()<=0) {
				return moedaConvertida;
			}else {
				return moedaConvertida = this.getReal()*0.19;
			}
		}
		else {
			System.out.println("Opção Invalida!");
		}
		return moedaConvertida;	
	}
}
