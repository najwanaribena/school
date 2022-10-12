package com.sesi2;

class Balok {
  double panjang;
  double lebar;
  double tinggi;
  
  void isiData(double p, double l, double t) {
    panjang = p;
    lebar = l;
    tinggi = t;
  }

  double hitungVolume() {
    return (panjang * lebar * tinggi);
  }
}

class DemoMethod3 {
  public static void main(String[] args) {
    Balok k;
    k = new Balok();
    k.isiData(4, 3, 2);
    System.out.println("Volume kotak = " + k.hitungVolume());
  }
}
