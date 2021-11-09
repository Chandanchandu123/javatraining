package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class StudentViewPanel extends JPanel{
	
	private JScrollPane scrollpane;
	private JTable table;
	private JPanel panel;
	JButton btnBack;
	JFrame parentFrame;
	JPanel currPanel;
	
	private Vector<String> colNames;
	private Vector<Vector<String>> data;
	
	public StudentViewPanel(JFrame parentFrame) {
		
		/*setTitle("JTable Demo");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);*/
		
		colNames = new Vector<>();
		colNames.add("Roll No");
		colNames.add("Names");
		
		StudentDAO dao = new StudentDAO();
		data = dao.getTableData();
		
		
		panel = new JPanel();
		table = new JTable(data,colNames);
		scrollpane = new JScrollPane(table);
		
		this.parentFrame = parentFrame;
		currPanel = this;
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				parentFrame.remove(currPanel);
				parentFrame.add(new StudentCreatePanel(parentFrame));
				table.setModel(new DefaultTableModel(dao.getTableData(),colNames));
				parentFrame.revalidate();
				
			}
		});
		panel.add(scrollpane);
		add(panel);
		add(btnBack);
	}

}
