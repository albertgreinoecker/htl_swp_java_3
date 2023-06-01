package at.ac.htlinn.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstTest2 extends JFrame implements ActionListener{

	JLabel l = null;
	JButton b1 = null;
	public FirstTest2(String title) {
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		l = new JLabel("Das ist ein Text im Label");
		add(l, BorderLayout.CENTER);
		
		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		JButton b2 = new JButton("Button 2");
		b2.addActionListener(this);
		
		JPanel south = new JPanel();
		south.add(b1);
		south.add(b2);
		
		add(south, BorderLayout.SOUTH);
		//frame.pack();
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new FirstTest2("GUI2");
		frame.setSize(500,500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			l.setText("Button 1 gedrückt!");
		else
			l.setText("Button 2 gedrückt!");
		
	}

}
