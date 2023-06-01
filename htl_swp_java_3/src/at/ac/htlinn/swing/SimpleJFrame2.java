package at.ac.htlinn.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimpleJFrame2 extends JFrame implements ActionListener {

	JLabel l = null;
	JButton b1 = null;
	
	public SimpleJFrame2(String title) {
		super(title);

		setLayout(new BorderLayout());
		l = new JLabel("Hallo");
		add(l, BorderLayout.NORTH);
		setSize(500, 500);
		b1 = new JButton("Drück mich!");
		b1.addActionListener(this);
		JButton b2 = new JButton("Mich auch!");
		b2.addActionListener(this);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(b1);
		p.add(b2);
		add(p, BorderLayout.SOUTH);
		JTextArea ta = new JTextArea();
		
		add(ta, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		JFrame frame = new SimpleJFrame2("Simple JFrame");
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (b1 == e.getSource())
			l.setText("Button 1 gedrückt");
		else
			l.setText("Button 2 gedrückt");
	}
}
