package de.florian.TicTacToe;

import java.awt.event.*;
import javax.swing.*;

public class ActionHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int alleFelder = 0;
		for (int i = 0; i < 9; i++) {
			alleFelder = alleFelder + Program.getStatus(i);
		}

		if (alleFelder != 24) {
			if (e.getSource() == Program.btn[0]) {
				AufgabeAufrufen(0);
			} else if (e.getSource() == Program.btn[1]) {
				AufgabeAufrufen(1);
			} else if (e.getSource() == Program.btn[2]) {
				AufgabeAufrufen(2);
			} else if (e.getSource() == Program.btn[3]) {
				AufgabeAufrufen(3);
			} else if (e.getSource() == Program.btn[4]) {
				AufgabeAufrufen(4);
			} else if (e.getSource() == Program.btn[5]) {
				AufgabeAufrufen(5);
			} else if (e.getSource() == Program.btn[6]) {
				AufgabeAufrufen(6);
			} else if (e.getSource() == Program.btn[7]) {
				AufgabeAufrufen(7);
			} else if (e.getSource() == Program.btn[8]) {
				AufgabeAufrufen(8);
			} else if (e.getSource() == Program.btn[9]) {
				AufgabeAufrufen(9);
			} else if (e.getSource() == Program.newWindow) {
				Main.main(null);
			} else if (e.getSource() == Program.exit) {
				System.exit(0);
			} else if (e.getSource() == Program.hintergrundFarbe) {
				DateiHandlerFarben.schreibeFarbe();
			} 
		} else {
			// Auswertung			
		}
	}

	@SuppressWarnings({ "static-access" })
	public static void AufgabeAufrufen(int i) {
		if (Program.getStatus(i) == 0) {
			Program.setStatus(1, i);
			
		} else {
			System.out.println("Dieses Feld wurde schon verwendet");
			new JOptionPane().showMessageDialog(null, "Dieses Feld wurde schon verwendet");
		}
	}
}