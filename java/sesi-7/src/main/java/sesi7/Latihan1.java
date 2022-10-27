package sesi7;

public class Latihan1 {
  public static void main(String[] args) {
    String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"}; 

    int i = 0;
    while (i < hari.length) {
      System.out.print(hari[i] + " ");
      i++;
    }

    System.out.println(); // newline

    i = 0;
    do {
      System.out.print(hari[i] + " ");
      i++;
    } while (i < hari.length);


    System.out.println(); // newline

    for (i = 0; i < hari.length; i++) {
      System.out.print(hari[i] + " ");
    }

  }
}
