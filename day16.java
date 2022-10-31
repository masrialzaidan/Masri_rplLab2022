package operatorr;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka Anda : ");
        int angka = input.nextInt();
        
        if (angka % 2 ==0)
            System.out.println("Angka : " + angka + " adalah bilangan genap");
       else
            System.out.println("angka : " + angka + " adalah bilangan ganjil");
    }
}
