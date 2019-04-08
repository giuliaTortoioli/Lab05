package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DizionarioDAO {
	
	public boolean cercaDaDizionario(String parola){
		String sql = "SELECT nome FROM parola WHERE nome = ?";
		
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, parola);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				String p = rs.getString("nome");
				conn.close();
				return true;
				// Crea un nuovo JAVA Bean Corso
				// Aggiungi il nuovo oggetto Corso alla lista corsi
			}

			conn.close();
			return false;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
