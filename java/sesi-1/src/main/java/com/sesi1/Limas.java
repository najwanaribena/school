package com.sesi1;

public class Limas {
  private double alas; 
  private double tinggi; 
  private double luasAlas; 
  private double volume; 

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  public double getAlas() {
    return alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public double hitungLuasAlas() {
    luasAlas = alas * alas;
    return luasAlas;
  }

  public double hitungVolume() {
    volume = hitungLuasAlas() * tinggi / 3;
    return volume;
  }
}
