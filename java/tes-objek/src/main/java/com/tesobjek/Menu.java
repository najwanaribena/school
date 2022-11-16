package com.tesobjek;

import java.util.ArrayList;

public class Menu {
  private ArrayList<Makanan> listMakanan;
  
  Menu() {
    listMakanan = new ArrayList<Makanan>(); 
    listMakanan.add(new Makanan("Bala-bala", 5000, 5));
    listMakanan.add(new Makanan("Gehu     ", 10000, 10));
    listMakanan.add(new Makanan("Seblak   ", 15000, 15));
  }

  public void tampilkan() {
    System.out.println("***************************************");
    System.out.println("-------------Menu Makanan--------------");
    System.out.println("***************************************");
    for (int i = 0; i < listMakanan.size(); i++) {
      Makanan makanan = listMakanan.get(i);
      System.out.println((i + 1) + ". " + makanan.nama + "\t\tRp " + makanan.harga);
    }
    System.out.println("***************************************");
  }

  public Makanan get(int index) {
    return listMakanan.get(index);
  }

  public int jumlah() {
    return listMakanan.size();
  }
}
