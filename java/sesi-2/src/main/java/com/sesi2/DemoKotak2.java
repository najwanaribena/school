package com.sesi2;

class DemoKotak2 {
  public static void main(String[] args) {
    double volume1, volume2; 
    Kotak k1 = new Kotak();
    Kotak k2 = new Kotak();

    k1.panjang = 4;
    k1.lebar = 3;
    k1.tinggi = 2;

    k2.panjang = 6;
    k2.lebar = 5;
    k2.tinggi = 4;

    volume1 = k1.panjang * k1.lebar * k1.tinggi;
    volume2 = k2.panjang * k2.lebar * k2.tinggi;

    System.out.println("Volume k1 = " + volume1);
    System.out.println("Volume k2 = " + volume2);
  }
}
