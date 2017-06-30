package SinhVien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmDangNhap extends JFrame {
	public static String Username="";
	public static String Password;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDangNhap frame = new FrmDangNhap();
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
	public FrmDangNhap() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				setTitle(FrmDangNhap.Username);
			}
		});
		TextField txtPassword = new TextField();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label1 = new Label("Username");
		label1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label1.setBounds(10, 43, 78, 22);
		contentPane.add(label1);
		
		Label label2 = new Label("Password");
		label2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label2.setBounds(10, 89, 78, 22);
		contentPane.add(label2);
		
		TextField textUsername = new TextField();
		textUsername.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent arg0) {
				txtPassword.setText(textUsername.getText());
			}
		});
		textUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				txtPassword.setText(textUsername.getText());
			}
		});
		textUsername.setBounds(123, 43, 205, 22);
		contentPane.add(textUsername);
		txtPassword.setBounds(122, 89, 206, 22);
		contentPane.add(txtPassword);
		
		Button button = new Button("Login");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Username = textUsername.getText();
				Password = txtPassword.getText();
				
				FromMenu menu = new FromMenu();
				menu.setVisible(true);
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setForeground(Color.BLACK);
		button.setBounds(233, 141, 95, 40);
		contentPane.add(button);
	}
}
