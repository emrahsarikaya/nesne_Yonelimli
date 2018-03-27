
package kutuphane;


public class suresiz extends kutuphane{
    
    private int suresiz_id;
    private int yazar_id;
    private int kategori_id;

    public suresiz() {
    }

    public suresiz(int suresiz_id, int yazar_id, int kategori_id) {
        this.suresiz_id = suresiz_id;
        this.yazar_id = yazar_id;
        this.kategori_id = kategori_id;
    }

    public suresiz(int suresiz_id, int yazar_id, int kategori_id, int kitap_id, String kitap_adi, int sayfa_sayisi, int basim_tarihi, int yayinevi_id) {
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

    public int getYazar_id() {
        return yazar_id;
    }

    public void setYazar_id(int yazar_id) {
        this.yazar_id = yazar_id;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    
    
    
    @Override
    public void kitapEkle() {
        super.kitapEkle(); 
    }

    @Override
    public void kitapSil() {
        super.kitapSil(); 
    }
    
    
    
}
