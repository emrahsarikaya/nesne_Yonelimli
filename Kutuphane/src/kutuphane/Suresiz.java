
package kutuphane;


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
    public void kitapEkle() {
        super.kitapEkle(); 
    }

    @Override
    public void kitapSil() {
        super.kitapSil(); 
    }
    
    
    
}
