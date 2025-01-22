/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucak;

/**
 *
 * @author Eren
 */
public class Fuze {
    private int hava_fuzesi_sayisi;
private int kara_fuzesi_sayisi;
private double iha_yuku;
final float kara_fuzesi=500;
final float hava_fuzesi=200;
public Fuze (int hava_fuzesi_sayisi,int kara_fuzesi_sayisi,double yuk)
{
this.hava_fuzesi_sayisi=hava_fuzesi_sayisi;
this.kara_fuzesi_sayisi=kara_fuzesi_sayisi;
this.iha_yuku=yuk;
}
public int getHava_fuzesi_sayisi() {
return hava_fuzesi_sayisi;
}
public void setHava_fuzesi_sayisi(int hava_fuzesi_sayisi) {
this.hava_fuzesi_sayisi = hava_fuzesi_sayisi;
}
public int getKara_fuzesi_sayisi() {
return kara_fuzesi_sayisi;
}
public void setKara_fuzesi_sayisi(int kara_fuzesi_sayisi) {
this.kara_fuzesi_sayisi = kara_fuzesi_sayisi;
}
public float getKara_fuzesi() {
return kara_fuzesi;
}
public float getHava_fuzesi() {
return hava_fuzesi;
}
public double getIha_yuku() {
return iha_yuku;
}
public void setIha_yuku(double iha_yuku) {
this.iha_yuku = iha_yuku;
}
    
}
