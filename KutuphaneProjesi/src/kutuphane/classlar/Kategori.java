
package kutuphane.classlar;


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
   
    
    
    
}