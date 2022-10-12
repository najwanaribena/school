package com.sesi2;

class Tabung {
  double jari, tinggi;
}

class DemoTabung1 {
  public static void main(String[] args) {
    double volume;
    Tabung t = new Tabung();

    t.jari = 3.5;
    t.tinggi = 14;
    volume = 3.14 * (t.jari * t.jari) * t.tinggi;
    System.out.println("Volume Tabung = " + volume);
  }
}
