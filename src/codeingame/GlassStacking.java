package codeingame;

import java.util.Arrays;
import java.util.Scanner;

// wtf
public class GlassStacking {

  static Integer[] nbrglasses = {1, 3, 6, 10, 15, 21, 28};

  public static String[] singleGlass(int offset) {
    String[] glass = new String[4];
    for (int i = 0; i < 4; i++) {
      glass[i] = glassLine(i, offset);
    }
    return glass;
  }

  public static String glassLine(int i, int offset) {
    String line = offset(offset);
    switch (i) {
      case 0:
        line += " *** ";
        break;
      case 1:
      case 2:
        line += " * * ";
      case 3:
        line += "*****";
        break;
      default:
        break;
    }
    return line;
  }

  public static String[] multiGlass(int offset, int n) {
    String[] glasses = new String[4];
    for (int i = 0; i < 4; i++) {
      glasses[i] = glassLine(i, offset);
      for (int j = 1; j < n; j++) {
        glasses[i] += " " + glassLine(i, 0);
      }
    }
    return glasses;
  }

  public static String offset(int n) {
    String off = "";
    for (int i = 1; i <= n; i++) {
      off += " ";
    }
    return off;
  }

  public static int determineGlasses(int N) {
    if (N <= 0 || N >= 30) {
      return -1;
    }
    while (Arrays.asList(nbrglasses).indexOf(N) == -1) {
      N = N - 1;
    }
    return N;
  }

  public static int determineOffset(int level, int nbrlevels) {
    int offset = 3 * level;
    return offset;
  }

  public static int determineLevels(int N) {
    return Arrays.asList(nbrglasses).indexOf(N) + 1;
  }

  public static void printGlass(String[] glass) {
    for (int i = 0; i < glass.length; i++) {
      System.out.println(glass[i]);
    }
  }

  public static void glassStacking(int N) {
    N = determineGlasses(N);
    int levels = determineLevels(N);
    for (int i = 0; i < levels; i++) {
      String[] glass = multiGlass(determineOffset(levels - i - 1, levels), i + 1);
      printGlass(glass);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    glassStacking(N);
    in.close();
  }
}
