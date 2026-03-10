package March.March_01_03_2026;

import java.util.Scanner;

public class switch_test1
{
    public static void main(String[] args)
    {
        String Browser;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser");
        Browser = sc.next();

        switch (Browser)
        {
            case "Chrome":
                System.out.println("Chrome code will exe");
                break;

                case "Firefox":
                    System.out.println("Firefox code will exe");
                    break;

                    case "Safari":
                        System.out.println("Safari code will exe");
                        break;

            default:
                System.out.println("Invalid input");
        }

    }
}
