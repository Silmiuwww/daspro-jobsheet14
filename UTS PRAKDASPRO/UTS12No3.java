import java. util. Scanner;

public class UTS12No3 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa yang mengikuti seleksi: ");
        int jumlahSiswa = input12.nextInt();
        input12.nextLine();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Calon Mahasiswa ke- " + i);

        System.out.print("Masukkan jurusan asal (IPA/IPS/Bahasa): ");
        String jurusan = input12.next().toUpperCase();

        System.out.print("Masukkan nilai Matematika: ");
        double nilaiMat = input12.nextDouble();
        System.out.print("Masukkan nilai Fisika: ");
        double nilaiFisika = input12.nextDouble();
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        double nilaiBing = input12.nextDouble();
        System.out.print("Masukkan nilai Bahasa Indonesia: ");
        double nilaiBind = input12.nextDouble();

        double rataRata = (nilaiMat + nilaiFisika + nilaiBing + nilaiBind) / 4;

        if ((jurusan.equals("IPA") || jurusan.equals("IPS")) && nilaiMat >= 80 && rataRata >= 80) {
            System.out.println("Diterima di program studi D4 TI.");
        } else if ((jurusan.equals("IPA") && nilaiMat >= 70 && nilaiFisika >= 70) || 
                   (jurusan.equals("Bahasa") && rataRata > 80 && nilaiMat >= 70 && nilaiBing >= 70 && nilaiBind >= 70)) {
            System.out.println("Diterima di program studi D4 SIB.");
        } else {
            System.out.println("Anda tidak lolos seleksi.");
        }

    }
  }
}