package week9;

// import week9.BangunDatar;

public class BangunRuang extends BangunDatar{
    private int tinggi;
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public BangunRuang(int sisi) {
        super(sisi);
    }

    public BangunRuang(double diameter, int tinggi) {
        super(diameter);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int volume(int p, int l, int t) {
        return p * l * t;
    }

    public int volume(int s) {
        return s * s * s;
    }

    public double volume(double d, int t) {
        double tdouble = (double)t;
        double r = d / 2;
        return super.getPi() * r * r * tdouble;
    }
}
