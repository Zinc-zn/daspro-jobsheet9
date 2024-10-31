import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;
        int hasil=0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = input.nextInt();
        int [] arrNilai = new int[jumlah];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = input.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if(key==arrNilai[i]){
                hasil=i;
                System.out.println("\nNilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+ (hasil+1));
                break;
            }else {
                System.out.println("\nNilai yang dicari tidak ditemukan");
                break;
            }
        }
    }
}
