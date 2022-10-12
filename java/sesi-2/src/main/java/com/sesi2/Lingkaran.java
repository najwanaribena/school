package com.sesi2;

public class Lingkaran {
  private double jari; 
  private double luas; 

  public double getJari() {
    return jari;
  }

  public void setJari(double jari) {
    this.jari = jari;
  }

  public double hitungLuas() {
    luas = 3.14 * (jari * jari);
    return luas;
  }
}
