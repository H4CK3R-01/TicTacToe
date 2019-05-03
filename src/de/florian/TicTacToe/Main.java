package de.florian.TicTacToe;

public class Main {
	public static void main(String[] args) {
		// Hintergrundfarbe aus Datei auslesen
		DateiHandlerFarben.leseFarbe();
		
		// Fenster mit Hintergrundfarbe erzeugen
		new Fenster(Program.getR(), Program.getG(), Program.getB());
	}
}