import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        int r ;
        System.out.println("Yarıçapı giriniz");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        double Alan = PI *r*r;
        double Cevre= 2*PI*r;
        System.out.println("Alan: " + Alan);
        System.out.println("Çevre: " + Cevre);




    }
}