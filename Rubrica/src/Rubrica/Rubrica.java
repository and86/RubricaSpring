package Rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

		private Map<String,Voce> voci = new TreeMap<String,Voce>(); 
		
		
	
		//PROVA DEFINITIVA
		public Voce aggiungiVoce(String nome,String cognome,String tel) throws VoceGiaEsiste{
			
			if(voci.containsKey(nome+" "+cognome)){
				throw new VoceGiaEsiste("Voce Esistente in Rubrica!");
				
			}
			Voce v = new Voce(nome,cognome,tel); // SE NON ESISTE, CREO NUOVA VOCE
			voci.put(nome+" "+cognome, v); // INSERISCO IN RUBRICA
			
			return v;
		} // FINE METODO
		
		
		
}
