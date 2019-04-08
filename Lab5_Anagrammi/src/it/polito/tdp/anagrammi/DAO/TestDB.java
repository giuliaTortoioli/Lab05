package it.polito.tdp.anagrammi.DAO;

public abstract class TestDB {

	public static void main(String[] args) {
		DizionarioDAO d = new DizionarioDAO();
		System.out.println(d.cercaDaDizionario("frty"));
		System.out.println(d.cercaDaDizionario("ciao"));

	}

}
