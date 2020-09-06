package baekjoon05;

import java.util.Scanner;

public class Exam01No2577 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mul = sc.nextInt() * sc.nextInt() * sc.nextInt();

    int[] arr = new int[10];
    while (mul != 0) {
      arr[mul % 10]++;
      mul /= 10;
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }

}
