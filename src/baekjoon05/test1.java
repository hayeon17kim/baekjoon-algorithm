package baekjoon05;

public class test1 {
  public static void main(String[] args) {

    boolean[] numbers = new boolean[9999];

    for (int i = 1; i <= 10000; i++) {
      int index = 1;
      if (i < sum(index))
        System.out.println(i);
      else if (i == sum(index))
        index++;

    }
    String str = "dldk";
    System.out.println(str);
    str.toString();


  }


  static int sum(int number) {
    int result = 0;
    while (number != 0) {
      result += number % 10;
      number /= 10;
    }
    return result;
  }
}
