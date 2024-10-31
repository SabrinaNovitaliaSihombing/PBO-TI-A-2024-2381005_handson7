package pewarisan;

public class Motor extends Kendaraan{
    private int kapasistasMesin;
    private String jenisTransmisi;

    public Motor(String merek, String model, int tahunProduksi, int kapasistasMesin, String jenisTransmisi) {
        super(merek, model, tahunProduksi);
        this.kapasistasMesin = kapasistasMesin;
        this.jenisTransmisi = jenisTransmisi;
    }

    void infoMotor(){
        super.infoKendaraan();
        System.out.println("Kapasitas Mesin : " + kapasistasMesin);
        System.out.println("Jenis Transmisi : " + jenisTransmisi);

    }
}