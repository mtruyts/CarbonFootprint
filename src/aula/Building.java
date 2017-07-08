package aula;

/**
 *  A classe Building recebe a consumação mensal de energia por hora de uma
 *  construção multiplicada pela quantidade de meses e retorna a pegada de
 *  carbono produzida
 *  
 * @author Matheus Truyts
 * @version 1.0
 *
 */

//Formula = (carbon footprint = kWh * 12).
//kwh = quantidade de energia gasta por hora.

public class Building implements CarbonFootprint {
	
    private double mediaMensalKwh; //consumação mensal de energia por hora
    private final int meses = 12;
    
    /**
	 * Constructor que recebe a a consumação mensal de energia por hora
	 * 
	 * @param consumoMensal - consumação mensal de energia por hora
	 * 
	 */
    public Building( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }
    
    /**
	 * Metodo que obtem a consumação mensal de energia por hora
	 * 
	 * @param consumoMensal - consumação mensal de energia por hora
	 * 
	 */
    public void setMediaMensalKwh( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }
    
    /**
	 * Metodo que retorna a consumação mensal de energia por hora
	 * 
	 * @return consumação mensal de energia por hora
	 * 
	 */
    public double getMediaMensalKwh() {
        return mediaMensalKwh;
    }
    
    /**
	 * Metodo que imprime consumação mensal de energia por hora
	 * 
	 * @return consumação mensal de energia por hora
	 * 
	 */
    
    @Override 
    public String toString() {
        return String.format("%s: %.2f", "Consumação mensal é ", getMediaMensalKwh() );
    }
    
    /**
	 * Metodo que calcula a pegada de carbono produzida por construções
     *
	 * @return CarbonFootprint de buildings
	 * 
	 */
    @Override
    public double getCarbonFootprint() {
        return getMediaMensalKwh() * meses;
    }
}
