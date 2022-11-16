package com.tesobjek;

public class Makanan {
  public String nama;
  public float harga;
  private float diskon;

  Makanan(String nama, float harga, float diskon) {
    this.nama = nama;
    this.harga = harga;
    this.diskon = diskon;
  }

  public float hargaDiskon() {
    float persen = 100;
    return harga - (harga * (diskon / persen));
  }
}
