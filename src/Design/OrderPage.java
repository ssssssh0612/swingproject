package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPage frame = new OrderPage();
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
	public OrderPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(371, 6, 223, 251);
		contentPane.add(orderPanel);
		orderPanel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("전체취소");
		btnNewButton_3.setBounds(6, 6, 104, 29);
		orderPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("결제하기");
		btnNewButton_4.setBounds(106, 6, 117, 29);
		orderPanel.add(btnNewButton_4);
		
		JButton hotBtn = new JButton("HOT");
		hotBtn.setBounds(14, 53, 110, 60);
		contentPane.add(hotBtn);
		
		JButton dessertBtn = new JButton("Dessert");
		dessertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dessertBtn.setBounds(14, 125, 110, 60);
		contentPane.add(dessertBtn);
		
		JButton iceBtn = new JButton("ICE");
		
		iceBtn.setBounds(14, 197, 110, 60);
		contentPane.add(iceBtn);
		
		JLabel lblNewLabel = new JLabel("확인 버튼을 눌러 주문해주세요");
		lblNewLabel.setBounds(136, 25, 189, 16);
		contentPane.add(lblNewLabel);
		
		JPanel hotPanel = new JPanel();
		hotPanel.setBounds(136, 53, 223, 209);
		contentPane.add(hotPanel);
		
		JPanel dessertPanel = new JPanel();
		dessertPanel.setBounds(136, 53, 223, 209);
		contentPane.add(dessertPanel);
		dessertPanel.setLayout(null);
		
		JPanel icePanel = new JPanel();
		icePanel.setBounds(136, 53, 223, 209);
		contentPane.add(icePanel);
		icePanel.setLayout(null);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		
		JButton btnNewButton_3_1_1 = new JButton("New button");
		btnNewButton_3_1_1.setBounds(6, 64, 30, 30);
		menuPanel.add(btnNewButton_3_1_1);
		
		hotPanel.setVisible(true);
		dessertPanel.setVisible(false);
		icePanel.setVisible(false);
		
		iceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icePanel.setVisible(true);
				hotPanel.setVisible(false);
				dessertPanel.setVisible(false);
			}
		});
		hotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icePanel.setVisible(false);
				hotPanel.setVisible(true);
				dessertPanel.setVisible(false);
			}
		});
		dessertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icePanel.setVisible(false);
				hotPanel.setVisible(false);
				dessertPanel.setVisible(true);
			}
		});
	}
}
