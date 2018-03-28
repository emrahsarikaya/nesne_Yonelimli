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


public class pencere4 {

	public JFrame frame;
	private JTextField txt;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pencere4 window = new pencere4();
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
	public pencere4() {
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
		
		JLabel lblSilmekIstediinizKitabn = new JLabel("Silmek \u0130stedi\u011Finiz Kitab\u0131n ID Numaras\u0131n\u0131 Giriniz");
		lblSilmekIstediinizKitabn.setBounds(12, 13, 271, 36);
		frame.getContentPane().add(lblSilmekIstediinizKitabn);
		
		txt = new JTextField();
		txt.setBounds(286, 20, 234, 22);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		btnNewButton = new JButton("Sil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("org.postgresql.Driver");
	    			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
	    			System.out.println("Baglantý Baþarýlý");
	    			String delete="delete from kitap where kitap_id= ?";
	    			PreparedStatement pst=con.prepareStatement(delete);
	    			pst.setInt(1,Integer.valueOf(txt.getText()));	                
	                pst.executeUpdate();
	                JOptionPane.showMessageDialog(null,"Kitap Bilgileri Silindi");
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
