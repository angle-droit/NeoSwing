package com.alex.neoswing.component;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NeoButton extends JButton {
	
	public NeoButton(String text, int width, int height) {
		super(text);
		setPreferredSize(new Dimension(width, height));
		setFont(new Font("Segoe UI", Font.BOLD, 14));
		setBackground(new Color(255, 60, 0));
		setForeground(new Color(255, 255, 255));
		setBorder(new LineBorder(Color.BLACK, 1));
		setBounds(30, 25, height, height);
		setFocusPainted(false);
		setOpaque(true);
		setContentAreaFilled(true);
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
