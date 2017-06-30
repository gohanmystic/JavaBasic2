package Form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Choice;
import java.awt.ScrollPane;

public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "Xac nhan 18+ de su dung chuong trinh");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Nhap a");
		label.setBounds(10, 23, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Nhap b");
		label_1.setBounds(10, 69, 62, 22);
		contentPane.add(label_1);
		
		TextField txta = new TextField();
		txta.setBounds(136, 23, 214, 22);
		contentPane.add(txta);
		
		TextField txtb = new TextField();
		txtb.setBounds(136, 69, 214, 22);
		contentPane.add(txtb);
		
		
		
		Label label_2 = new Label("Ket qua");
		label_2.setBounds(10, 114, 62, 22);
		contentPane.add(label_2);
		
		Label txtKetQua = new Label("");
		txtKetQua.setBounds(138, 114, 212, 22);
		contentPane.add(txtKetQua);
		
		Button btnTru = new Button("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int a = Integer.parseInt(txta.getText());
					int b = Integer.parseInt(txtb.getText());
					Integer kq =  (a - b);
					txtKetQua.setText(kq.toString());
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
			}
		});
		btnTru.setBounds(106, 153, 70, 22);
		contentPane.add(btnTru);
		
		Button btnNhan = new Button("x");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int a = Integer.parseInt(txta.getText());
					int b = Integer.parseInt(txtb.getText());
					Integer kq =  (a * b);
					txtKetQua.setText(kq.toString());
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
			}
		});
		btnNhan.setBounds(193, 153, 70, 22);
		contentPane.add(btnNhan);
		
		Button btnChia = new Button("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				Double kq = (double) (a / b);
				txtKetQua.setText(kq.toString());
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnChia.setBounds(280, 153, 70, 22);
		contentPane.add(btnChia);
		
		Button btnCong = new Button("+");
		btnCong.setBounds(10, 153, 75, 22);
		contentPane.add(btnCong);
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int a = Integer.parseInt(txta.getText());
					int b = Integer.parseInt(txtb.getText());
					Integer kq =  (a + b);
					txtKetQua.setText(kq.toString());
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				
			}
		});
		
	}
}
