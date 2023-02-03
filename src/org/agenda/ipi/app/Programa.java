package org.agenda.ipi.app;

import javax.swing.SwingUtilities;

import org.agenda.ipi.gui.TelaAgenda;

public class Programa {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				TelaAgenda t = new TelaAgenda();
				t.setVisible(true);
			}
		});
		
	}
}
