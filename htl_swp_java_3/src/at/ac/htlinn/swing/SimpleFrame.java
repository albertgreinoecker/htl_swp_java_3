package at.ac.htlinn.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Simple JFrame");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel l = new JLabel("Hallo");
		frame.add(l, BorderLayout.NORTH);
		
		JButton b1 = new JButton("Drück mich!");
		JButton b2 = new JButton("Mich auch!");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(b1);
		p.add(b2);
		frame.add(p, BorderLayout.SOUTH);
		
		
		frame.setVisible(true);
		

	}

}
