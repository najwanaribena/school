package sesi7;

public class ContohKasus {
  public static void main(String[] args) {

    String[] bulan1d = {
      "Januari", "31",
      "Februari", "28",
      "Maret", "31",
      "April", "30",
      "Mei", "31",
      "Juni", "30",
      "Juli", "31",
      "Agustus", "31",
      "September", "30",
      "Oktober", "31",
      "November", "30",
      "Desember", "31"
    }; 

    String[][] bulan2d = {
      {"Januari", "31"},
      {"Februari", "28"},
      {"Maret", "31"},
      {"April", "30"},
      {"Mei", "31"},
      {"Juni", "30"},
      {"Juli", "31"},
      {"Agustus", "31"},
      {"September", "30"},
      {"Oktober", "31"},
      {"November", "30"},
      {"Desember", "31"}
    }; 

    for (int i = 0; i < bulan1d.length; i += 2) {
      System.out.println(bulan1d[i]);
      for (int j = 1; j <= Integer.parseInt(bulan1d[i + 1]); j++) {
        if (j < 10) {
          System.out.print("0" + j + " ");
        } else {
          System.out.print(j + " ");
        }
        if (j % 5 == 0) System.out.print("\n");
      }
      System.out.print("\n\n");
    }

    for (int i = 0; i < bulan2d.length; i++) {
      System.out.println(bulan2d[i][0]);
      for (int j = 1; j <= Integer.parseInt(bulan2d[i][1]); j++) {
        if (j < 10) {
          System.out.print("0" + j + " ");
        } else {
          System.out.print(j + " ");
        }
        if (j % 5 == 0) System.out.print("\n");
      }
      System.out.print("\n\n");
    }
  }
}
