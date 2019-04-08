package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model m = new Model();
		List<String> parole;
		parole = new ArrayList<String>(m.cercaAnagrammi("tela"));
		
		for(String p : parole)
		System.out.println(p.toString());
		
		
		System.out.println("\n*** Test dizionario ***");
		

		for(String p : parole)
		if(m.dizionarioModel(p))
		System.out.println(p.toString());
		

	}

}
