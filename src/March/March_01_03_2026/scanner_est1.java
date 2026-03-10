package March.March_01_03_2026;

import java.util.Scanner;

public class scanner_est1
{
    static void main()
    {
        int salary;
        String name;
        String address;

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter your name");
        name= sc.nextLine();
        System.out.println("Enter your address");
        address = sc.nextLine();
        System.out.println("Enter your salary");
        salary = sc.nextInt();

        System.out.println("Name is"+name);
        System.out.println("Address is"+address);
        System.out.println("Salary is"+salary);



    }
}
