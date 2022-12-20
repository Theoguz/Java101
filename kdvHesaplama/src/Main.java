import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double kdvOrani = 0.18;
    double fiyat;
    Scanner input = new Scanner(System.in);
    System.out.print("Fiyatı giriniz: ");
    fiyat = input.nextDouble();
    double kdvliFiyat= fiyat +(fiyat * kdvOrani);
    System.out.println("KDV'siz Fiyat: " + fiyat);
    System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    System.out.println("KDV tutarı: " + (kdvliFiyat - fiyat));

    }
}