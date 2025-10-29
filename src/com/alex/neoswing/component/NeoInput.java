package com.alex.neoswing.component;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class NeoInput extends JTextField {

	public NeoInput(String text, int width, int height) {
		super(text);
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(31, 31, 31));
		setForeground(new Color(255, 255, 255));
		setBorder(new LineBorder(Color.DARK_GRAY));
	}

	public String getInput() {
		return getText();
	}

}
