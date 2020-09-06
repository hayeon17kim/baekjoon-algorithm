package baekjoon05;

import java.util.Scanner;

public class Exam02No3052 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[42];
    int sum = 0;
    int temp = 0;

    for (int i = 0; i < 10; i++) {
      arr[sc.nextInt() % 42]++;
    }

    for (int i = 0; i < 42; i++) {
      if (arr[i] == 0)
        continue;
      sum++;
    }
    System.out.println(sum);
    sc.close();
  }
}
