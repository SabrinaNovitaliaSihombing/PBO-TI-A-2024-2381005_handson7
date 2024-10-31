package abstraksi;

abstract class Kendaraan {
    String warna;

    public Kendaraan(String warna) {
        this.warna = warna;
    }

    abstract void  bergerak();

    void info(){
        System.out.println("Warna kendaraan : "+ warna);
    }
}