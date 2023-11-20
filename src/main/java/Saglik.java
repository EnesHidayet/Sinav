public abstract class Saglik implements ISaglik{
    public static Birey [] asilananlar=new Birey[10];
    public static int asilananSayisi=0;

    public int getAsilananSayisi() {
        return asilananSayisi;
    }

    public Birey[] getAsilananlar() {
        return asilananlar;
    }


    public void asilamaYap(Birey birey) {
        if (!birey.bulastirirMi){
            System.out.println(birey.ad+" süper insan aþýlanmasý gerekmez.");
        }else if (birey.hastalanirMi){
            System.out.println(birey.ad+" aþýlandý.");
            birey.asiDurumu=true;
            birey.hastalanirMi=false;
            asilananlar[asilananSayisi]=birey;
            asilananSayisi++;

        }else System.out.println("Doktor "+birey.ad+" zaten aþýlanmýþtýr.");
    }


    public void asilananlariListele(){
        System.out.println("Aþýlananlar listesi.");
        for (int i=0;i<asilananSayisi;i++){
            System.out.println("Aþýlanan "+(i+1)+". kiþi "+asilananlar[i].getId()+" id'li "+asilananlar[i].ad+" "+asilananlar[i].soyad);
        }
    }


}
