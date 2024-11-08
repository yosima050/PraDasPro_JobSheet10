import java.util.Scanner;
public class SIAKADMod26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input berapa jumlah Mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.println("Input berapa jumlah Matkul: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata - rata: " + totalPerSiswa/jmlMatkul);
            }

            System.out.println("\n=================================");
            System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

            for (int j = 0; j < jmlMatkul; j++) {
                double totalPerMatkul = 0;

                for (int i = 0; i < jmlMahasiswa; i++) {
                    totalPerMatkul += nilai[i][j];
                }

                System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/jmlMahasiswa);
         } sc.close();
    }
}