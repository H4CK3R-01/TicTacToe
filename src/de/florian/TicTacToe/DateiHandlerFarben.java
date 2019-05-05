package de.florian.TicTacToe;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class DateiHandlerFarben {
	public static void leseFarbe() {
		int[] FarbeRGB = new int[3];
		Scanner s = null;

		try {
			s = new Scanner(new File("config/farbe.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 3; i++) {
			FarbeRGB[i] = s.nextInt();
		}

		Program.setR(FarbeRGB[0]);
		Program.setG(FarbeRGB[1]);
		Program.setB(FarbeRGB[2]);
		s.close();
	}

	public static void schreibeFarbe() {
		Color farbauswahl = JColorChooser.showDialog(null, "Bitte Hintergrundfarbe auswählen", null);

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("config/farbe.txt"));
			writer.write(farbauswahl.getRed() + " " + farbauswahl.getGreen() + " " + farbauswahl.getBlue());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
