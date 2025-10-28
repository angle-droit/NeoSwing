package com.alex.neoswing.component;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NeoLabel extends JLabel{
	
	public NeoLabel(String text) throws FontFormatException, IOException {
		super(text);
		try (InputStream is = getClass().getResourceAsStream("/fonts/Inter-Bold.ttf")) {
		    if (is == null) throw new RuntimeException("Font not found!");
		    Font font = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(16f);
		    GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
		    this.setFont(font);
		} catch (Exception e) {
		    e.printStackTrace();
		    this.setFont(new Font("Segoe UI", Font.BOLD, 16)); // fallback
		}
	}
}
