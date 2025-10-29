package com.alex.neoswing.component;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class NeoButton extends JButton {
	private int radius;
	
	public NeoButton(String text, int width, int height, int radius) {
		super(text);
		this.radius = radius;
		setPreferredSize(new Dimension(width, height));
		setFont(new Font("Segoe UI", Font.BOLD, 14));
		setBackground(new Color(255, 60, 0));
		setForeground(new Color(255, 255, 255));
		setBounds(30, 25, height, height);
		setFocusPainted(false);
		setBorderPainted(false);
		setOpaque(true);
		setContentAreaFilled(false);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(255, 60, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(255, 87, 36));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	}
	
	@SuppressWarnings("exports")
	public void setAction(ActionListener action) {
		for (ActionListener al : getActionListeners()) {
			removeActionListener(al);
		}
		addActionListener(action);
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g2);
        g2.dispose();
    }
	
}
