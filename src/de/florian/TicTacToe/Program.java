package de.florian.TicTacToe;

import javax.swing.*;

public class Program {

	// Fenster Elemente
	public static JButton btn[] = new JButton[9];
	public static ImageIcon img = new ImageIcon("images/Main.gif");
	public static JFrame applikation;
	public static JMenuBar menuBar;
	public static JMenu datei;
	public static JMenu hilfe;
	public static JMenuItem newWindow;
	public static JMenuItem exit;
	public static JMenuItem add;
	public static JMenuItem change;
	public static JMenuItem hintergrundFarbe;

	// Hintergrundfarbe
	public static int r;
	public static int g;
	public static int b;

	// Programmname
	private static String programname = "Tic Tac Toe";

	// Spieler der dran ist
	public static int welcherSpieler = 0;
	
	// Array wer welches Feld ausgewählt hat
	public static int[] status = new int[9];

	// Getter und Setter
	public static void setHintergrundFarbe(JMenuItem hintergrundFarbe) {
		Program.hintergrundFarbe = hintergrundFarbe;
	}

	public static int getR() {
		return r;
	}

	public static void setR(int r) {
		Program.r = r;
	}

	public static int getG() {
		return g;
	}

	public static void setG(int g) {
		Program.g = g;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Program.b = b;
	}

	public static String getProgramname() {
		return programname;
	}

	public static void setProgramname(String programname) {
		Program.programname = programname;
	}

	public static int getWelcherSpieler() {
		return welcherSpieler;
	}

	public static void setWelcherSpieler(int welcherSpieler) {
		Program.welcherSpieler = welcherSpieler;
	}

	public static int getStatus(int i) {
		return status[i];
	}

	public static void setStatus(int status, int i) {
		Program.status[i] = status;
	}
	
	public static int getAlleWerte() {
		int alleWerte = 0;
		for(int i = 0; i < 9; i++) {
			alleWerte = alleWerte + status[i]; 
		}
		return alleWerte;
	}
	
}