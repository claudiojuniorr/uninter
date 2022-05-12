package uninter;

public class Moeda {
	public static double moedaConvertida;
	
	public Double getDolar() {
		return Cofrinho.listaMoedas.get("Dolar");
	}
	public Double getEuro() {
		return Cofrinho.listaMoedas.get("Euro");
	}
	public Double getReal() {
		return Cofrinho.listaMoedas.get("Real");
	}
	public static void info(){
		System.out.printf("Valor Convertido:%.2f %n", moedaConvertida);
	}
}
