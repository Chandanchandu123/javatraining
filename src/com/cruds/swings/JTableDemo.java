package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class JTableDemo extends JFrame{
	
	
	private JPanel panel;
	private JScrollPane scrollpane;
	private JTable table;
	private JButton btnDel;
	
	//private Object[] colNames = {"Roll No","Names"};
	//private Object[][] data = {{"101","Anil"},{"202","Mahesh"},{"303","Sunil"} };
	
	private Vector<String> colNames;
	private Vector<Vector<String>> data;
	
	JTableDemo()
	{
		//System.out.println("Constructor -->" + Thread.currentThread());
		setTitle("JTable Demo");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		colNames = new Vector<>();
		colNames.add("Roll No");
		colNames.add("Names");
		
		StudentDAO dao = new StudentDAO();
		data = dao.getTableData();
		
		/*data = new Vector<>();
		Vector<String> row1 = new Vector<>();//giving the input to the table
		row1.add("101");
		row1.add("Anil");
		data.add(row1);
		
		Vector<String> row2 = new Vector<>();
		row2.add("102");
		row2.add("Abhishek");
		data.add(row2);*/
		
		
		panel = new JPanel();
		table = new JTable(data,colNames);
		scrollpane = new JScrollPane(table);
		btnDel = new JButton("Delete");
		
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = table.getSelectedRow();
				String selRollNo = (String) table.getModel().getValueAt(idx, 0);
				System.out.println(selRollNo);
				
				StudentDAO dao = new StudentDAO();
				dao.delete(Integer.parseInt(selRollNo));
				
				table.setModel(new DefaultTableModel(dao.getTableData(),colNames));
				
				
			}
		});
		
		panel.add(scrollpane);
		panel.add(btnDel);
		add(panel);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//new JTableDemo();
		SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						new JTableDemo();
						
					}
		});
	}
}
			
				
	


