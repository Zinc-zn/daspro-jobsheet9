import java.util.Scanner;

public class Tugas3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                        "Kentang Goreng", "Teh Tarik", "Cappucino", 
                        "Chocolate Ice"};
        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        
        System.out.print("\nMasukkan nama menu yang dicari: ");
        String cariMenu = input.nextLine();
        
        boolean menuDitemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                System.out.println("Menu " + cariMenu + " TERSEDIA");
                menuDitemukan = true;
                break;
            }
        }
        
        if (!menuDitemukan) {
            System.out.println("Menu " + cariMenu + " TIDAK TERSEDIA");
        }
    }
}