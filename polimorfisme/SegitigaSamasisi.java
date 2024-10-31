package polimorfisme;

import java.security.PublicKey;

public class SegitigaSamasisi extends BangunDatar {
    private double sisi;
    private double tinggi;

    public SegitigaSamasisi (final double sisi, final double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas () {
        return sisi * tinggi * 0.5;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}
