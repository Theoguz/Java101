import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("c kenarını giriniz: ");
        c = input.nextInt();
        int u = (a + b + c) / 2;
        int alan = (u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + Math.sqrt(alan));



    }
}