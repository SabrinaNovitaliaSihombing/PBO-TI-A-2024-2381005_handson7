package contohkelaspertama;

public class Main {
    public static void main(String[] args) {
        Mobil mobilAvanza = new Mobil("pink", "toyota",180);
        mobilAvanza.tampilkanInfo();
        mobilAvanza.berhenti();
        mobilAvanza.berjalan();
    }
}