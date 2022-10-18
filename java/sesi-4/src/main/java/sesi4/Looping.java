package sesi4;
import java.util.Scanner;

class Looping {
  public static void main(String[] args) {
    System.out.println("Program Perulangan dan Penjumlahan"); 
    Scanner input = new Scanner(System.in);

    System.out.print("Berapa Kali Perulangan Akan Dilakukan : ");
    int n = input.nextInt();
    int k = 1, total = 1;

    for (int i = 1; i <= n; i++) {
      System.out.println("Ini adalah cetakan ke " + i + " , total nilai nya adalah " + total);
      k = k + 1;
      total = total + k;
    }

    input.close();
  }
}
