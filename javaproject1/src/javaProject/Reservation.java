package javaProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.channels.SelectableChannel;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Reservation extends JFrame {
	private JTextField mtextField;
	private JTextField ctextField;
	private JTextField dtextField;
	private JTextField ttextField;
	private JTextField htextField;
	private JTextField dtextField2;

	public static void main(String[] args) {
		new Reservation();

	}

	Reservation() {
		setTitle("³ªÀÇ ¿µÈ­°ü");
		setSize(500, 500);
		getContentPane().setLayout(null);

		JLabel titlelabel = new JLabel("\uC601\uD654\uC608\uB9E4");
		titlelabel.setBounds(85, 0, 296, 66);
		titlelabel.setFont(new Font("³ª´®°íµñ", Font.BOLD, 53));
		titlelabel.setForeground(new Color(139, 0, 0));
		titlelabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(titlelabel);

		String[] a1 = { "\uC120\uD0DD", "AvengersEndgame", "\uAC78\uCE85\uC2A4",
				"\uB098\uC758\uD2B9\uBCC4\uD55C\uD615\uC81C" };
		JComboBox comboBox1 = new JComboBox(a1);
		comboBox1.setBounds(14, 102, 133, 21);
		getContentPane().add(comboBox1);
		comboBox1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JLabel mnlabel = new JLabel("\uC601\uD654\uC120\uD0DD");
		mnlabel.setBounds(43, 61, 85, 37);
		mnlabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		getContentPane().add(mnlabel);

		String[] a2 = { "\uC120\uD0DD", "\uAC00\uC0B0\uB514\uC9C0\uD138", "\uB3C5\uC0B0", "\uD64D\uB300\uC785\uAD6C",
				"\uC2E0\uB3C4\uB9BC" };
		JLabel clabel = new JLabel("\uC9C0\uC5ED");
		clabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		clabel.setBounds(197, 69, 50, 29);
		getContentPane().add(clabel);
		JComboBox comboBox2 = new JComboBox(a2);
		comboBox2.setBounds(174, 102, 133, 21);
		getContentPane().add(comboBox2);
		comboBox2.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		JLabel dlabel = new JLabel("\uB0A0\uC9DC");
		dlabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		dlabel.setBounds(366, 68, 50, 29);
		getContentPane().add(dlabel);

		String[] a3 = { "\uC120\uD0DD","1\uC6D4", "2\uC6D4", "3\uC6D4", "4\uC6D4", "5\uC6D4", "6\uC6D4", "7\uC6D4", "8\uC6D4",
				"9\uC6D4", "10\uC6D4", "11\uC6D4", "12\uC6D4" };
		JComboBox comboBox3 = new JComboBox(a3);
		comboBox3.setBounds(338, 102, 50, 21);
		getContentPane().add(comboBox3);
		comboBox3.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		String[] a4 = {"\uC120\uD0DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox comboBox4 = new JComboBox(a4);
		comboBox4.setBounds(401, 102, 50, 21);
		getContentPane().add(comboBox4);
		comboBox4.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		String[] a5 = {"\uC120\uD0DD", "08:20", "11:00", "14:30", "16:00", "21:00", "23:20" };
		JComboBox comboBox5 = new JComboBox(a5);
		JLabel tlabel = new JLabel("\uC2DC\uAC04");
		tlabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		tlabel.setBounds(39, 154, 50, 32);
		getContentPane().add(tlabel);
		comboBox5.setBounds(14, 193, 133, 21);
		getContentPane().add(comboBox5);
		comboBox5.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		JLabel hlabel = new JLabel("\uC0C1\uC601\uAD00");
		hlabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		hlabel.setBounds(197, 156, 70, 29);
		getContentPane().add(hlabel);

		String[] a6 = {"\uC120\uD0DD", "1\uAD00", "2\uAD00", "3\uAD00", "4\uAD00", "5\uAD00" };
		JComboBox comboBox6 = new JComboBox(a6);
		comboBox6.setBounds(174, 193, 133, 21);
		getContentPane().add(comboBox6);
		comboBox6.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		JPanel panel = new JPanel();
		panel.setBounds(14, 239, 457, 212);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("\uC120\uD0DD\uD558\uC2E0 \uC608\uB9E4 \uC815\uBCF4");
		lblNewLabel_4.setBounds(131, 10, 180, 24);
		lblNewLabel_4.setFont(new Font("ÈÞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.PLAIN, 20));
		panel.add(lblNewLabel_4);

		JButton reservabtn = new JButton("\uC608\uB9E4>>");
		reservabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservabtn.setForeground(new Color(0, 0, 153));
		reservabtn.setFont(new Font("±¼¸²", Font.BOLD, 15));
		reservabtn.setBounds(348, 179, 97, 23);
		panel.add(reservabtn);

		//
		mtextField = new JTextField();
		mtextField.setBounds(12, 53, 116, 21);
		comboBox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				mtextField.setText(comboBox1.getSelectedItem().toString());

			}
		});

		panel.add(mtextField);
		mtextField.setColumns(10);
		//
		
		ctextField = new JTextField();
		ctextField.setBounds(167, 53, 116, 21);
		comboBox2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				ctextField.setText(comboBox2.getSelectedItem().toString());

			}
		});

		panel.add(ctextField);
		ctextField.setColumns(10);
		//
		
		dtextField = new JTextField();
		dtextField.setBounds(329, 53, 44, 24);
		comboBox3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				dtextField.setText(comboBox3.getSelectedItem().toString());

			}
		});
		panel.add(dtextField);
		dtextField.setColumns(10);

		dtextField2 = new JTextField();
		dtextField2.setBounds(385, 53, 50, 25);
		comboBox4.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				dtextField2.setText(comboBox4.getSelectedItem().toString());

			}
		});
		panel.add(dtextField2);
		dtextField2.setColumns(10);
		
		ttextField = new JTextField();
		ttextField.setBounds(12, 114, 116, 21);
		comboBox5.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				ttextField.setText(comboBox5.getSelectedItem().toString());

			}
		});
		
		panel.add(ttextField);
		ttextField.setColumns(10);

		htextField = new JTextField();
		htextField.setBounds(167, 114, 116, 21);
		comboBox6.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				htextField.setText(comboBox6.getSelectedItem().toString());

			}
		});
		panel.add(htextField);
		htextField.setColumns(10);

		setVisible(true);
	}
}
