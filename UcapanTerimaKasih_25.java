import java.util.Scanner;

public class UcapanTerimaKasih_25 {

     public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thankyou "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anyting.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
    
}
