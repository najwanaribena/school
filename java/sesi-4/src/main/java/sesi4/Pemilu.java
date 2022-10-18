package sesi4;
import java.util.Scanner;

class Pemilu {
  public static void main(String[] args) {
    System.out.println("Program Penentuan Calon Pemilih");

    Scanner input = new Scanner(System.in);
    System.out.print("Silahkan Masukkan Umur Anda : ");
    int umur = input.nextInt();

    if (umur < 17) {
      System.out.println("Maaf Anda Tidak Berhak Mengikuti Pemilu");
    }
    else {
      System.out.println("Selamat Anda Berhak Mengikuti Pemilu");
    }

    input.close();
  }
}
