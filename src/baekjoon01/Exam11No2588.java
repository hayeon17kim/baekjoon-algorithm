package baekjoon01;

// 2588. 곱셈

import java.util.Scanner;

public class Exam11No2588 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b;
    a = scanner.nextInt();
    b = scanner.nextInt();

    System.out.println(a * (b % 10));
    System.out.println(a * ((b % 100) / 10));
    System.out.println(a * (b / 100));
    System.out.println(a * b);

    scanner.close();
  }
}
