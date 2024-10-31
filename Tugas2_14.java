import java.util.Scanner;
public class Tugas2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total =0;
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahpesanan = input.nextInt();
        input.nextLine();
        String [] namaPesanan = new String[jumlahpesanan];
        int [] hargaPesanan = new int[jumlahpesanan];
        int [] jumlahbarang= new int[jumlahpesanan];
        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.println("Pesanan ke-"+(i+1));
            System.out.print("Nama menu :");
            namaPesanan[i] = input.nextLine();
            System.out.print("Harga menu : Rp ");
            hargaPesanan[i] = input.nextInt();
            System.out.print("Jumlah barang :");
            jumlahbarang[i] = input.nextInt();
            input.nextLine();
            double totalsmtr = hargaPesanan[i] * jumlahbarang[i];
            total+=totalsmtr;
        }
        for (int i = 0; i < jumlahpesanan; i++) {
            double totalsmtr = hargaPesanan[i] * jumlahbarang[i];
            System.out.println();
            System.out.println("Pesanan ke-"+(i+1));
            System.out.println("Nama pesanan :"+namaPesanan[i]);
            System.out.println("Jumlah pesanan :"+jumlahbarang[i]);
            System.out.println("Harga pesanan : Rp "+totalsmtr);
        }
        System.out.println("Harga yang harus dibayar : Rp "+total);
    }
}
