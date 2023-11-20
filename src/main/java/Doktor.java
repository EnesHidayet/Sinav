public class Doktor extends Birey{
    public Doktor(String ad, String soyad) {
        super(ad, soyad, true, false, true);
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", asiDurumu=" + asiDurumu +
                ", hastalanirMi=" + hastalanirMi +
                ", bulastirirMi=" + bulastirirMi +
                '}';
    }
}
