package March.March_01_03_2026;

import java.util.Scanner;

public class If_else_condition
{
    static void main()
    {
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        if(a==8)
        {
            System.out.println("Its no 8");
        } else if (a!=8) {
            System.out.println("Its other than 8");
        }
        else
        {
            System.out.println("invalid input");
        }


    }
}
