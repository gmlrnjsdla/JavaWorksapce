import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame {
	public Myframe() {
		setTitle("300x300 Swing");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
		
		JButton button1 = new JButton("ok");
		contentPane.add(button1); // OK 버튼 달기
		JButton button2 = new JButton("cancel");
		contentPane.add(button2); // cancel 버튼 달기
		JButton button3 = new JButton("ignore");
		contentPane.add(button3); // ignore 버튼 달기
		
		
		setVisible(true);
		
	}
}

