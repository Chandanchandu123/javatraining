package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class StudentCreatePanel extends JPanel{
	
	JButton btnCreate;
	JFrame parentFrame;
	JPanel currPanel;
	JTextField txtRollNo;
	JTextField txtName;
	JLabel lblRollNo;
	JLabel lblName;
	JPanel panel;
	
	StudentCreatePanel(JFrame parentFrame) 
	{
		txtRollNo = new JTextField(10);
		txtName = new JTextField(10);
		lblRollNo = new JLabel("Roll No:");
		lblName = new JLabel("Name:");
		
		this.parentFrame = parentFrame;
		currPanel = this;
		
		btnCreate = new JButton("Create");
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				parentFrame.remove(currPanel);
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
				parentFrame.add(new StudentViewPanel(parentFrame));
				parentFrame.revalidate();
				
			}
		});
		panel = new JPanel();
		panel.add(lblRollNo);
		panel.add(txtRollNo);//add field to panel
		panel.add(lblName);
		panel.add(txtName);
		panel.add(btnCreate);
		add(panel);
		add(btnCreate);
	}

}
