import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FirstGui extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	public FirstGui() {
		// TODO Auto-generated constructor stub
		this.setSize(700,500);
		this.setTitle("Glavni prozor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel(new GridBagLayout());
		
		JButton btn1 = new JButton("Klik 1");
		JButton btn2 = new JButton("Klik 2");
		
		JCheckBox ckb1 = new JCheckBox("Ček 1");
		JCheckBox ckb2 = new JCheckBox("Ček 2");
		
		JLabel lbl1 = new JLabel("Neki naslov");
		JTextArea txa = new JTextArea("Ovo je neki tekst ...");
		JTextField txf = new JTextField("Ovo je kao tekst polje");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);
		
		panel.add(btn1);
		panel.add(btn2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel3.add(lbl1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel3.add(txa, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel3.add(txf, gbc);
		
		panel2.add(ckb1);
		panel2.add(ckb2);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.SOUTH);
		this.add(panel3, BorderLayout.CENTER);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Klinuto je OK ... ");
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
