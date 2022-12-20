import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int acilisFiyati=10;
        double kmFiyati=2.20;
        int km;
        System.out.println("Gidilen km yi giriniz");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double toplamfiyat= acilisFiyati + (km * kmFiyati);

        if (toplamfiyat < 20) {
            toplamfiyat = 20;
        }
        System.out.println("Toplam Tutar: " + toplamfiyat);
    }
}