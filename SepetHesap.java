/*
 * Ad Soyad: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 11.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesabı {

    // --- Sabit Tanımlar ---
    public static final double KDV_ORANI = 0.18;        // %18 KDV
    public static final double KARGO_UCRETI = 29.99;    // TL

    // --- 1. Ürün satış toplamı (fiyat × adet) ---
    public static double urunSatisToplami(double fiyat, int adet) {
        return fiyat * adet;
    }

    // --- 2. Ara toplam (3 ürünün toplamı) ---
    public static double araToplam(double toplam1, double toplam2, double toplam3) {
        return toplam1 + toplam2 + toplam3;
    }

    // --- 3. İndirim tutarı (ara toplam × indirim yüzdesi / 100) ---
    public static double indirimTutari(double araToplam, double indirimYuzdesi) {
        return araToplam * (indirimYuzdesi / 100);
    }

    // --- 4. İndirimli toplam (ara toplam - indirim tutarı) ---
    public static double indirimliToplam(double araToplam, double indirimTutari) {
        return araToplam - indirimTutari;
    }

    // --- 5. KDV tutarı (indirimli toplam × KDV oranı) ---
    public static double kdvTutari(double indirimliToplam) {
        return indirimliToplam * KDV_ORANI;
    }

    // --- 6. Genel toplam (indirimli toplam + KDV + kargo) ---
    public static double genelToplam(double indirimliToplam, double kdvTutari) {
        return indirimliToplam + kdvTutari + KARGO_UCRETI;
    }

    // --- Test için main metodu ---
    public static void main(String[] args) {

        System.out.println("=== Görev 3: Sepet Toplamı Hesaplayıcı ===");

        // 3 ürün için fiyat ve adet bilgileri
        double fiyat1 = 120.0; int adet1 = 2;
        double fiyat2 = 80.0;  int adet2 = 1;
        double fiyat3 = 50.0;  int adet3 = 3;

        double toplam1 = urunSatisToplami(fiyat1, adet1);
        double toplam2 = urunSatisToplami(fiyat2, adet2);
        double toplam3 = urunSatisToplami(fiyat3, adet3);

        double araToplam = araToplam(toplam1, toplam2, toplam3);
        double indirimYuzdesi = 10.0; // %10 indirim
        double indirim = indirimTutari(araToplam, indirimYuzdesi);
        double indirimli = indirimliToplam(araToplam, indirim);
        double kdv = kdvTutari(indirimli);
        double genel = genelToplam(indirimli, kdv);

        // Sonuçları yazdır
        System.out.printf("Ürün 1 Satış Toplamı: %.2f TL%n", toplam1);
        System.out.printf("Ürün 2 Satış Toplamı: %.2f TL%n", toplam2);
        System.out.printf("Ürün 3 Satış Toplamı: %.2f TL%n", toplam3);
        System.out.printf("Ara Toplam: %.2f TL%n", araToplam);
        System.out.printf("İndirim Tutarı (%%%s): %.2f TL%n", indirimYuzdesi, indirim);
        System.out.printf("İndirimli Toplam: %.2f TL%n", indirimli);
        System.out.printf("KDV (%%18): %.2f TL%n", kdv);
        System.out.printf("Kargo Ücreti: %.2f TL%n", KARGO_UCRETI);
        System.out.printf("Genel Toplam: %.2f TL%n", genel);
    }
}
