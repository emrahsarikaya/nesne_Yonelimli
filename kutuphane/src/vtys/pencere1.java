package vtys;
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

public class pencere1 {
public static Connection c ; 
public static void baglanti(){
	
		try {
			Class.forName("org.postgresql.Driver");
			String baglanti = "jdbc:postgresql://localhost:5432/kitapEvi";
			String KulAdi = "postgres";
			String KulSifre = "5432" ;
			c = DriverManager.getConnection(baglanti, KulAdi, KulSifre);
			System.out.println("Baglantý Baþarýlý");
		}catch (Exception e){
			System.out.println(e.toString());
		}
	   }
		public static void bagKapat() {
			try {
			c.close();
			System.out.println("Baglantý Baþarý ile Kapatýldý");
			}catch (Exception e){
				System.out.println(e.toString());
			}
			
		}

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		baglanti();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pencere1 window = new pencere1();
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
	public pencere1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(0,0,1100,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnYazarTablosu = new JButton("Yazar Tablosu");
		btnYazarTablosu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                /*JFrame form2 = new JFrame();
                form2.setBounds(0,0,600,350);
        		form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		form2.getContentPane().setLayout(null);
                form2.setVisible(true);*/
				JTextArea txtara = new JTextArea();
				txtara.setBounds(276, 13, 794, 477);
				frame.getContentPane().add(txtara);
				String ekle="";
                try 
                {
                	Class.forName("org.postgresql.Driver");        			
        			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
        			System.out.println("Baglantý Baþarýlý");
        			Statement stat=con.createStatement();   
                    ResultSet res=stat.executeQuery("select * from yazar");
                    while(res.next()){
                    ekle +=res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getLong(4)+"\n";
                    txtara.setText(ekle) ;}
                    con.close();                  
                }
                catch(Exception ex){  
                	
                    System.out.println(ex);
                }
			  
				
			}
		});
		btnYazarTablosu.setBounds(47, 34, 201, 25);
		frame.getContentPane().add(btnYazarTablosu);
		
		JButton btnNewButton = new JButton("Kitap Tablosu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 /*JFrame form3 = new JFrame();
	                form3.setBounds(0,0,600,350);
	        		form3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        		form3.getContentPane().setLayout(null);
	                form3.setVisible(true);*/
				JTextArea txtara = new JTextArea();
				txtara.setBounds(276, 13, 794, 477);
				frame.getContentPane().add(txtara);
				String ekle="";
                try 
                {
                	Class.forName("org.postgresql.Driver");        			
        			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitapEvi","postgres","5432");                    
        			System.out.println("Baglantý Baþarýlý");
        			Statement stat=con.createStatement();   
                    ResultSet res=stat.executeQuery("select * from kitap");
                    while(res.next()){
                    ekle +=res.getInt(1)+"  "+res.getInt(2)+"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getInt(5)+"  "+res.getInt(6)+"\n";
                    txtara.setText(ekle) ;}
                    con.close();                  
                }
                catch(Exception ex){  
                	
                    System.out.println(ex);
                }
				
			}
		});
		btnNewButton.setBounds(47, 85, 201, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Yazar Eklemek \u0130\u00E7in T\u0131klay\u0131n\u0131z");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pencere2 pencere2= new pencere2();
				pencere2.frame.setVisible(true);
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(47, 137, 201, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kitap Eklemek \u0130\u00E7in T\u0131klay\u0131n\u0131z");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pencere3 pencere3= new pencere3();
				pencere3.frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(47, 184, 201, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Kitap Silmek \u0130\u00E7in T\u0131klay\u0131n\u0131z");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pencere4 pencere4= new pencere4();
				pencere4.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(47, 232, 201, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Yazar Silmek \u0130\u00E7in T\u0131klay\u0131n\u0131z");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pencere5 pencere5= new pencere5();
				pencere5.frame.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(47, 279, 201, 25);
		frame.getContentPane().add(btnNewButton_4);
		
		
		
		//JTextArea txtara = new JTextArea();
		//txtara.setBounds(276, 13, 794, 477);
		//frame.getContentPane().add(txtara);
	}
}
