package com.alex.neoswing.component;

import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NeoWindow extends JFrame {
	
	public NeoWindow(String windowName, int width, int height) {
		super(windowName);
		pack();
		setPreferredSize(new Dimension(width, height));
	}
}
