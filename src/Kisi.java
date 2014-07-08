/**
 * Created by xmdemirci on 08.07.2014.
 */
public class Kisi {


    private String ad;
    private String soyad;
    private int yas;


    public Kisi(){

    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void yazdir(){

        System.out.println("Adim    :" + this.getAd());
        System.out.println("Soyadim :" + this.getSoyad());
        System.out.println("Yasim   :" + this.getYas());


    }

}
