package org.agenda.ipi.dao;

import java.util.List;

import org.agenda.ipi.model.Contato;

public interface IContatoDAO{

	public void addItem(Contato t);
	
	public Contato findItem(Contato t);
	
	public void removeItem(Contato t);
	
	public boolean updateItem(Contato t);
	
	public List<Contato> findAll();
}
