package sesi6;

class DemoSwitch1 {
  public static void main(String[] args) {
    int noHari = 4;
    switch(noHari) {
      case 1:
        System.out.println("Hari ke-" + noHari + " adalah Minggu");
        break;
      case 2:
        System.out.println("Hari ke-" + noHari + " adalah Senin");
        break;
      case 3:
        System.out.println("Hari ke-" + noHari + " adalah Selasa");
        break;
      case 4:
        System.out.println("Hari ke-" + noHari + " adalah Rabu");
        break;
      case 5:
        System.out.println("Hari ke-" + noHari + " adalah Kamis");
        break;
      case 6:
        System.out.println("Hari ke-" + noHari + " adalah Jum'at");
        break;
      case 7:
        System.out.println("Hari ke-" + noHari + " adalah Sabtu");
        break;
      default:
        System.out.println("Tidak ada hari ke-" + noHari);
    }
  }
}
