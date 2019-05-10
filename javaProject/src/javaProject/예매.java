package javaProject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class 예매 {
		

	public static void main(String args[]) {
		String headers[] = {"영화선택", "지역","날짜","영화관","시간","좌석"};
		String mname[] = {"어벤져스","걸캅스","나의 특별한 형제"};
		
		JComboBox<String> combobox = new JComboBox<String>(mname);
		
		TableCellEditor editor = new DefaultCellEditor(combobox);
		JFrame f = new JFrame("My 영화관");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTable t = new JTable(new DefaultTableModel());
		
		t.getColumnModel().getColumn(0).setCellEditor(editor);
		
		JScrollPane scrollpane = new JScrollPane(t);
		f.add(scrollpane, BorderLayout.CENTER);
		f.setSize(300, 150);
		f.setVisible(true);
		
		
		
		
		
		
	}

	

}
