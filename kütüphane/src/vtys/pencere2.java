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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class pencere2 {

	public JFrame frame;
	private JTextField yid;
	private JTextField yad;
	private JTextField ysoyad;
	private JTextField ytel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pencere2 window = new pencere2();
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
	public pencere2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 400, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yazar ID");
		lblNewLabel.setBounds(41, 44, 105, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Yazar Ad\u0131");
		lblNewLabel_1.setBounds(41, 117, 105, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Yazar Soyad\u0131");
		lblNewLabel_2.setBounds(40, 178, 106, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Yazar\u0131n Telefonu");
		lblNewLabel_3.setBounds(41, 245, 119, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		yid = new JTextField();
		yid.setBounds(193, 50, 242, 22);
		frame.getContentPane().add(yid);
		yid.setColumns(10);
		
		yad = new JTextField();
		yad.setBounds(193, 122, 242, 22);
		frame.getContentPane().add(yad);
		yad.setColumns(10);
		
		ysoyad = new JTextField();
		ysoyad.setBounds(193, 183, 242, 22);
		frame.getContentPane().add(ysoyad);
		ysoyad.setColumns(10);
		
		ytel = new JTextField();
		ytel.setBounds(193, 250, 242, 22);
		frame.getContentPane().add(ytel);
		ytel.setColumns(10);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					String insert="INSERT INTO yazar (yazar_id, ad , soyad, telno) VALUES(?,?,?,?);";
					PreparedStatement pst=con.prepareStatement(insert);
                    pst.setInt(1,Integer.valueOf(yid.getText()));
                    pst.setString(2,yad.getText());
                    pst.setString(3,ysoyad.getText());
                    pst.setLong(4,Long.valueOf(ytel.getText()));
                    pst.executeUpdate();
                    System.out.println("Ekleme Baþarýlý");
                }
                catch(Exception ex){  
                	
                    System.out.println(ex);
                }
				
			}
		});
		btnEkle.setBounds(442, 304, 114, 22);
		frame.getContentPane().add(btnEkle);
	}
}
