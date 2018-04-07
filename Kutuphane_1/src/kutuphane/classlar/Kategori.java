
package kutuphane.classlar;

import java.sql.Statement;
import javax.swing.JOptionPane;
import kutuphane.Formlar.Baglantı.Baglanti;


public class Kategori {
    private int kategori_id;
    private String kategori_adi;

    public Kategori() {
    }

    public Kategori(int kategori_id, String kategori_adi) {
        this.kategori_id = kategori_id;
        this.kategori_adi = kategori_adi;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
    }
   
    public void kategoriEkle(int id,String ad){
        
        Baglanti bag = new Baglanti();
        bag.baglanti();

        String sql = "INSERT INTO kategori values ('" + id + "','" + ad + "')";

        try {
            Statement sta = bag.c.createStatement();
            sta.execute(sql);
            JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
        } catch (Exception e) {
            //
            JOptionPane.showMessageDialog(null, "Ekleme Başarısız");
            System.out.println(e.toString());
        }
        bag.bagKapat();
    }
    
    
}
