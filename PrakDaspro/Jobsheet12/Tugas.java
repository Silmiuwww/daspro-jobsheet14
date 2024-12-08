import java.util.Scanner;
public class Tugas {
    public static int hitungIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }
}

