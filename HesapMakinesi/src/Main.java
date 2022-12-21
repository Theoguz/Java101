import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2;
        System.out.println("Lütfen sayılari giriniz");
        Scanner input = new Scanner(System.in);
        System.out.print(" sayi1: ");
        sayi1 = input.nextInt();
        System.out.print("sayi2 : ");
        sayi2 = input.nextInt();

        int islem;
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.print("İşlem : ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplam : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Fark : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpim : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bolum : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatali secim");
        }
    }
}