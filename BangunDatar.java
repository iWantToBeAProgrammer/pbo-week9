package week9;

public class BangunDatar {
    private int sisi;
    private int s1, s2, s3;
    private double alas, tinggi;
    private int panjang;
    private int lebar;
    private double diameter;
    public static double pi = 3.14;

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public BangunDatar(double diameter) {
        this.diameter = diameter;
    }

    public BangunDatar(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // public int luas(int alas, int tinggi) {

    // }
    public double luas(double alas, double tinggi) {
        return alas * tinggi / 2;
    }

    public int keliling(int s1, int s2, int s3) {
        return s1 * s2 * s3;
    }

    public static double getPi() {
        return pi;
    }

    public int getSisi() {
        return sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getDiameter() {
        return diameter;
    }

    public int luas(int s) {
        return s*s;
    }

    public int luas(int p, int l) {
        return p*l;
    }

    public double luas(double d) {
        double r = d / 2;
        return pi * r * r;
    }

    public int keliling(int s) {
        return s*4;
    }

    public int keliling(int p, int l) {
        return (p + l) * 2;
    }

    public double keliling(double d) {
        return pi * d;
    }
}