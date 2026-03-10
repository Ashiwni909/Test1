package March.March_01_03_2026;

import java.util.Scanner;

public class if_else_1
{
    public static void main(String[]args)
    {
        int marks;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter marks");
        marks=sc.nextInt();

        if (marks>=90)
        {
            System.out.println("A");
        }
        else if (marks>=80&&marks<90)
        {
            System.out.println("B");

        } else if (marks>=70&&marks<80)
        {
            System.out.println("C");

        } else if (marks>=60&&marks<70)
        {
            System.out.println("D");

        }
        else
        {
            System.out.println("Fail");
        }


    }
}
