package sesi7;

public class ArraySample3 {
  public static void main(String[] args) {
    int[][] twoD = new int[512][128];
    char[][][] threeD = new char[8][16][24];
    String[][] dogs = {
      {"terry", "brown"},
      {"Kristin", "white"},
      {"toby", "gray"},
      {"fido", "black"},
    };
    System.out.print(dogs[0][0]);
  }
}
