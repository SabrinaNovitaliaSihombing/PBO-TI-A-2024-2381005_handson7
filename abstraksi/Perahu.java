package abstraksi;

public class Perahu extends  Kendaraan{

    public Perahu(String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("perahu bergerak di air");

    }
}