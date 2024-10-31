import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlahLulus = 0;
        double jumlahTLulus = 0;
        double totalLulus = 0;
        double totalTLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahmahasiswa = input.nextInt();
        int [] nilaiMhs= new int[jumlahmahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            }else {
                totalTLulus += nilaiMhs[i];
                jumlahTLulus++;
            }
        }
        double rataLulus = totalLulus/jumlahLulus;
        double rataTLulus = totalTLulus/jumlahTLulus;

        System.out.println("Rata-rata nilai yang lulus = "+rataLulus);
        System.out.println("Rata-rata nilai yang tidak lulus = "+rataTLulus);
    }
}
