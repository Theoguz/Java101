import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        System.out.println("Lütfen Sıcaklık Değerini Giriniz");
        Scanner input = new Scanner(System.in);
        sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.printf("Kayak Yap");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.printf("Sinemaya git");

        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.printf("Piknik yap");

        } else if (sicaklik > 25) {
            System.out.printf("Yüzmee!!");
        }
    }
}