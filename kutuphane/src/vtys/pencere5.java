package vtys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class pencere5 {

	public JFrame frame;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pencere5 window = new pencere5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pencere5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Silmek \u0130stedi\u011Finiz Yazar\u0131n ID Numaras\u0131n\u0131 Giriniz");
		lblNewLabel.setBounds(12, 26, 278, 24);
		frame.getContentPane().add(lblNewLabel);
		
		txt2 = new JTextField();
		txt2.setBounds(302, 27, 218, 22);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    try {
					
					Class.forName("org.postgresql.Driver");
	    			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
	    			System.out.println("Baglantý Baþarýlý");
	    			String delete="delete from yazar where yazar_id= ?";
	    			PreparedStatement pst=con.prepareStatement(delete);
	    			pst.setInt(1,Integer.valueOf(txt2.getText()));	                
	                pst.executeUpdate();
	                JOptionPane.showMessageDialog(null,"Yazar Bilgileri Silindi");
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}     
			}
		});
		btnNewButton.setBounds(383, 82, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}

}
