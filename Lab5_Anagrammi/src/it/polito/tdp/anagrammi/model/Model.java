package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;

import java.util.List;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class Model {
	
	List <Parola> anagrammi;
	int livello = 0;

	
	public List<String> cercaAnagrammi(String parola){
		anagrammi = new ArrayList<Parola>();
		Parola parziale = new Parola();
		recursive(new Parola(parola), parziale , livello);
		List <String> a = new ArrayList<String>();
		for(Parola p : anagrammi)
			a.add(p.getP());
		return a;
		
	}
	
	private void recursive(Parola parola, Parola parziale, int livello) {
		
		if(livello == parola.getP().length() ) {
			this.anagrammi.add(new Parola(parziale.getP()));
			return;
		}		
		
		
		for(int i = 0; i<parola.getP().length();  i++) {
			
			char c = parola.getP().charAt(i);
			if(parola.conta(c) > parziale.conta(c)) {
				parziale.aggiungiLettera(c);
	     		recursive(parola, parziale, livello+1);
			    parziale.removeLast(parziale.getP().length()-1);
			}
		}		
		}

	public boolean dizionarioModel(String p){
		DizionarioDAO d = new DizionarioDAO();
		return d.cercaDaDizionario(p);
	}
	
	
		
	}




