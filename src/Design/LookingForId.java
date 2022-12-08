package Design;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LookingForId extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField nameField;
	private JTextField textField_1;
	private JTextField phoneField;
	private JTextField textField_2;
	private JTextField certifiedField;
	public int randomValue = 0;
	private JButton backButton;
	public static LookingForId frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LookingForId();
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
	public LookingForId() {
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


		textField = new JTextField();
		textField.setBounds(165, 5, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(165, 55, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(165, 105, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton examineBtn = new JButton("검사하기");
		examineBtn.setBounds(39, 138, 117, 29);
		contentPane.add(examineBtn);
		examineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomValue=randomNumber();
				if (e.getActionCommand().equals("검사하기")) {
					if(phoneField.getText().equals("01099481901") && nameField.getText().equals("서상현"))
					JOptionPane.showMessageDialog(null,"인증번호는"+randomValue+"입니다.");
				}
			}
		});
		
		JButton okBtn = new JButton("확인");
		okBtn.setBounds(380, 105, 39, 29);
		contentPane.add(okBtn);
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("확인")) {
					if(certifiedField.getText().equals(String.valueOf(randomValue))) {
						JOptionPane.showMessageDialog(null,"아이디는 sibjagun 입니다.");
					}
				}
				
			}
		});
		backButton = new JButton("뒤로가기");
		backButton.setBounds(175, 138, 117, 29);
		contentPane.add(backButton);
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
		int intValue = (int)(randomValue*10000)+1;
		if(intValue>1000 && intValue<10000) {
			resultValue = intValue;
		}
		return resultValue; 
	}

}
