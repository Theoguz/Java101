import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        System.out.println("Lütfen 3 adet sayı giriniz");
        Scanner input = new Scanner(System.in);
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        sayi3 = input.nextInt();

        if (sayi1> sayi2 && sayi1> sayi3){
            if (sayi2 >sayi3){
                System.out.printf("%d > %d > %d", sayi1, sayi2, sayi3);
            }
            else{
                System.out.printf("%d > %d > %d", sayi1, sayi3, sayi2);
            }

        }
        else if (sayi2> sayi3 && sayi2>sayi1){
            if (sayi1 >sayi3){
                System.out.printf("%d > %d > %d", sayi2, sayi1, sayi3);
            }
            else{
                System.out.printf("%d > %d > %d", sayi2, sayi3, sayi1);
            }
        }
        else if (sayi3> sayi2 && sayi3>sayi1){
            if (sayi2 >sayi1){
                System.out.printf("%d > %d > %d", sayi3, sayi2, sayi1);
            }
            else{
                System.out.printf("%d > %d > %d", sayi3, sayi1, sayi2);
            }
        }
    }
}