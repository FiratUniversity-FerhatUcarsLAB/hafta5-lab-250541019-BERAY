/*
 * Ad-Soyadı: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 11.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormulu {

    // --- Sabit Tanımlama ---
    // Yerçekimi sabiti (m/s²)
    public static final double YERCEKIMI = 9.8;

    // --- Görev 2: Fizik Formül Asistanı ---

    // 1. Hız (v = s / t)
    public static double hizHesapla(double yol, double zaman) {
        return yol / zaman;
    }

    // 2. İvme (a = Δv / t)
    public static double ivmeHesapla(double hizDegisimi, double zaman) {
        return hizDegisimi / zaman;
    }

    // 3. Kuvvet (F = m × a)
    public static double kuvvetHesapla(double kutle, double ivme) {
        return kutle * ivme;
    }

    // 4. İş (W = F × d)
    public static double isHesapla(double kuvvet, double yol) {
        return kuvvet * yol;
    }

    // 5. Güç (P = W / t)
    public static double gucHesapla(double is, double zaman) {
        return is / zaman;
    }

    // 6. Kinetik Enerji (KE = 0.5 × m × v²)
    public static double kinetikEnerjiHesapla(double kutle, double hiz) {
        return 0.5 * kutle * Math.pow(hiz, 2);
    }

    // 7. Potansiyel Enerji (PE = m × g × h)
    public static double potansiyelEnerjiHesapla(double kutle, double yukseklik) {
        return kutle * YERCEKIMI * yukseklik;
    }

    // 8. Momentum (p = m × v)
    public static double momentumHesapla(double kutle, double hiz) {
        return kutle * hiz;
    }

    // --- Test için main metodu ---
    public static void main(String[] args) {

        System.out.println("=== Görev 2: Fizik Formül Asistanı ===");

        double yol = 100.0;          // metre
        double zaman = 5.0;          // saniye
        double hizDegisimi = 20.0;   // m/s
        double kutle = 10.0;         // kg
        double ivme = 2.0;           // m/s²
        double kuvvet = 50.0;        // Newton
        double hiz = 10.0;           // m/s
        double yukseklik = 8.0;      // metre
        double is = 500.0;           // Joule

        System.out.printf("Hız (v): %.2f m/s%n", hizHesapla(yol, zaman));
        System.out.printf("İvme (a): %.2f m/s²%n", ivmeHesapla(hizDegisimi, zaman));
        System.out.printf("Kuvvet (F): %.2f N%n", kuvvetHesapla(kutle, ivme));
        System.out.printf("İş (W): %.2f J%n", isHesapla(kuvvet, yol));
        System.out.printf("Güç (P): %.2f W%n", gucHesapla(is, zaman));
        System.out.printf("Kinetik Enerji (KE): %.2f J%n", kinetikEnerjiHesapla(kutle, hiz));
        System.out.printf("Potansiyel Enerji (PE): %.2f J%n", potansiyelEnerjiHesapla(kutle, yukseklik));
        System.out.printf("Momentum (p): %.2f kg·m/s%n", momentumHesapla(kutle, hiz));
    }
}


