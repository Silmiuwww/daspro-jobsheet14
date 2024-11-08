import java.util.Scanner;
public class Jarak{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Input: kecepatan dalam km/jam
        System.out.print("Masukan kecepatan (km/jam): ");
        double kecepatanKmPerJam = scanner.nextDouble();

        // Input: waktu perjalanan dalam jam
        System.out.print("Masukan waktu perjalanan (jam): ");
        double waktuJam = scanner.nextDouble();

         // Output
         double jarak, km

        // Proses : Hitung jarak dalam kilometer
        double jarakKm = kecepatanKmPerJam * waktuJam;

        // Proses: Konverensi jarak dari kilometer ke meter
        double jarakMeter = jarakKm * 1000;

        // Tampilkan hasil
        System.out.println("Jarak dari polinema ke lokasi kerja pak Romi" + Jarak + km );

       
    }
}