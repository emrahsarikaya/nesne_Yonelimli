
package kutuphane;

public class Yayinevi {
   
    private int yayinevi_id;
    private String yayinevi_adi;
    private String iletisim;

    public Yayinevi() {
    }

    public Yayinevi(int yayinevi_id, String yayinevi_adi, String iletisim) {
        this.yayinevi_id = yayinevi_id;
        this.yayinevi_adi = yayinevi_adi;
        this.iletisim = iletisim;
    }

    public int getYayinevi_id() {
        return yayinevi_id;
    }

    public void setYayinevi_id(int yayinevi_id) {
        this.yayinevi_id = yayinevi_id;
    }

    public String getYayinevi_adi() {
        return yayinevi_adi;
    }

    public void setYayinevi_adi(String yayinevi_adi) {
        this.yayinevi_adi = yayinevi_adi;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }
    
}
