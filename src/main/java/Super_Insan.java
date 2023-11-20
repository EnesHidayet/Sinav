public class Super_Insan extends Birey{
    public Super_Insan(String ad, String soyad) {
        super(ad, soyad, false, false, false);
    }

    @Override
    public String toString() {
        return "Super_Insan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", asiDurumu=" + asiDurumu +
                ", hastalanirMi=" + hastalanirMi +
                ", bulastirirMi=" + bulastirirMi +
                '}';
    }
}
