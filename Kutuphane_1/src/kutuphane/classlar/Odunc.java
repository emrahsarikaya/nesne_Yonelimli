
package kutuphane.classlar;

import java.sql.Date;


public class Odunc {
    
    private int oduncu_id;
    private int uye_id;
    private int stok_id;
    private Date odunc_tarihi;

    public Odunc() {
    }

    public Odunc(int oduncu_id, int uye_id, int stok_id, Date odunc_tarihi) {
        this.oduncu_id = oduncu_id;
        this.uye_id = uye_id;
        this.stok_id = stok_id;
        this.odunc_tarihi = odunc_tarihi;
    }

    public int getOduncu_id() {
        return oduncu_id;
    }

    public void setOduncu_id(int oduncu_id) {
        this.oduncu_id = oduncu_id;
    }

    public int getUye_id() {
        return uye_id;
    }

    public void setUye_id(int uye_id) {
        this.uye_id = uye_id;
    }

    public int getStok_id() {
        return stok_id;
    }

    public void setStok_id(int stok_id) {
        this.stok_id = stok_id;
    }

    public Date getOdunc_tarihi() {
        return odunc_tarihi;
    }

    public void setOdunc_tarihi(Date odunc_tarihi) {
        this.odunc_tarihi = odunc_tarihi;
    }
    
    
    
    
    public void oduncVer(){
        
        
    }
    
    public void kitapAl(){
        
    }
    
    
}
