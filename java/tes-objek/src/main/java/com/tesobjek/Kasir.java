package com.tesobjek;

import java.util.Scanner;

public class Kasir {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Pelanggan pelanggan = new Pelanggan();
    Menu menu = new Menu();   
    Penjualan penjualan = new Penjualan(pelanggan, menu);

    menu.tampilkan();

    Character lanjut = 'y';
    while (lanjut == 'y') {
      int menuNo, jumlah;
      System.out.print("Pilih Menu Makanan : ");
      menuNo = scanner.nextInt();
      System.out.print("Jumlah Beli        : ");
      jumlah = scanner.nextInt();
      penjualan.tambahItem(menuNo, jumlah);

      System.out.print("Lanjut (y/n)       : ");
      lanjut = scanner.next().charAt(0);
      System.out.println();
    }

    System.out.print("Member? (true/false) : ");
    pelanggan.setMember(scanner.nextBoolean());

    penjualan.strukList();
    System.out.print("Masukkan Uang Anda : Rp ");
    penjualan.bayar(scanner.nextFloat());
    penjualan.strukPembayaran();

    scanner.close();

  }
}
