package com.sesi1;

public class PersegiPanjang {
  private double panjang; 
  private double lebar; 
  private double luas; 

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  public double getPanjang() {
    return panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public double hitungLuas() {
    luas = panjang * lebar;
    return luas;
  }
}
