import java.util.Scanner;
public class KPRNasabah{
    public static void main(String[] args) {
        
        //Membuat Scanner untuk inputan dari user
        Scanner scanner = new Scanner(System.in);

        //Input besaran uang pinjaman dari nasabah
        System.out.print("Masukan besaran pinjaman KPR (dalam Rupiah): ");
        double uangPinjaman = scanner.nextDouble();

        //Input jangka waktu pinjaman dalam tahun
        System.out.print("Masukan jangka waktu peminjaman (dalam tahun): ");
        int waktuPinjaman = scanner.nextInt();

        double BungaPerTahun = uangPinjaman * 0.12;
        double TotalBunga = BungaPerTahun * waktuPinjaman;
        double TotalPinjaman = uangPinjaman + TotalBunga;
        double CicilanPerBulan = TotalPinjaman / (waktuPinjaman * 12);


        //Output
        System.out.print("Hasil bunga per tahun" + BungaPerTahun);
        System.out.print("Hasil total bunga (bunga per tahun * N)" + TotalBunga);
        System.out.print("Hasil total pinjaman (P * total bunga)" + TotalPinjaman);
        System.out.print("Hasil cicilan bulanan (total pinjaman / N)" + CicilanPerBulan);

    }
    
}