package com.sesi1;
import java.util.Scanner;

public class LimasTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.print("Masukkan Alas: ");
    double alas = input.nextDouble();

    System.out.print("Masukkan Tinggi: ");
    double tinggi = input.nextDouble();

    Limas piramida = new Limas();
    piramida.setAlas(alas);
    piramida.setTinggi(tinggi);

    System.out.println();
    System.out.println("Alas      : " + piramida.getAlas());
    System.out.println("Tinggi    : " + piramida.getTinggi());
    System.out.println("Luas alas : " + piramida.hitungLuasAlas());
    System.out.println("Volume    : " + piramida.hitungVolume());

    input.close();
  }
}
