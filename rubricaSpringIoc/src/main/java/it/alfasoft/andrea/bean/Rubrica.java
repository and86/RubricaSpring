package it.alfasoft.andrea.bean;



import java.util.List;

public class Rubrica {

	private String nome;
	private List<Voce>voci;
	
	
	
	public Rubrica() {
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Voce> getVoci() {
		return voci;
	}
	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
	
public void stampaVoci(){
		
		for(Voce v : voci){
		System.out.println(v.getNome()+" "+v.getTelefono());
		}
	
	}
	
	public Voce getVoceByNome(String nome){
		
			Voce vTemp=null;
			for(Voce v: voci){
				if(v.getNome().equals(nome)){
					vTemp=v;
					System.out.println(v.getNome()+" "+v.getTelefono());
				}
			}
			return vTemp;
	}
	
	
	
	
}
