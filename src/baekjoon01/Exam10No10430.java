package baekjoon01;

// 10430. 나머지

import java.util.Scanner;

public class Exam10No10430 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b, c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    System.out.println((a + b) % c);
    System.out.println(((a % c) + (b % c)) % c);
    System.out.println((a * b) % c);
    System.out.println(((a % c) * (b % c)) % c);

    scanner.close();
  }
}
