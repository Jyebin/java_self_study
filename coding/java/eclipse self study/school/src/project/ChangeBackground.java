package project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

	public class ChangeBackground extends JFrame {
		private Container c = getContentPane();
		private JButton btn1 = new JButton("RED");
		private JButton btn2 = new JButton("BLUE");
		private JButton btn3 = new JButton("YELLOW");
		
		public ChangeBackground() {
			setTitle("ChangeBackground");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c.setLayout(new FlowLayout());
			btn1.addMouseListener(new MyMouseListener());
			btn2.addMouseListener(new MyMouseListener());
			btn3.addMouseListener(new MyMouseListener());
			
			c.add(btn1);
			c.add(btn2);
			c.add(btn3);
			
			setSize(350, 150);
			setVisible(true);
		}
		class MyMouseListener implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				if((JButton)e.getSource() == btn1) {
					c.setBackground(Color.RED);
				}
				else if((JButton)e.getSource() == btn2){
					c.setBackground(Color.BLUE);
				}
				else {
					c.setBackground(Color.YELLOW);
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
		}
		public static void main(String[] args) {
			new ChangeBackground();
		}

	}

