package project;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Phone2 {
String name, loc, tel;

public Phone2(String name, String tel, String loc) {
	this.name = name;
	this.tel = tel;
	this.loc = loc;
	}
}

public class HW5 extends JFrame{
	private Container c = getContentPane();
	private JTextArea ta = new JTextArea();
	private JTextField tf1 = new JTextField();
	private JTextField tf2 = new JTextField();
	private JTextField tf3 = new JTextField();
	private JButton jb1 = new JButton("조회");
	private JButton jb2 = new JButton("검색");
	private JButton jb3 = new JButton("삽입");
	private JButton jb4 = new JButton("삭제");
	private JScrollPane sp = new JScrollPane(ta);
	private HashMap<String, Phone2> Info = new HashMap<String, Phone2>();
	public HW5() {
		setTitle("전화번호부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);

		sp.setSize(400, 380);
		sp.setLocation(10, 10);
		c.add(sp);

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		jp1.setLayout(new GridLayout(1, 4));
		jb1.addActionListener(new MyActionListener());
		jb2.addActionListener(new MyActionListener());
		jb3.addActionListener(new MyActionListener());
		jb4.addActionListener(new MyActionListener());
		jp1.add(jb1); jp1.add(jb2); jp1.add(jb3); jp1.add(jb4);
		jp1.setSize(400, 30);
		jp1.setLocation(450, 120);
		c.add(jp1);

		jp2.setLayout(new GridLayout(3, 1));
		jp2.add(new JLabel("이        름"));
		jp2.add(new JLabel("전화번호"));
		jp2.add(new JLabel("주        소"));
		jp2.setSize(70, 100);
		jp2.setLocation(450, 170);
		c.add(jp2);

		jp3.setLayout(new GridLayout(3, 1));
		jp3.add(tf1); jp3.add(tf2); jp3.add(tf3);
		jp3.setSize(330, 100);
		jp3.setLocation(520, 170);
		c.add(jp3);

		setSize(900, 450);
		setVisible(true);
		}
	class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	ta.setText("");
	if((JButton)e.getSource() == jb1) {
		ta.setText("");
		Vector<String> v = new Vector<String>();
		Set<String> keys = Info.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			v.add(name);
			}
		Collections.sort(v);
		it = v.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Phone2 p = Info.get(key);
			ta.append("이        름 : " + p.name + "\n");
			ta.append("전화번호 : " + p.tel + "\n");
			ta.append("주        소 : " + p.loc + "\n");
			ta.append("\n");
			}
		}else if((JButton)e.getSource() == jb2) {
			ta.setText("");
			String str1 = tf1.getText();
			if(Info.containsKey(str1)) {
				Phone2 p = Info.get(str1);
				ta.append("이        름 : " + p.name + "\n");
				ta.append("전화번호 : " + p.tel + "\n");
				ta.append("주        소 : " + p.loc + "\n");
				}else {
					ta.append(str1 + "은(는) 없는 이름입니다.");
				}
			tf1.setText("");
			}else if((JButton)e.getSource() == jb3) {
				ta.setText("");
				String str1 = tf1.getText();
				String str2 = tf2.getText();
				String str3 = tf3.getText();
				Phone2 p = new Phone2(str1, str2, str3);
				Info.put(str1, p);

				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				ta.append(str1 + "이(가) 삽입되었습니다.");
				}else {
					ta.setText("");
					String str1 = tf1.getText();
					if(Info.containsKey(str1)) {
						Info.remove(str1);
						ta.append(str1 + "이(가) 삭제되었습니다.");
						}else {
							ta.append(str1 + "은(는) 없는 이름입니다.");
							}
					tf1.setText("");
					}
	}
	}
	public static void main(String[] args) {
		new HW5();
	}

}
