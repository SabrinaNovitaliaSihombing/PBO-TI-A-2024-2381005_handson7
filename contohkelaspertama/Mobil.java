package contohkelaspertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

//    pake click kanan->generate->constructor
//    constructor adalah method yang automatis di jalankan pada saat penciptaan object

    public Mobil(String warna, String merek, int kecepatanMaks) {
        System.out.println("constructor di panggil");
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Warna : " + warna );
        System.out.println("Merek : " + merek );
        System.out.println("Kecepatan Maks : " + kecepatanMaks );
    }

    public void  berhenti(){
        System.out.println("Mobil " + merek + " berhenti");
    }

    public void  berjalan(){
        System.out.println("Mobil " + merek + " berjalan");
    }
}