package project;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE); //배경색 : 주황
		contentPane.setLayout(new FlowLayout()); //레이아웃 방식 : FlowLayout
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("202011095"));
		contentPane.add(new JButton("조예빈"));
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
