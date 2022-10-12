package com.sesi2;

class Tabung {
  double jari;
  double tinggi;
  
  void isiData(double j, double t) {
    jari = j;
    tinggi = t;
  }

  double hitungVolume() {
    return (3.14 * (jari * jari) * tinggi);
  }
}

class DemoTabung3 {
  public static void main(String[] args) {
    Tabung t;
    t = new Tabung();
    t.isiData(7, 5);
    System.out.println("Volume Tabung = " + t.hitungVolume());
  }
}
