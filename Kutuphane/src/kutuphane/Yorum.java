
package kutuphane;

import java.sql.Date;


public class Yorum {
   
    private int yorum_id;
    private String icerik;
    private Kutuphane kitap_id;
    private Uye uye_id;
    private Date yorum_tarihi;
    
    
    
    public Yorum(int yorum_id, String icerik, Kutuphane kitap_id, Uye uye_id, Date yorum_tarihi) {
        this.yorum_id = yorum_id;
        this.icerik = icerik;
        this.kitap_id = kitap_id;
        this.uye_id = uye_id;
        this.yorum_tarihi = yorum_tarihi;
    }

    public Kutuphane getKitap_id() {
        return kitap_id;
    }

    public void setKitap_id(Kutuphane kitap_id) {
        this.kitap_id = kitap_id;
    }
   
  
    public int getYorum_id() {
        return yorum_id;
    }

    public void setYorum_id(int yorum_id) {
        this.yorum_id = yorum_id;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Uye getUye_id() {
        return uye_id;
    }

    public void setUye_id(Uye uye_id) {
        this.uye_id = uye_id;
    }

    public Date getYorum_tarihi() {
        return yorum_tarihi;
    }

    public void setYorum_tarihi(Date yorum_tarihi) {
        this.yorum_tarihi = yorum_tarihi;
    }
    

    
    public void yorumEkle(){
        
        
    }


 
    
    
}
