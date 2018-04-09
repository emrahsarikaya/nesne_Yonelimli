
package kutuphane;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class Suresiz extends Kutuphane{
    
    private int suresiz_id;
    private Yazar yazar_id;
    private Kategori kategori_id;

    public Suresiz() {
    }

    public Suresiz(int suresiz_id, Yazar yazar_id, Kategori kategori_id) {
        this.suresiz_id = suresiz_id;
        this.yazar_id = yazar_id;
        this.kategori_id = kategori_id;
    }

    public Suresiz(int suresiz_id, Yazar yazar_id, Kategori kategori_id, int kitap_id, String kitap_adi, int sayfa_sayisi, int basim_tarihi, Yayinevi yayinevi_id) {
        super(kitap_id, kitap_adi, sayfa_sayisi, basim_tarihi, yayinevi_id);
        this.suresiz_id = suresiz_id;
        this.yazar_id = yazar_id;
        this.kategori_id = kategori_id;
    }

    public int getSuresiz_id() {
        return suresiz_id;
    }

    public void setSuresiz_id(int suresiz_id) {
        this.suresiz_id = suresiz_id;
    }

    public Yazar getYazar_id() {
        return yazar_id;
    }

    public void setYazar_id(Yazar yazar_id) {
        this.yazar_id = yazar_id;
    }

    public Kategori getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(Kategori kategori_id) {
        this.kategori_id = kategori_id;
    }

    
    
    
    @Override
    public void kitapEkle(int suresizid, int yazarid, int kategoriid, int kitapid, String kitapadi, int sayfa, int basim, int yayineviid) {
      
         Baglanti bag = new Baglanti();
        bag.baglanti();
        String sql1 = "INSERT INTO kutuphane values ('" + kitapid + "','" + kitapadi + "','" + sayfa + "','" + basim + "','" + yayineviid + "')";
        String sql2 = "INSERT INTO suresiz values ('" + kitapid + "','" + suresizid + "','" + yazarid + "','" + kategoriid + "')";


        

       try {
            Statement sta = bag.c.createStatement();
            sta.execute(sql1);
            JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
        } catch (Exception e) {
            //
            JOptionPane.showMessageDialog(null, "Ekleme Başarısız");
            System.out.println(e.toString());
        }
        try {
            Statement sta = bag.c.createStatement();
            sta.execute(sql2);
            JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
        } catch (Exception e) {
            //
            JOptionPane.showMessageDialog(null, "Ekleme Başarısız");
            System.out.println(e.toString());
        }
        bag.bagKapat();


        
        
    }

    @Override
    public void kitapSil(int id) {
        Baglanti bag=new Baglanti();
        bag.baglanti();
        String sql1 = "DELETE from kutuphane where kitap_id='" + id + "'";
        String sql2="DELETE from suresiz where kitap_id='"+id+"'";
        
        try {
            Statement sta = bag.c.createStatement();
            sta.executeUpdate(sql1);

            JOptionPane.showMessageDialog(null, "Silme islemi Basariyla Gerceklesti");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Silme islemi Basarisiz");
            System.out.println(e.toString());

        }
         try {
            Statement sta = bag.c.createStatement();
            sta.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null, "Silme islemi Basariyla Gerceklesti");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Silme islemi Basarisiz");
            System.out.println(e.toString());
        
        }
        
        bag.bagKapat(); 

   }
}
