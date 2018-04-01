package kutuphane.classlar;

import kutuphane.Formlar.Baglantı.Baglanti;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Uye {

    private int uye_id;
    private String uye_adi;
    private String uye_soyadi;
    private int adminlik;

    public Uye() {
    }

    public Uye(int uye_id, String uye_adi, String uye_soyadi, int adminlik) {
        this.uye_id = uye_id;
        this.uye_adi = uye_adi;
        this.uye_soyadi = uye_soyadi;
        this.adminlik = adminlik;
    }

    public void setUye_id(int uye_id) {
        this.uye_id = uye_id;
    }

    public void setUye_adi(String uye_adi) {
        this.uye_adi = uye_adi;
    }

    public void setUye_soyadi(String uye_soyadi) {
        this.uye_soyadi = uye_soyadi;
    }

    public void setAdminlik(int adminlik) {
        this.adminlik = adminlik;
    }

    public int getUye_id() {
        return uye_id;
    }

    public String getUye_adi() {
        return uye_adi;
    }

    public String getUye_soyadi() {
        return uye_soyadi;
    }

    public int getAdminlik() {
        return adminlik;
    }

    public void uyeKayıtEkle(int id, String ad, String soyad, int admin) {

        Baglanti bag = new Baglanti();
        bag.baglanti();

        String sql = "INSERT INTO uye values ('" + id + "','" + ad + "','" + soyad + "','" + admin + "')";

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
