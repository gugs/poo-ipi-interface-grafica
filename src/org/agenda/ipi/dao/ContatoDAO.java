package org.agenda.ipi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.agenda.ipi.model.Contato;
import org.agenda.ipi.persistencia.ConexaoDB;
import org.agenda.ipi.persistencia.IConexaoDB;

public class ContatoDAO implements IContatoDAO{

	private IConexaoDB conn;
	
	private static ContatoDAO dao;
	
	private ContatoDAO() {
		
	}
	
	public static ContatoDAO getInstance() {
		if(dao == null) {
			dao = new ContatoDAO(new ConexaoDB());
			return dao;
		}
		else
			return dao;
			
	}
	
	public ContatoDAO(IConexaoDB conn) {
		this.conn = conn;
	}
	
	@Override
	public void addItem(Contato c) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstm = conn.getConnection().prepareStatement("INSERT INTO contato VALUES (?,?,?,?)");
			pstm.setInt(1, c.getId());
			pstm.setString(2, c.getNome());
			pstm.setString(3, c.getEmail());
			pstm.setString(4, c.getTelefone());
			pstm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Contato findItem(Contato t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeItem(Contato t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateItem(Contato t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contato> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
