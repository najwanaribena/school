package com.sesi2;

class DemoTabung2 {
  public static void main(String[] args) {
    double volume1, volume2; 
    Tabung t1 = new Tabung();
    Tabung t2 = new Tabung();

    t1.jari = 7;
    t1.tinggi = 5;

    t2.jari = 10;
    t2.tinggi = 15;

    volume1 = 3.14 * (t1.jari * t1.jari) * t1.tinggi;
    volume2 = 3.14 * (t2.jari * t2.jari) * t2.tinggi;
    
    System.out.println("Volume t1 = " + volume1);
    System.out.println("Volume t2 = " + volume2);
  }
}
