package sesi7;

import java.util.Scanner;

public class Latihan {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int jumlahKota, jumlahJenisKendaraan;

    System.out.println("\n=========== PENGHITUNG PENGGUNA KENDARAAN =============");
    System.out.print("Input jumlah kota: ");
    jumlahKota = scanner.nextInt();

    System.out.print("Ada berapa jenis kendaraan: ");
    jumlahJenisKendaraan = scanner.nextInt();
    scanner.nextLine(); // read newline

    String[] kota = new String[jumlahKota];
    System.out.println("\n====================== KOTA ===========================");
    for (int i = 0; i < jumlahKota; i++) {
      System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
      kota[i] = scanner.nextLine();
    }

    String[] jenisKendaraan = new String[jumlahJenisKendaraan];
    System.out.println("\n================ JENIS KENDARAAN ======================");
    for (int i = 0; i < jumlahJenisKendaraan; i++) {
      System.out.print("Masukkan jenis kendaraan ke-" + (i + 1) + ": ");
      jenisKendaraan[i] = scanner.nextLine();
    }

    int[][] jumlahKendaraan = new int[jumlahKota][jumlahJenisKendaraan];
    for (int i = 0; i < jumlahKota; i++) {
      System.out.println("\n===================== " + kota[i].toUpperCase() + " ==========================");
      for (int j = 0; j < jumlahJenisKendaraan; j++) {
        System.out.print("Jumlah kendaraan " + jenisKendaraan[j] + " di Kota " + kota[i] + ": ");
        jumlahKendaraan[i][j] = scanner.nextInt();
      }
    }

    int[] totalKendaraan = new int[jumlahJenisKendaraan];
    int totalSemua = 0;
    System.out.println("\n====================== HASIL ==========================\n");
    for (int i = 0; i < jumlahKota; i++) {
      System.out.println("* Kota " + kota[i]);
      int totalKota = 0;
      for (int j = 0; j < jumlahJenisKendaraan; j++) {
        System.out.println(jenisKendaraan[j] + ": " + jumlahKendaraan[i][j]);
        totalKota += jumlahKendaraan[i][j];
        totalKendaraan[j] += jumlahKendaraan[i][j];
      }
      totalSemua += totalKota;
      System.out.println("+ Jumlah: " + totalKota);
      System.out.print("\n");
    }

    System.out.println("\n================= JUMLAH KENDARAAN =====================\n");
    for (int i = 0; i < jumlahJenisKendaraan; i++) {
      System.out.println(jenisKendaraan[i] + ": " + totalKendaraan[i]);
    }
    System.out.println("Total semua: " + totalSemua);

    scanner.close();
  }
}
