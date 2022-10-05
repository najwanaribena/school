package com.sesi1;
import java.util.Scanner;

public class PersegiPanjangTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.print("Masukkan Panjang: ");
    double panjang = input.nextDouble();

    System.out.print("Masukkan Lebar: ");
    double lebar = input.nextDouble();

    PersegiPanjang meja = new PersegiPanjang();
    meja.setPanjang(panjang);
    meja.setLebar(lebar);

    System.out.println();
    System.out.println("Panjang : " + meja.getPanjang());
    System.out.println("Lebar  : " + meja.getLebar());
    System.out.println("Luas   : " + meja.hitungLuas());

    input.close();
  }
}
