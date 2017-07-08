package aula;

/**
 *  A classe Bike recebe as milhas anuais e as calorias gastas por milha
 *  por uma bicicleta e calcula sua pegada de carbono
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

//São gastos 34 calorias a cada milha, utilizando bicicletas.
//Fórmula = (carbon footprint = milhas anuais * 34).

public class Bike implements CarbonFootprint {

	private double milhasAno;
	private final int caloriasPorMilha = 34; //calorias gastas por milha

	/**
	 * Constructor que recebe a quantidade de milhas gastas no ano
	 * 
	 * @param milhas - milhas gastas no ano
	 * 
	 */
	public Bike( double milhas ) {
		milhasAno = milhas;
	}

	/**
	 * Metodo que obtem a quantidade de milhas gastas no ano
	 * 
	 * @param milhas - milhas gastas no ano
	 * 
	 */
	public void setMilhasAno( double milhas ) {
		milhasAno = milhas;
	}

	/**
	 * Metodo que retorna a quantidade de milhas gastas no ano
	 * 
	 * @return milhas gastas no ano
	 * 
	 */
	public double getMilhasAno() {
		return milhasAno;
	}

	/**
	 * Metodo que imprime a quantidade de milhas gastas no ano
	 * 
	 * @return milhas gastas no ano
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%s: %.2f", "Milhas anuais ", getMilhasAno());
	}

	/**
	 * Metodo que calcula a pegada de carbono produzida por bicicletas
	 * 
	 * @return CarbonFootprint de bikes
	 * 
	 */
	@Override
	public double getCarbonFootprint() {
		return milhasAno * caloriasPorMilha;
	}
}
