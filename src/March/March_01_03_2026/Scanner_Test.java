package March.March_01_03_2026;

import java.util.Scanner;

public class Scanner_Test
{
    static void main() {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println(age>18?"Allowed to vote":"Not allowed to vote");
    }
}
