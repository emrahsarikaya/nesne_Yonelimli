
package kutuphane;


public class Yazar {
    private int yazar_id;
    private String yazar_adi;
    private String yazar_soyadi;
    private String mail;

    public Yazar() {
    }

    public Yazar(int yazar_id, String yazar_adi, String yazar_soyadi, String mail) {
        this.yazar_id = yazar_id;
        this.yazar_adi = yazar_adi;
        this.yazar_soyadi = yazar_soyadi;
        this.mail = mail;
    }

    public int getYazar_id() {
        return yazar_id;
    }

    public void setYazar_id(int yazar_id) {
        this.yazar_id = yazar_id;
    }

    public String getYazar_adi() {
        return yazar_adi;
    }

    public void setYazar_adi(String yazar_adi) {
        this.yazar_adi = yazar_adi;
    }

    public String getYazar_soyadi() {
        return yazar_soyadi;
    }

    public void setYazar_soyadi(String yazar_soyadi) {
        this.yazar_soyadi = yazar_soyadi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
    public void yazarEkle(){
        
        
    }
    
    
}
