import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOrani;
        double fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        fiyat = input.nextDouble();
        if (fiyat >=0 && fiyat <= 1000){
            kdvOrani = 0.18;
        } else {
                kdvOrani = 0.08;

            }

        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;
        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);


    }
}
