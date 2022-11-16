package com.tesobjek;

import java.util.ArrayList;

public class Penjualan {

  private class Pembelian {
    public Makanan makanan;
    public int jumlah;

    Pembelian(Makanan makanan, int jumlah) {
      this.makanan = makanan;
      this.jumlah = jumlah;
    }
  }

  private float nominalPembayaran, totalSemua;
  private Menu menu;
  private Pelanggan pelanggan;
  private ArrayList<Pembelian> listPembelian;

  Penjualan(Pelanggan pelanggan, Menu menu) {
    this.pelanggan = pelanggan;
    this.menu = menu;
    this.listPembelian = new ArrayList<Penjualan.Pembelian>();
  }
  
  public void tambahItem(int menuNo, int jumlah) {
    if (menuNo < 1 || menuNo > this.menu.jumlah()) {
      System.out.println("Menu tidak ada di menu");
    } else {
      listPembelian.add(new Pembelian(menu.get(menuNo - 1), jumlah));
    }
  }

  public void bayar(float nominalPembayaran) {
    this.nominalPembayaran = nominalPembayaran;
  }

  public void strukList() {
    System.out.println("-----------------STRUK-----------------"); 
    System.out.println("---------------------------------------"); 
    for (int i = 0; i < listPembelian.size(); i++) {
      Pembelian pembelian = listPembelian.get(i);
      System.out.println(pembelian.makanan.nama + "\t" + pembelian.jumlah + "\t Rp " + totalPembelian(pembelian));
    }
    System.out.println("Total harga        : Rp " + totalSemua);
  }

  public void strukPembayaran() {
    System.out.println("Kembalian          : Rp " + (nominalPembayaran - totalSemua));
    System.out.println("---------------Terima Kasih------------"); 
  }

  private float totalPembelian(Pembelian pembelian) {
    float totalPembelianSekarang, jumlahPembelian = pembelian.jumlah;

    if (pelanggan.member) {
      totalPembelianSekarang = pembelian.makanan.hargaDiskon() * jumlahPembelian;
    } else {
      totalPembelianSekarang = pembelian.makanan.harga * jumlahPembelian;
    }

    totalSemua += totalPembelianSekarang;
    return totalPembelianSekarang;
  }
}
