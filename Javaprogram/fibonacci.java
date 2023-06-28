package Javaprogram;
import java.util.Scanner;

public class fibonacci {

  public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int t1 = 0, t2 = 1;
            int nextTerm = t1 + t2;

            System.out.println(t1);
            System.out.println(t2);

            for(int i = 3; i <= n; i++) {
                System.out.println(nextTerm);
                t1 = t2;
                t2 = nextTerm;
                nextTerm = t1 + t2;
            }
        }
  }
}

