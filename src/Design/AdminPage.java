package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("현재주문");
		btnNewButton.setBounds(61, 82, 100, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("재고관리");
		btnNewButton_1.setBounds(173, 82, 100, 100);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("오늘의 매출");
		btnNewButton_2.setBounds(285, 82, 100, 100);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("관리자 페이지");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(159, 28, 133, 42);
		contentPane.add(lblNewLabel);
	}

}
