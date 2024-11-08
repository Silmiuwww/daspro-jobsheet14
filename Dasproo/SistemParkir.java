import java.util.Scanner;
public class SistemParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan;
        int biaya = 0;

        System.out.println("Masukkan jenis kendaraan (mobil/motor) :");
        System.out.println("1 = mobil" + "2 = motor");
        jenisKendaraan = scanner.nextInt();

        if (jenisKendaraan == 1) {
            biaya = 5000; 
            System.out.println("Jenis kendaraan: Mobil");
            System.out.println("Total biaya parkir selama satu jam: Rp " + biaya);
        } else if (jenisKendaraan == 2) {
            biaya = 3000; 
            System.out.println("Jenis kendaraan: Motor");
            System.out.println("Total biaya parkir selama satu jam: Rp " + biaya);
        } else {
            System.out.println("Silakan masukkan 'mobil' atau 'motor'.");
        }

        
    }
}
