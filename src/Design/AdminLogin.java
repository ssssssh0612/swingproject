package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(89, 72, 87, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(89, 125, 87, 25);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);

		idField = new JTextField();
		idField.setBounds(188, 72, 100, 25);
		contentPane.add(idField);
		idField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(188, 125, 100, 25);
		contentPane.add(passwordField);		
		passwordField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("관리자 페이지 로그인");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(120, 20, 142, 40);
		contentPane.add(lblNewLabel_2);

		JButton loginButton = new JButton("로그인 하기");
		loginButton.setBounds(89, 174, 199, 29);
		contentPane.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("로그인 하기")) {
					if (idField.getText().equals("sibjagun") && passwordField.getText().equals("1234")) {
						JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
						frame.setVisible(false);
						AdminPage AdminPageframe = new AdminPage();
						AdminPageframe.setVisible(true);
					} else if (idField.getText().equals("sibjagun")) {
						JOptionPane.showMessageDialog(null, "비밀번호를 다시 입력해주세요");
					} else if (passwordField.getText().equals("1234")) {
						JOptionPane.showMessageDialog(null, "아이디를 다시 입력해주세요");
					}
					else {
						JOptionPane.showMessageDialog(null, "아이디 비밀번호 모두 다시 입력해주세요");
						
					}
				}
			}
		});
		JButton findIdBtn = new JButton("아이디 찾기");
		findIdBtn.setBounds(89, 215, 100, 29);
		contentPane.add(findIdBtn);
		findIdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					LookingForId LookingForIdframe = new LookingForId();
					LookingForIdframe.setVisible(true);
			}
		});
		JButton findPwBtn = new JButton("비밀번호 찾기");
		findPwBtn.setBounds(188, 215, 100, 29);
		contentPane.add(findPwBtn);
		findPwBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					LookingForPw LookingForPwframe = new LookingForPw();
					LookingForPwframe.setVisible(true);
			}
		});
	}
}
