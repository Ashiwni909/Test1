package March.March_01_03_2026;

import java.util.Scanner;

public class Scanner_test2
{
    public static void main(String args[])
    {
        int no1,no2;
        char operation ;
        char Suboperation ='-';
        char Multiplicatio ='*';
        char Division ='/';
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no1");
        no1=sc.nextInt();
        System.out.println("Enter no2");
        no2 = sc.nextInt();
        System.out.println("Enter operation");
        operation=sc.next().charAt(0);

        System.out.println(no1>no2?"no1 is greater":"no2 is greter");
        System.out.println(operation=='+' ?"Addition is "+(no1+no2):operation=='-'?"Subtraction is"+(no1-no2):operation=='*'?"Multiplication is"+(no1*no2):operation=='/'?"Division is"+(no1/no2):"Wrong oeration seleced");


    }
}
