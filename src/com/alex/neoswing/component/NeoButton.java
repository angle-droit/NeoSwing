package com.alex.neoswing.component;

import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class NeoButton extends JButton {
	
	public NeoButton(String text, int width, int height) {
		super(text);
		setPreferredSize(new Dimension(width, height));
		setFont(new Font("Segoe UI", Font.BOLD, 14));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
	}
}
