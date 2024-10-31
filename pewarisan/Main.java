package pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("toyota", "avanza", 2022, 4, "Bensin");
        Motor motorku = new Motor("Honda", "CBR250RR", 2023, 250,"Manual");

        mobilku.infoKendaraan();
        mobilku.infoMobil();

        motorku.infoKendaraan();
        motorku.infoMotor();
    }
}