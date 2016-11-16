package it.alfasoft.andrea.bean;



import java.util.List;

public class Rubrica {

	private String nome;
	private List<Voce>voci;
	
	
	
	public Rubrica() {
	}
	
public void stampaVoci(){
		
		for(Voce v : voci){
		System.out.println(v.getNome()+" "+v.getTelefono());
		}
	
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
	
	
	
	
}
