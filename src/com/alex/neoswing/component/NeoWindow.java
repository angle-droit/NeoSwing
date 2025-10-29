package com.alex.neoswing.component;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NeoWindow extends JFrame {
	
	  private Color backgroundColor;
	
	public NeoWindow(String windowName, int width, int height) {
		super(windowName);
		setPreferredSize(new Dimension(width, height));
	}
	
	public NeoWindow setColor(int r, int g, int b) {
		this.backgroundColor = new Color(r, g, b);
		this.getContentPane().setBackground(backgroundColor);
		return this;
	}
	
}
