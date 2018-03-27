
package kutuphane;

public class sureli extends kutuphane{
    private int sureli_id;
    private int sayi;
    private int editor_id;

    public sureli() {
    }

    public sureli(int sureli_id, int sayi, int editor_id) {
        this.sureli_id = sureli_id;
        this.sayi = sayi;
        this.editor_id = editor_id;
    }

    public sureli(int sureli_id, int sayi, int editor_id, int kitap_id, String kitap_adi, int sayfa_sayisi, int basim_tarihi, int yayinevi_id) {
        super(kitap_id, kitap_adi, sayfa_sayisi, basim_tarihi, yayinevi_id);
        this.sureli_id = sureli_id;
        this.sayi = sayi;
        this.editor_id = editor_id;
    }
    

    public int getSureli_id() {
        return sureli_id;
    }

    public void setSureli_id(int sureli_id) {
        this.sureli_id = sureli_id;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int getEditor_id() {
        return editor_id;
    }

    public void setEditor_id(int editor_id) {
        this.editor_id = editor_id;
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
