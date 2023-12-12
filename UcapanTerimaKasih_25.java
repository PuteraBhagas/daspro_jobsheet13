import java.util.Scanner;

public class UcapanTerimaKasih_25 {

     public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String ucapantambah =  UcapanTambahan();
        System.out.println("Thankyou "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anyting.");
        System.out.println("Ucapan tambahan untuk " + nama + " adalah " +ucapantambah);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
    
    public static String UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang ingin di  berikan");
        String ucaptambahan = sc.nextLine();
        sc.close();
        return ucaptambahan;
    }
}
