package com.sesi2;
import java.util.Scanner;

public class LingkaranTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.print("Masukkan Jari-jari: ");
    double jari = input.nextDouble();

    Lingkaran koin = new Lingkaran();
    koin.setJari(jari);

    System.out.println();
    System.out.println("Jari-jari   : " + koin.getJari());
    System.out.println("Luas        : " + koin.hitungLuas());

    input.close();
  }
}
