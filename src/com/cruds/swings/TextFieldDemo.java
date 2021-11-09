package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class TextFieldDemo extends JFrame{
	
	JTextField txtRollNo;
	JTextField txtName;
	JLabel lblRollNo;
	JLabel lblName;
	JPanel panel;
	JButton btnCreate;
	private JScrollPane scrollpane;
	private JTable table;
	private Vector<String> colNames;
	private Vector<Vector<String>> data;
	
	public TextFieldDemo() {
		setTitle("Text Field Demo");
		setSize(500,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		colNames = new Vector<>();
		colNames.add("Roll No");
		colNames.add("Names");
		
		txtRollNo = new JTextField(10);
		txtName = new JTextField(10);
		lblRollNo = new JLabel("Roll No:");
		lblName = new JLabel("Name:");
		
		StudentDAO dao = new StudentDAO();
		data = dao.getTableData();
		
		table = new JTable(data,colNames);
		scrollpane = new JScrollPane(table);
		
		btnCreate = new JButton("Create");
		
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strRollNo = txtRollNo.getText();
				String name = txtName.getText();
				System.out.println(strRollNo + ":" + name);
				Student s = null;
				try
				{
					s = new Student(Integer.parseInt(strRollNo), name);
					StudentDAO dao = new StudentDAO();
					if(dao.create(s));
					{
						JOptionPane.showMessageDialog(panel, "Student added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
						txtRollNo.setText("");
						txtName.setText("");
						table.setModel(new DefaultTableModel(dao.getTableData(),colNames));
					}	
				}catch (NumberFormatException nfe)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "Invalid Roll Number " + strRollNo,"Error",JOptionPane.ERROR_MESSAGE);
				}
				catch (StudentException se)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, se.getInfo(),"Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel = new JPanel();
		panel.add(lblRollNo);
		panel.add(txtRollNo);//add field to panel
		panel.add(lblName);
		panel.add(txtName);
		panel.add(btnCreate);
		panel.add(scrollpane);
		add(panel);//add panel to frame
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TextFieldDemo();

	}

}
