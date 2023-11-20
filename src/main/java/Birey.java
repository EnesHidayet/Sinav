import java.util.UUID;

public class Birey extends Saglik{
    UUID id= UUID.randomUUID();
    String ad;
    String soyad;
    boolean asiDurumu;
    boolean hastalanirMi;
    boolean bulastirirMi;

    public Birey() {
    }

    public Birey(String ad, String soyad, boolean asiDurumu, boolean hastalanirMi, boolean bulastirirMi) {
        this.ad = ad;
        this.soyad = soyad;
        this.asiDurumu = asiDurumu;
        this.hastalanirMi = hastalanirMi;
        this.bulastirirMi = bulastirirMi;
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

    public boolean isAsiDurumu() {
        return asiDurumu;
    }

    public void setAsiDurumu(boolean asiDurumu) {
        this.asiDurumu = asiDurumu;
    }

    public boolean isHastalanirMi() {
        return hastalanirMi;
    }

    public void setHastalanirMi(boolean hastalanirMi) {
        this.hastalanirMi = hastalanirMi;
    }

    public boolean isBulastirirMi() {
        return bulastirirMi;
    }

    public void setBulastirirMi(boolean bulastirirMi) {
        this.bulastirirMi = bulastirirMi;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Birey{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", asiDurumu=" + asiDurumu +
                ", hastalanirMi=" + hastalanirMi +
                ", bulastirirMi=" + bulastirirMi +
                '}';
    }

}
