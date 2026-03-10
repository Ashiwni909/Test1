package March.March_01_03_2026;

import java.util.Scanner;

public class switch_test3
{
    public static void main(String[] args)
    {
        char operation;
        int no1;
        int no2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1 ");
        no1 = sc.nextInt();
        System.out.println("Enter no2 ");
        no2 = sc.nextInt();
        System.out.println("Enter operation");
        operation = sc.next().charAt(0);

        switch (operation)
        {
            case '+'-> System.out.println("Addition is"+(no1+no2));
            case '-'-> System.out.println("Subtraction is"+(no1-no2));
            case '*'-> System.out.println("Multiplication is"+(no1*no2));
            case '/'-> System.out.println("Division is"+(no1/no2));
            default -> System.out.println("Invalid input");

        }

    }
}
