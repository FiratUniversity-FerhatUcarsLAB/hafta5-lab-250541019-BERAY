/*
 * Ad Soyad: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // --- Görev 1: Geometrik Şekil Hesaplayıcı ---

    // Kare
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Dikdörtgen
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Daire
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Üçgen
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // --- Test için main metodu ---
    public static void main(String[] args) {

        System.out.println("=== Görev 1: Geometrik Şekiller ===");

        double squareSide = 5.0;
        System.out.printf("Kare Alanı: %.2f, Çevresi: %.2f%n",
                calculateSquareArea(squareSide),
                calculateSquarePerimeter(squareSide));

        double rectW = 4.0, rectH = 6.0;
        System.out.printf("Dikdörtgen Alanı: %.2f, Çevresi: %.2f%n",
                calculateRectangleArea(rectW, rectH),
                calculateRectanglePerimeter(rectW, rectH));

        double radius = 3.0;
        System.out.printf("Daire Alanı: %.2f, Çevresi: %.2f%n",
                calculateCircleArea(radius),
                calculateCircleCircumference(radius));

        double base = 4.0, height = 3.0, a = 3.0, b = 4.0, c = 5.0;
        System.out.printf("Üçgen Alanı: %.2f, Çevresi: %.2f%n",
                calculateTriangleArea(base, height),
                calculateTrianglePerimeter(a, b, c));
    }
}
