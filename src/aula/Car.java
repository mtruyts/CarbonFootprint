package aula;

/**
 *  A classe Car recebe as milhas anuais, a media de milhas por galão e o
 *  kgCO2PorMilha gastas por um carro e calcula sua pegada de carbono
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

/*Queimando um galão de gás, emite-se 9 kg de dióxido de carbono na atmosfera. Então, 
para calcular as suas emissões de condução:
	(Galões/ano * 9 kg/galão = Kilogramas de dioxido de carbono/ano).
 */

//Media milhas/ano x media MPG = Galões/ano

public class Car implements CarbonFootprint {

	private double milhasAnuais; //milhas anuais
	private double mediaMPG; //media de milhas por galão
	private final int kgCO2PorMilha = 9; //kilogramas de dioxido de carbono por milha

	/**
	 * Constructor que recebe a quantidade de milhas gastas no ano e
	 * a media de milhas por galão
	 * 
	 * @param milhas - milhas anuais 
	 * @param MPG - media de milhas por galão
	 * 
	 */
	public Car( double milhas, double MPG ) {
		milhasAnuais = milhas;
		mediaMPG = MPG;
	}

	/**
	 * Metodo que obtem a quantidade de milhas gastas no ano 
	 * 
	 * @param  milhas - milhas anuais
	 * 
	 */
	public void setMilhasAnuais( double milhas ) {
		milhasAnuais = milhas;
	}

	/**
	 * Metodo que obtem a media de milhas por galão 
	 * 
	 * @param MPG - media de milhas por galão
	 * 
	 */
	public void setMediaMPG( double MPG ) {
		mediaMPG = MPG;
	}

	/**
	 * Metodo que retorna a quantidade de milhas gastas no ano 
	 * 
	 * @return milhas anuais
	 * 
	 */
	public double getMilhasAnuais() {
		return milhasAnuais;
	}

	/**
	 * Metodo que retorna a media de milhas por galão 
	 * 
	 * @return media de milhas por galão
	 * 
	 */
	public double getMediaMPG() {
		return mediaMPG;
	}

	/**
	 * Metodo que imrime a media de milhas gastas no ano e
	 * a media de milhas por galão
	 *
	 * @return media de milhas gastas no ano
	 * @return media de milhas por galão
	 * 
	 */
	@Override
	public String toString() {
		return String.format( "%s: %.2f \n%s: %.2f ",
				"Media anual de milhas ", getMilhasAnuais(),
				"Media MPG é ", getMediaMPG() );
	}

	/**
	 * Metodo que calcula a pegada de carbono produzida por carros
	 *
	 * @return CarbonFootprint de carros
	 * 
	 */
	@Override
	public double getCarbonFootprint() {
		return (( getMilhasAnuais() * getMediaMPG() ) * kgCO2PorMilha );
	}
}
