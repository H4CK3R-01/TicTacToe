package de.florian.TicTacToe;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Spielfeld extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		g.setColor(Color.BLACK);

		// Vertikal

		g.drawLine(200, 50, 200, 500);
		g.drawLine(350, 50, 350, 500);

		// Horizontal

		g.drawLine(50, 200, 500, 200);
		g.drawLine(50, 350, 500, 350);
		try {
			g.drawImage(ImageIO.read(new File("img/x.png")), 50, 50, 150, 150, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
