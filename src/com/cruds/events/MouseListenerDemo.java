package com.cruds.events;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends Applet implements MouseListener {
	
	int x = 10;
	int y = 10;
	String msg = "";
	@Override
	public void init() {
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg,x,y);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Mouse Clicked");
		x = e.getX();
		y = e.getY();
		
		msg = "Mouse Clicked at (" + x + ","+ y + ")";
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		msg = "Mouse Entered";
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		msg = "Mouse Exited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		msg = "Mouse Pressed";
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		msg = "Mouse Released";
		repaint();
		
	}
	
	

}
