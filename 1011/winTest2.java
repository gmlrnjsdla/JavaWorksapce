import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class winTest2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSu;
	private JLabel lblResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winTest2 frame = new winTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public winTest2() {
		setTitle("임희권");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 88);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtSu = new JTextField();
		txtSu.setText("10");
		contentPane.add(txtSu);
		txtSu.setColumns(10);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i, sum = 0, su = Integer.parseInt(txtSu.getText());
				for(i=0; i<=su; i++) {
					sum=sum+i;
				}
//				System.out.println(sum);
				lblResult.setText("결과값 : "+Integer.toString(sum));
			}
		});
		contentPane.add(btnRun);
		
		lblResult = new JLabel("결과값;");
		contentPane.add(lblResult);
	}

}
