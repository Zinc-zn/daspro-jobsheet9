import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        double rata2;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahmahasiswa = input.nextInt();
        int [] nilaiMhs= new int[jumlahmahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
            total+=nilaiMhs[i];
            if (nilaiMhs[i]>nilaiTertinggi){
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i]<nilaiTerendah){
                nilaiTerendah = nilaiMhs[i];
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke- "+(i+1)+": "+nilaiMhs[i]);
            
        }
        rata2=total/nilaiMhs.length;
        System.out.println("Nilai tertinggi : "+nilaiTertinggi);
        System.out.println("Nilai terendah : "+nilaiTerendah);
    }
}
