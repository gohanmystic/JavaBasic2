package SinhVien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FrmHienThiSv extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHienThiSv frame = new FrmHienThiSv();
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
	public FrmHienThiSv() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label label = new Label("Chon khoa");
		label.setBounds(10, 10, 62, 22);
		contentPane.add(label);

		Choice choice = new Choice();
		
		choice.setBounds(93, 10, 320, 20);
		contentPane.add(choice);

		List list = new List();

		list.setBounds(10, 68, 403, 155);
		contentPane.add(list);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				choice.add("cntt");
				choice.add("toan");
				choice.add("ly");
			}
		});
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				list.clear();
				Test test = new Test();
				test.TaoLop();
				for (Object sv : test.ds) {
					if (choice.getSelectedItem().equals("cntt")) {
						if (sv instanceof SvCNTT) {
							SvCNTT sv1 = (SvCNTT) sv;
							list.add(sv1.getMaSv());
							list.add(sv1.getHoten());
							list.add(String.valueOf(sv1.DTB()));
							list.add("-----------------------------------");
						}

					} else if (choice.getSelectedItem().equals("toan")) {
						if (sv instanceof SvToan) {
							SvToan sv2 = (SvToan) sv;
							list.add(sv2.getMaSv());
							list.add(sv2.getHoTen());
							list.add(String.valueOf(sv2.DTB()));
							list.add("-----------------------------------");
						}

					} else if (choice.getSelectedItem().equals("ly")) {
						if (sv instanceof SvLy) {
							SvLy sv3 = (SvLy) sv;
							list.add(sv3.getMaSv());
							list.add(sv3.getHoTen());
							list.add(String.valueOf(sv3.DTB()));
							list.add("-----------------------------------");
						}

					}
				}
			}
		});
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

			}
		});
	}

}
