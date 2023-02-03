package org.agenda.ipi.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB implements IConexaoDB{

	private final String USER_DB = "root";
	private final String PASS_DB = "root";
	private final String ADDRESS_DB = "localhost";
	private final String PORT_DB = "3306";
	private final String DATABASE_NAME = "agenda";
	
	public Connection getConnection() {
		
		try {
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://"+ADDRESS_DB+"/"
			+DATABASE_NAME, USER_DB, PASS_DB);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
