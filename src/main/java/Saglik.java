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
            System.out.println(birey.ad+" s�per insan a��lanmas� gerekmez.");
        }else if (birey.hastalanirMi){
            System.out.println(birey.ad+" a��land�.");
            birey.asiDurumu=true;
            birey.hastalanirMi=false;
            asilananlar[asilananSayisi]=birey;
            asilananSayisi++;

        }else System.out.println("Doktor "+birey.ad+" zaten a��lanm��t�r.");
    }


    public void asilananlariListele(){
        System.out.println("A��lananlar listesi.");
        for (int i=0;i<asilananSayisi;i++){
            System.out.println("A��lanan "+(i+1)+". ki�i "+asilananlar[i].getId()+" id'li "+asilananlar[i].ad+" "+asilananlar[i].soyad);
        }
    }


}
