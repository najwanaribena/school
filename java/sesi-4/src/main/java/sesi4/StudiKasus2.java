package sesi4;

import java.util.Scanner;

class StudiKasus2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan dalam satuan kilometer: ");

    double km = input.nextDouble();
    double m = km * 1000;

    System.out.println(m + " m");

    input.close();
  }
}
