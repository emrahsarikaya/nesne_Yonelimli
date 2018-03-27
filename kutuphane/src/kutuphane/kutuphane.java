package kutuphane;

public class kutuphane {

    private int kitap_id;
    private String kitap_adi;
    private int sayfa_sayisi;
    private int basim_tarihi;
    private int yayinevi_id;

    public kutuphane() {
    }

    public kutuphane(int kitap_id) {
        this.kitap_id = kitap_id;
    }

    public kutuphane(int kitap_id, String kitap_adi) {
        this.kitap_id = kitap_id;
        this.kitap_adi = kitap_adi;
    }

    
    public kutuphane(int kitap_id, String kitap_adi, int sayfa_sayisi, int basim_tarihi, int yayinevi_id) {
        this.kitap_id = kitap_id;
        this.kitap_adi = kitap_adi;
        this.sayfa_sayisi = sayfa_sayisi;
        this.basim_tarihi = basim_tarihi;
        this.yayinevi_id = yayinevi_id;
    }

    public int getKitap_id() {
        return kitap_id;
    }

    public void setKitap_id(int kitap_id) {
        this.kitap_id = kitap_id;
    }

    public String getKitap_adi() {
        return kitap_adi;
    }

    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    public int getSayfa_sayisi() {
        return sayfa_sayisi;
    }

    public void setSayfa_sayisi(int sayfa_sayisi) {
        this.sayfa_sayisi = sayfa_sayisi;
    }

    public int getBasim_tarihi() {
        return basim_tarihi;
    }

    public void setBasim_tarihi(int basim_tarihi) {
        this.basim_tarihi = basim_tarihi;
    }

    public int getYayinevi_id() {
        return yayinevi_id;
    }

    public void setYayinevi_id(int yayinevi_id) {
        this.yayinevi_id = yayinevi_id;
    }
    
    
   
    //EKLEME METODU
    public void kitapEkle(){
        
        
    }
    
    // SİLME METODU
    public void kitapSil(){
        
    }
    
    
    
    

}
