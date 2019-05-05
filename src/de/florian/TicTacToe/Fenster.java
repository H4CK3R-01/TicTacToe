package de.florian.TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenster implements ActionListener {
	public Fenster(int r, int g, int b) {
		// Fenster Erzeugen
		Program.applikation = new JFrame(Program.getProgramname());
		Program.applikation.getContentPane().setBackground(new Color(r, g, b));

		// Menüleiste erzeugen
		Program.menuBar = new JMenuBar();

		// Menüelemente erzeugen
		Program.datei = new JMenu("Datei");
		Program.hilfe = new JMenu("Hilfe");

		// Untermenüelemente erzeugen
		Program.datei = new JMenu("Datei");

		Program.newWindow = new JMenuItem("Neues Fenster", new ImageIcon("img/newWindow.gif"));
		Program.newWindow.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
		Program.newWindow.addActionListener(new ActionHandler());

		Program.exit = new JMenuItem("Beenden", new ImageIcon("img/exit.gif"));
		Program.exit.addActionListener(new ActionHandler());

		// Menü 2
		Program.hilfe = new JMenu("Hilfe");

		Program.hintergrundFarbe = new JMenuItem("Farbe ändern", new ImageIcon("img/settings.gif"));
		Program.hintergrundFarbe.addActionListener(new ActionHandler());

		// Menüelemente hinzufügen
		Program.menuBar.add(Program.datei);
		Program.menuBar.add(Program.hilfe);

		// Untermenüelemente hinzufügen
		Program.datei.add(Program.newWindow);
		Program.datei.addSeparator();
		Program.datei.add(Program.exit);
		Program.hilfe.add(Program.hintergrundFarbe);

		Program.applikation.add(Program.menuBar, BorderLayout.NORTH);
		Program.applikation.setSize(1125, 750);
		Program.applikation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program.applikation.setVisible(true);

		// Spiel

		for (int i = 0; i < Program.btn.length; i++) {
			Program.btn[i] = new JButton();
			Program.btn[i].setVisible(true);
			Program.btn[i].addActionListener(new ActionHandler());
			Program.btn[i].setFocusPainted(false);
			Program.btn[i].setContentAreaFilled(true);
			Program.btn[i].setBorder(null);
			Program.btn[i].setBackground(new Color(Program.getR(), Program.getG(), Program.getB()));
			Program.applikation.add(Program.btn[i]);
		}
		
		// Position der Buttons bestimmen
		// Reihe 1
		Program.btn[2].setBounds(52, 74, 148, 148);
		Program.btn[0].setBounds(202, 74, 148, 148);
		Program.btn[1].setBounds(353, 74, 148, 148);


		// Reihe 2
		Program.btn[5].setBounds(52, 225, 148, 148);
		Program.btn[3].setBounds(202, 225, 148, 148);
		Program.btn[4].setBounds(353, 225, 148, 148);

		// Reihe 3
		Program.btn[8].setBounds(52, 375, 148, 148);
		Program.btn[6].setBounds(202, 375, 148, 148);
		Program.btn[7].setBounds(353, 375, 148, 148);

		// Spielfeld erzeugen und zum Fenster hinzufügen
		Spielfeld feld = new Spielfeld();
		Program.applikation.add(feld);
	}

	public void actionPerformed(ActionEvent e) {

	}
}