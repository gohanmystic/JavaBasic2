package Form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HienThiSinhVien extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HienThiSinhVien frame = new HienThiSinhVien();
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
	public HienThiSinhVien() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField txta = new TextField();
		txta.setBounds(42, 32, 162, 22);
		contentPane.add(txta);
		
		Button button = new Button("New button");
		button.setBounds(237, 32, 70, 22);
		contentPane.add(button);
		
		Choice choice_1 = new Choice();
		choice_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				txta.setText(choice_1.getSelectedItem());
			}
		});
		choice_1.setBounds(42, 102, 265, 20);
		contentPane.add(choice_1);
		
		List list_1 = new List();
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txta.setText(list_1.getSelectedItem());
			}
		});
		list_1.setBounds(42, 157, 265, 60);
		contentPane.add(list_1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice_1.add(txta.getText());
				list_1.add(txta.getText());
				
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				choice_1.add("CNTT");
				choice_1.add("Toan");
				choice_1.add("Ly");
			}
		});
		
		
	}

}
