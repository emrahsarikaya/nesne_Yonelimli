package kutuphane;
public class uye {
   
    private int uye_id;
    private String uye_adi;
    private String uye_soyadi;
    private int adminlik;

    public uye() {
    }

    public uye(int uye_id, String uye_adi, String uye_soyadi, int adminlik) {
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
    
    
    public void uyeKayıtEkle(){
        
        
    }
    
}
