
package ucak;

import java.util.Scanner;
import java.util.Random;

public class UAV extends Fuze {
     private int tur;
 private int hedef;
 private double toplam_agirlik;
 private int mesafe;
 private int ates;
 final double siha_agirligi=3000;
 final double iha_agirligi=2000;
 final float iha_max_kalkis_agirligi = 5500;
 final float siha_max_kalkis_agirligi = 7000;
 char sonuc;

 Scanner scan =new Scanner(System.in);


 public UAV(int hava_fuzesi_sayisi,int kara_fuzesi_sayisi,int tur,double iha_yuku) {
 super(hava_fuzesi_sayisi,kara_fuzesi_sayisi,iha_yuku);
 this.tur = tur;
 }



 public void tur_kontrol() {
 if (tur==1) {
 System.out.println("Siha seçimini yaptınız");
 System.out.println("Siha'nın ağırlık durumu kontrol ediliyor");
 System.out.println("***************");


toplam_agirlik=(super.getHava_fuzesi_sayisi()*super.getHava_fuzesi())+(super.getKara_fuzesi_sayisi()*super.getKara_fuzesi())+iha_agirligi;

 if(toplam_agirlik>siha_max_kalkis_agirligi) {
 System.out.println("Siha'nın yuku cok fazla kalkis gerceklesemiyor");
 }
 else {
 System.out.println("Siha'nın kalkısı icin tum kosullar uygun");
 System.out.println("Siha ucmaya hazirlaniyor");
 System.out.println("*************");
 System.out.println("Siha Havalandi.");
 }

 }
 else if(tur==2){
 System.out.println("Iha'yi sectiniz");
 System.out.println("Iha'nın agırlık durumu kontrol ediliyor");
 toplam_agirlik=iha_agirligi+super.getIha_yuku();
 if(toplam_agirlik>iha_max_kalkis_agirligi) {

 System.out.println("Iha'nın yuku cok fazla kalkis gerceklesemiyor");
 }
 else {
 System.out.println("Kalkis icin tum kosullar uygun");
 System.out.println("Iha kalkisa hazirlaniyor");
 System.out.println("************");
 System.out.println("Iha havalandi.");
 System.out.println("***************");
 }

 }
 }
 public void hedef() {

 Random rand=new Random();
 hedef=rand.nextInt(2);
 System.out.println("*******************");

 if(hedef==0) { //hava füzesi
 mesafe = rand.nextInt(11) + 990;
 System.out.println("Hava hedefi belirlendi");
 while(getHava_fuzesi_sayisi()!=0) {
 System.out.println(mesafe); //silinecek
 System.out.println("Atis mesafesi giriniz");
 ates=scan.nextInt();
 System.out.println(ates);
 if(mesafe==ates) {

 System.out.println("Hedef basariyla imha edildi");
 sonuc='s';
 break;
 }
 else if(mesafe!=ates) {

 System.out.println("Hedef imha edilemedi");
 System.out.println("********************");
 super.setHava_fuzesi_sayisi(super.getHava_fuzesi_sayisi() - 1);
 mesafe = rand.nextInt(11) + 990;
 System.out.println(" Yeni mesafe:"+mesafe);
 System.out.println("Kalan hava fuzesi sayisi:"+super.getHava_fuzesi_sayisi());
 sonuc='f';
 }
 }
 }
else if(hedef==1) { //kara füzesi
 mesafe = rand.nextInt(11) + 3490;
 System.out.println("Kara hedefi belirlendi");



 while(super.getKara_fuzesi_sayisi()!=0) {

 System.out.println("Tahmini mesafe:"+3000+"m"+"-"+3490+"m");
 System.out.println(mesafe); //silinecek
 System.out.println("Atis mesafesi giriniz");
 ates=scan.nextInt();
 System.out.println(ates);

 if(mesafe==ates) {

 System.out.println("Hedef basariyla imha edildi");
 sonuc='s';

 break;
 }

 else if(mesafe!=ates) {
     if(super.getKara_fuzesi_sayisi()!=0)
 System.out.println("Hedef imha edilemedi");
 System.out.println("********************");
 mesafe = rand.nextInt(11) + 3490;
 System.out.println("Yeni mesafe:"+mesafe);
 super.setKara_fuzesi_sayisi(super.getKara_fuzesi_sayisi() - 1);
 System.out.println("Kalan kara fuzesi sayisi:"+super.getKara_fuzesi_sayisi());
 sonuc='f';
 }
 }
 }
 }


 public void varis() {
 Random random=new Random();
 String [] metinler = {

 "Malzeme destegi gerekiyor",
 "Geri donulmesi gerekiyor",
 "Saldiri gerceklesiyor",
 };

 System.out.println("||||||||||||||||||||||");
 int randomIndex=random.nextInt(metinler.length);
 System.out.println(metinler[randomIndex]);
 System.out.println("||||||||||||||||||||||");
 System.out.println("Emir geldi yapilacak islemi seciniz."+"\n"+"***********");

 System.out.println("1-Geri Donus "+"\n"+"***********");
 System.out.println("2-Malzeme destegi "+"\n"+"***********");

 System.out.println("3-Hava kosullari kotulesti."+"\n"+"***********");
 System.out.println("4-Saldiri altindayiz savunmalari aktif et"+"\n"+"***********");

 System.out.println("Yapilacak islem"+"\n"+"***********");
 int a=scan.nextInt();


 switch (a) {
     case 1:
 System.out.println("Geri donuluyor...");
 break;
 case 2:
 System.out.println("Destek ulastirildi.");
 System.out.println("Geri donuluyor.");
 break;
 case 3:
 System.out.println("Hava kosullari icin onlem alindi.");
 break;
 case 4:
 System.out.println("Hava savunma sistemleri devrede.");
 System.out.println("Siha destegi cagirildi.");
 System.out.println("***********************");
 System.out.println("Siha destege geldi.");
 super.setHava_fuzesi_sayisi(3);
 super.setKara_fuzesi_sayisi(3);
 hedef();
 if(sonuc=='f') {
 System.out.println("Gorev Basarisiz");
 }
 else {
 System.out.println("Gorev basarili");
 }

 break;


 default:
 System.out.println("Gecersiz islem!");
 break;
 }

 }
 }

 


