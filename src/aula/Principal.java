package aula;

import java.util.ArrayList;

/**
 * Classe que inicia o programa
 * 
 * @author Matheus Truyts
 * @version 1.0
 * 
 */

public class Principal {

	/**
	 * Metodo principal da aplicacao responsavel por executar o programa
	 * 
	 * @param args
	 * 
	 */ 

	public static void main( String[] args ) {
		//Cria um array de objetos do tipo CarbonFootprint
		ArrayList< CarbonFootprint > categories = new ArrayList< CarbonFootprint >();
		categories.add( new Bike( 300.00 ));
		categories.add( new Building( 5000.52 ));
		categories.add( new Car( 3845.25, 10.5 ));
		System.out.println("Dados de cada objeto: ");

		for( CarbonFootprint currentObject : categories ) {
			System.out.printf("\n%s: %s \n%s %s: %.2f\n",
					"Detalhes sobre ", currentObject.getClass().getName(),
					currentObject.toString(),
					"\nCarbon footprint é ", currentObject.getCarbonFootprint());
		}
	}
}