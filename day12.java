
package operatorr;
import java.util.Scanner;

public class day12 {

    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("MENGHITUNG NILAI RATA-RATA");
        int i, n;
        float jum, x, rata;
        System.out.print("Banyaknya Data: ");
        n = masuk.nextInt();
        jum = 0;
        i = 1;
        while (i <= n) {
            System.out.print("Data ke-" + i + ": ");
            x = masuk.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Rata-rata: " + rata);
        System.out.println("Jumlah: " + jum);
    }
}
