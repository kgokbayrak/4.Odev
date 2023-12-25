package org.example;

public class PersonelListesi {
    public static void main(String[] args) {

        ClassPersonel personel1 = new ClassPersonel();
        ClassPersonel personel2 = new ClassPersonel();
        ClassPersonel personel3 = new ClassPersonel();
        ClassPersonel personel4 = new ClassPersonel();

        personel1.ad = "Kubra";
        personel1.soyad = "Gokbayrak";
        personel1.departman = "Test";
        personel1.egitimDurumu = "Lisans";

        personel2.ad = "Nursena";
        personel2.soyad = "Özçelik";
        personel2.departman = "UI/UX";
        personel2.egitimDurumu = "Lisans";

        personel3.ad = "Dilara";
        personel3.soyad = "Bilmez";
        personel3.departman = "Muhasebe";
        personel3.egitimDurumu = "Yüksek Lisans";

        personel4.ad = "Yılmaz";
        personel4.soyad = "Kaçar";
        personel4.departman = "Yönetim Kurulu";
        personel4.egitimDurumu = "Doktora";

        personel1.getUser();
        personel2.getUser();
        personel3.getUser();
        personel4.getUser();

    }
}
