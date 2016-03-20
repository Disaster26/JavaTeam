import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JPanel;

public class Liquidy extends JFrame {
	private JButton btnInsert;
	private JTextField txtSmak;
	private JTextField txtMl;
	private JTextField txtKropla;
	private JTextField txtFirma;
	protected static String Kropla="";
	protected static String ML="";
	protected static String Smak="";
	protected static String Firma="";
	protected static String Firmaa="";
	protected static String Kroplaa="";
	protected static String MLL="";
	protected static String Smakk="";
	private JTextPane pane;
	private JTable table;
	private JButton btnZmiana;
	public Liquidy() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnInsert_1 = new JButton("New button");
		btnInsert_1.setBounds(30, 5, 89, 23);
		panel.add(btnInsert_1);
		
		txtFirma = new JTextField();
		txtFirma.setBounds(124, 6, 86, 20);
		panel.add(txtFirma);
		txtFirma.setText("hehehhe");
		txtFirma.setColumns(10);
		
		txtSmak = new JTextField();
		txtSmak.setBounds(215, 6, 86, 20);
		panel.add(txtSmak);
		txtSmak.setColumns(10);
		
		txtMl = new JTextField();
		txtMl.setBounds(306, 6, 86, 20);
		panel.add(txtMl);
		txtMl.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(107, 65, 227, 196);
		panel.add(textPane);
		
		txtKropla = new JTextField();
		txtKropla.setBounds(80, 34, 86, 20);
		panel.add(txtKropla);
		txtKropla.setColumns(10);
		
		JButton btnLoad = new JButton("New button");
		btnLoad.setBounds(171, 33, 89, 23);
		panel.add(btnLoad);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 262);
		getContentPane().add(panel_1);
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			BazaOdczyt BazaO = new BazaOdczyt();
			BazaO.BazaOdczyt();
			textPane.setText(Firmaa+""+Kroplaa+""+MLL+""+Smakk);
			
			
			
			}
		});
		btnInsert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Kropla=txtKropla.getText();
				Firma=txtFirma.getText();
				ML=txtMl.getText();
				Smak=txtSmak.getText();
				BazaWczytaj baza = new BazaWczytaj();
				baza.Baza();
								
			}
		});

		btnZmiana = new JButton("New button");
		btnZmiana.setBounds(265, 33, 89, 23);
		btnZmiana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
				
			}
		});
		panel.add(btnZmiana);
	}

	public static void main(String[] args) {
		Liquidy liqq = new Liquidy();
		liqq.setVisible(true);
		liqq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		

	}
}
