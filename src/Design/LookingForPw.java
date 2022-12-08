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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LookingForPw extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField certifiedField;
	public static LookingForPw frame;
	public int randomValue = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LookingForPw();
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
	public LookingForPw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nameLabel = new JLabel("이름을 입력하세요");
		nameLabel.setBounds(39, 10, 114, 16);
		contentPane.add(nameLabel);

		JLabel numberLabel = new JLabel("번호를 입력하세요");
		numberLabel.setBounds(39, 60, 114, 16);
		contentPane.add(numberLabel);

		nameField = new JTextField();
		nameField.setBounds(165, 5, 203, 26);
		contentPane.add(nameField);
		nameField.setColumns(10);

		phoneField = new JTextField();
		phoneField.setBounds(165, 55, 203, 26);
		contentPane.add(phoneField);
		phoneField.setColumns(10);

		JLabel certifiedNumber = new JLabel("인증번호를 입력하세요");
		certifiedNumber.setBounds(39, 110, 114, 16);
		contentPane.add(certifiedNumber);

		certifiedField = new JPasswordField();
		certifiedField.setBounds(165, 105, 203, 26);
		contentPane.add(certifiedField);
		certifiedField.setColumns(10);

		JButton examineBtn = new JButton("검사하기");
		examineBtn.setBounds(39, 138, 117, 29);
		contentPane.add(examineBtn);

		JButton okBtn = new JButton("확인");
		okBtn.setBounds(380, 105, 39, 29);
		contentPane.add(okBtn);

		JButton backButton = new JButton("뒤로가기");
		backButton.setBounds(175, 138, 117, 29);
		contentPane.add(backButton);

		examineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				randomValue = randomNumber();
				if (e.getActionCommand().equals("검사하기")) {
					if (phoneField.getText().equals("01099481901") && nameField.getText().equals("서상현"))
						JOptionPane.showMessageDialog(null, "인증번호는" + randomValue + "입니다.");
				}
			}
		});

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("확인")) {
					if (certifiedField.getText().equals(String.valueOf(randomValue))) {
						JOptionPane.showMessageDialog(null, "비밀번는 1234 입니다.");
					}
				}

			}
		});

		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					AdminLogin AdminLoginframe = new AdminLogin();
					AdminLoginframe.setVisible(true);
			}
		});

	}

	public int randomNumber() {
		double randomValue = Math.random();
		int resultValue = 0;
		int intValue = (int) (randomValue * 10000) + 1;
		if (intValue > 1000 && intValue < 10000) {
			resultValue = intValue;
		}
		return resultValue;
	}
}
