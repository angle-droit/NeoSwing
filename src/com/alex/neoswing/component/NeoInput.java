package com.alex.neoswing.component;

import java.awt.Color;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NeoInput extends JTextField {

	public NeoInput(String text) {
		super(text);
		setBackground(new Color(31, 31, 31));
	}

	public String getInput() {
		return getText();
	}

}
