package it.polito.tdp.anagrammi.model;

public class Parola {
	
	private String p;
	
	public Parola() {
		p="";
	}
	 
	public int conta(char c) {
		int contatore = 0;
		for(char lettera : p.toCharArray())
			if((int)c==(int)lettera)
				contatore++;
			return contatore;
	}

	public void removeLast(int liv) {
		String pp = p;
	p = pp.substring(0, liv);
	}

	public Parola(String p) {
		super();
		this.p = p;
	}

	public String getP() {
		return p;
	}
	

	public void setP(String p) {
		this.p = p;
	}
	
	public void aggiungiLettera(char c) {
		p += c;
	}
	
	
	public String toString() {
		return p;
	}
	
	

}
