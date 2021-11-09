package com.cruds.events;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends Applet{
	
	@Override
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
		
	}
}

class MyMouseAdapter extends MouseAdapter
{
	Applet app;
	public MyMouseAdapter(Applet app) {
		this.app = app;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		app.showStatus("---Mouse Clicked---");
		
	}
}
