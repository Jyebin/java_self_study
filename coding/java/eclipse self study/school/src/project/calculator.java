package project;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame {
	public calculator() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTextField jtf = new JTextField("");
		JPanel jp = new JPanel();
		c.add(jtf, BorderLayout.NORTH);
		c.add(jp, BorderLayout.CENTER);
		jp.setLayout(new GridLayout(4,4));
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("+"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jp.add(new JButton("-"));
		jp.add(new JButton("7"));
		jp.add(new JButton("8"));
		jp.add(new JButton("9"));
		jp.add(new JButton("+"));
		jp.add(new JButton("0"));
		jp.add(new JButton("C"));
		jp.add(new JButton("="));
		jp.add(new JButton("/"));
		setSize(300, 400);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new calculator();

	}

}
