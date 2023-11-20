public class Normal_Insan extends Birey{
    public Normal_Insan(String ad, String soyad) {
        super(ad, soyad, false, true, true);
    }


    @Override
    public String toString() {
        return "Normal_Insan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", asiDurumu=" + asiDurumu +
                ", hastalanirMi=" + hastalanirMi +
                ", bulastirirMi=" + bulastirirMi +
                '}';
    }
}
