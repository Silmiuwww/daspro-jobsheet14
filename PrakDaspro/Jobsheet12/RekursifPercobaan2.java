import java.util.Scanner;
public class RekursifPercobaan2 {
    static int hitungPangkat(int x, int y, String deret) {
        if (y == 0) {
            System.out.print(deret + "1");
            return 1;
        } else {
            System.out.print(deret + x + "x");
            return x * hitungPangkat(x, y - 1, deret);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.print("Deret perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat, "");
        System.out.println(" = " + hasil);
        
    }
}

  