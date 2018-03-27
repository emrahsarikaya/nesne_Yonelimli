package vtys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class pencere3 {

	public JFrame frame;
	private JTextField kid;
	private JTextField yaid;
	private JTextField kadý;
	private JTextField ktür;
	private JTextField btarih;
	private JTextField sayfa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pencere3 window = new pencere3();
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
	public pencere3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 300, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kitap ID");
		lblNewLabel.setBounds(31, 27, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Yay\u0131nevi ID");
		lblNewLabel_6.setBounds(31, 102, 69, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		kid = new JTextField();
		kid.setBounds(101, 24, 116, 22);
		frame.getContentPane().add(kid);
		kid.setColumns(10);
		
		yaid = new JTextField();
		yaid.setBounds(101, 99, 116, 22);
		frame.getContentPane().add(yaid);
		yaid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kitap Ad\u0131");
		lblNewLabel_2.setBounds(229, 27, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		kadý = new JTextField();
		kadý.setBounds(297, 24, 116, 22);
		frame.getContentPane().add(kadý);
		kadý.setColumns(10);
		
		ktür = new JTextField();
		ktür.setBounds(297, 99, 116, 22);
		frame.getContentPane().add(ktür);
		ktür.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Kitap T\u00FCr\u00FC");
		lblNewLabel_3.setBounds(229, 102, 69, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bas\u0131m Tarihi");
		lblNewLabel_4.setBounds(425, 27, 74, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sayfa Say\u0131s\u0131");
		lblNewLabel_5.setBounds(425, 102, 72, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		btarih = new JTextField();
		btarih.setBounds(503, 24, 116, 22);
		frame.getContentPane().add(btarih);
		btarih.setColumns(10);
		
		sayfa = new JTextField();
		sayfa.setBounds(503, 99, 116, 22);
		frame.getContentPane().add(sayfa);
		sayfa.setColumns(10);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
                {
                  /*Class.forName("org.postgresql.Driver");        			
        			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
        			System.out.println("Baglantý Baþarýlý");
        			Statement stat=con.createStatement();   
                    String insert="insert into yazar values("+yid.getText()+","+yad.getText()+","+ysoyad.getText()+","+ytel.getText()+");";
                    stat.execute(insert);
                    System.out.println("Ekleme Baþarýlý");*/
					Class.forName("org.postgresql.Driver");        			
        			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
        			System.out.println("Baglantý Baþarýlý");
					String insert2="INSERT INTO kitap (kitap_id,yayinevi_id,adi,tür,basimtarihi,sayfasayisi) VALUES(?,?,?,?,?,?);";
					PreparedStatement pst=con.prepareStatement(insert2);
                    pst.setInt(1,Integer.valueOf(kid.getText()));
                    pst.setInt(2,Integer.valueOf(yaid.getText()));
                    pst.setString(3,kadý.getText());
                    pst.setString(4,ktür.getText());
                    pst.setInt(5,Integer.valueOf(btarih.getText()));
                    pst.setInt(6,Integer.valueOf(sayfa.getText()));
                    pst.executeUpdate();
                    System.out.println("Ekleme Baþarýlý");
                }
                catch(Exception ex){  
                	
                    System.out.println(ex);
                }
			}
		});
		btnEkle.setBounds(287, 205, 97, 25);
		frame.getContentPane().add(btnEkle);
		
	
	}
}
