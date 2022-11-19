
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi;
        int Volume;
        System.out.println("Menghitung Volume Kubus by helmykediri.com");
        System.out.println("Masukkan sisi");
        sisi = input.nextInt();
        Volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + Volume);
    }
}
