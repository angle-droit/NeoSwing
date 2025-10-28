package com.alex.neoswing.component;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NeoButton extends JButton {
	
	public NeoButton(String text, int width, int height) {
		super(text);
		setPreferredSize(new Dimension(width, height));
		setFont(new Font("Segoe UI", Font.BOLD, 14));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
	}
	
	@SuppressWarnings("exports")
	public void setAction(ActionListener action) {
		for (ActionListener al : getActionListeners()) {
			removeActionListener(al);
		}
		addActionListener(action);
	}
}
