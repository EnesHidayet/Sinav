public class Test {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        Birey doktor=new Doktor("Muhammet","Hoca");
        doktor.asilamaYap(doktor);

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        Birey superInsan=new Super_Insan("Mustafa","Hoca");
        doktor.asilamaYap(superInsan);

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        Birey insan=new Normal_Insan("Enes","Aslan");
        System.out.println(insan.ad+" aþýlanmýþ mý sorusunun cevabý "+insan.asiDurumu);
        System.out.println(insan.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan.bulastirirMi);
        System.out.println(insan.ad+" hastalanýr mý sorusunun cevabý "+insan.hastalanirMi);
        System.out.println();
        doktor.asilamaYap(insan);
        System.out.println();
        System.out.println(insan.ad+" aþýlanmýþ mý sorusunun cevabý "+insan.asiDurumu);
        System.out.println(insan.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan.bulastirirMi);
        System.out.println(insan.ad+" hastalanýr mý sorusunun cevabý "+insan.hastalanirMi);

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        Birey insan1=new Normal_Insan("Muhammet Ali","Kaya");
        System.out.println(insan1.ad+" aþýlanmýþ mý sorusunun cevabý "+insan1.asiDurumu);
        System.out.println(insan1.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan1.bulastirirMi);
        System.out.println(insan1.ad+" hastalanýr mý sorusunun cevabý "+insan1.hastalanirMi);
        System.out.println();
        doktor.asilamaYap(insan1);
        System.out.println();
        System.out.println(insan1.ad+" aþýlanmýþ mý sorusunun cevabý "+insan1.asiDurumu);
        System.out.println(insan1.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan1.bulastirirMi);
        System.out.println(insan1.ad+" hastalanýr mý sorusunun cevabý "+insan1.hastalanirMi);

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        Birey insan2=new Normal_Insan("Mustafa","Öztürk");
        System.out.println(insan2.ad+" aþýlanmýþ mý sorusunun cevabý "+insan2.asiDurumu);
        System.out.println(insan2.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan2.bulastirirMi);
        System.out.println(insan2.ad+" hastalanýr mý sorusunun cevabý "+insan2.hastalanirMi);
        System.out.println();
        doktor.asilamaYap(insan2);
        System.out.println();
        System.out.println(insan2.ad+" aþýlanmýþ mý sorusunun cevabý "+insan2.asiDurumu);
        System.out.println(insan2.ad+" hastalýðý bulaþtýrýr mý sorusunun cevabý "+insan2.bulastirirMi);
        System.out.println(insan2.ad+" hastalanýr mý sorusunun cevabý "+insan2.hastalanirMi);

        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println();

        doktor.asilananlariListele();





    }
}
