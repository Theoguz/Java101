import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        String password;
        String cevap;
        String newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adi : ");
        username = input.nextLine();
        System.out.print("Sifre : ");
        password = input.nextLine();

        if (username.equals("oguz") && password.equals("aslan")) {

            System.out.println("Giriş Başarılı");

        } else {
            System.out.println("Başarız şifrenizi sıfırlamak istermisiniz ? yes/no");
            cevap = input.nextLine();
            if (cevap.equals("yes")) {
                System.out.println("Yeni şifre giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("aslan")) {
                    System.out.println("Eski oluşturduğunuz şifreyi girdiniz yeni şifre giriniz");

                } else {
                    password.equals(newPassword);
                    System.out.println("şifre başarıyla oluşturuldu");
                    System.out.println("New Password : " + password);

                }

            } else if (cevap.equals("no")) {
                System.out.printf("Exit");
            }
        }
    }

}

