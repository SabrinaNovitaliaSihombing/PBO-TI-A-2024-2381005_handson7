package abstraksi;

public class Main {
    public static void main(String[] args) {
        Perahu perahuMerah = new Perahu("Merah");
        Mobil mobilMerah = new Mobil("Merah");
        perahuMerah.bergerak();
        perahuMerah.info();

        mobilMerah.bergerak();
        mobilMerah.info();
    }
}