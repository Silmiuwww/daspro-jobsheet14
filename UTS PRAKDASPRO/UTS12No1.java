import java. util. Scanner; 
public class UTS12No1 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        double nilaiMat, nilaiFisika, nilaiBing, nilaiBindo, rataRata;
        
        System.out.println("Masukan nilai matematika :");
        nilaiMat = input12.nextDouble();
        System.out.println("Masukan nilai fisika :");
        nilaiFisika = input12.nextDouble();
        System.out.println("Masukan nilai Bahasa Inggris :");
        nilaiBing = input12.nextDouble();
        System.out.println("Masukan nilai Bahasa Indonesia :");
        nilaiBindo = input12.nextDouble();

        rataRata = (nilaiMat + nilaiFisika + nilaiBing + nilaiBindo) / 4;
        System.out.println("Rata-rata nilai calon mahasiswa: " + rataRata);


    }
}