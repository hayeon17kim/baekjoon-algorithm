package baekjoon01;

// 10869. 사칙연산

import java.util.Scanner;

public class Exam09No10869 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    scanner.close();
  }
}
