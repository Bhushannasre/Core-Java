package Revision;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		
		//window : object Jframe
		JFrame frame=new JFrame("my Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		//create button and add jframe
		JButton button=new JButton("Click Me!");
		button.addActionListener((ActionEvent e)->{
			System.out.println("Button Click");
			JOptionPane.showMessageDialog( null,"Hey,Button Click!" );
		});
		
		frame.add(button);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
