package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage frame = new StartPage();
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
	public StartPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("포장하기");
		btnNewButton.setBounds(42, 39, 100, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("<html>매장에서"+"<br>"+"식사하기<html/>");
		btnNewButton_2.setBounds(109, 151, 100, 100);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("관리자 페이지");
		btnNewButton_1.setBounds(176, 39, 100, 100);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AdminLogin AdminLoginPage = new AdminLogin();
				AdminLoginPage.setVisible(true);
			}
		});
	}

}
