
package ucak;
import java.util.Scanner;

public class Ucak {

    
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int ucak_turu;
double yuk;
int hava_fuzesi_sayisi;
int kara_fuzesi_sayisi;
System.out.println("Hos Geldiniz Lutfen Ucak turunuzu seciniz");
System.out.println("Siha icin 1 *** Iha icin 2");
ucak_turu=input.nextInt();
if(ucak_turu==1) {
yuk=0;
System.out.println("Hava fuzesi sayisini giriniz");
hava_fuzesi_sayisi=input.nextInt();
System.out.println("Kara fuzesi sayisini giriniz");
kara_fuzesi_sayisi=input.nextInt();
UAV cagir=new
UAV(hava_fuzesi_sayisi,kara_fuzesi_sayisi,ucak_turu,yuk);
cagir.tur_kontrol();
cagir.hedef();
}
else {
hava_fuzesi_sayisi=0;
kara_fuzesi_sayisi=0;
System.out.println("Lutfen ihaya yuklenecek yuk miktarini giriniz");
yuk=input.nextDouble();
UAV cagir=new
UAV(hava_fuzesi_sayisi,kara_fuzesi_sayisi,ucak_turu,yuk);
cagir.tur_kontrol();
cagir.varis();
}
input.close();
}

    
}
