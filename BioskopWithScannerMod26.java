import java.util.Scanner;
public class BioskopWithScannerMod26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        boolean selesai = false;

        String[][] penonton = new String[4][2];
        
        while (!selesai) {
            while (true) {
                System.out.println("Masukkan nama: ");
                nama = sc.nextLine();
                
                while (true) {
                    System.out.println("Masukkan baris: ");
                    baris = sc.nextInt();
                    if (baris >= 1 && baris <= 4) {
                        break;
                    } else {
                        System.out.println("Baris tidak valid! Masukkan nomor 1 - 4");
                    }
                }
                
                while (true) {
                    System.out.println("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (kolom >= 1 && kolom <= 2) {
                        break;
                    } else {
                        System.out.println("Kolom tidak valid! Masukkan nomor 1 - 2");
                    }
                }
                
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    sc.nextLine(); 
                } else {
                    System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1]);
                    System.out.println("Silakan pilih kursi lain.");
                    sc.nextLine(); 
                    continue; 
                }

                System.out.println("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }

            System.out.println("Daftar Penonton:");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                    } else {
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                    }
                }
            }

            System.out.println("\nTekan 'y' untuk keluar atau tekan 'n' untuk kembali ke menu:");
            String penyelesai = sc.nextLine();

            if (penyelesai.equalsIgnoreCase("y")) {
                System.out.println("Terima kasih!");
                selesai = true;
            }
        }
        
        sc.close();
    }
}
