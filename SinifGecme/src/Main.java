import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;


        int average;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        average = (mat + fizik + kimya + turkce + muzik) / 5;
        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not girdiniz.");
        } else {
            if (average >= 55) {
                System.out.println("Sınıfı geçtiniz.");
            } else {
                System.out.println("Sınıfta kaldınız.");
            }
        }


    }
}