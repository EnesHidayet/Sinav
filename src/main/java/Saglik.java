public abstract class Saglik implements ISaglik{
    Birey [] asilananlar=new Birey[10];
    int asilananSayisi=0;

    public int getAsilananSayisi() {
        return asilananSayisi;
    }

    public Birey[] getAsilananlar() {
        return asilananlar;
    }


    public void asilamaYap(Birey birey) {
        if (birey.bulastirirMi==false){
            System.out.println(birey.ad+" süper insan aþýlanmasý gerekmez.");
        }else if (birey.hastalanirMi==true){
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
