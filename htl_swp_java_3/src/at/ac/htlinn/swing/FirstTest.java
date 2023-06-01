package at.ac.htlinn.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstTest {

	public static void main(String[] args) {
		JFrame frame =new JFrame("First Program");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel l = new JLabel("Das ist ein Text im Label");
		frame.add(l, BorderLayout.CENTER);
		
		JButton b1 = new JButton("Button 1");
		
		JButton b2 = new JButton("Button 2");
		
		JPanel south = new JPanel();
		south.add(b1);
		south.add(b2);
		
		frame.add(south, BorderLayout.SOUTH);
		//frame.pack();
		frame.setVisible(true);
		

	}

}
