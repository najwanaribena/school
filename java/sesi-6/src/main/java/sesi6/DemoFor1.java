package sesi6;

class DemoFor1 {
  public static void main(String[] args) {
    int n = 11;
    int hasil = 0;
    for (int i = 1; i <= n; i++) {
      hasil += i;
      if (i != n) {
        System.out.print(i + " + ");
      } else {
        System.out.print("= ");
      }
    }
    System.out.println(hasil);
  }
}
