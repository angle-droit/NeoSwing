package com.alex.neoswing.component;

import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class NeoCard  extends JPanel {
	
	public NeoCard(String cardTitle, int width, int height) {
		super();
		setPreferredSize(new Dimension(width, height));
		
	}
	
	
}
