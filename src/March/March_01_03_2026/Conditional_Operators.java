package March.March_01_03_2026;

public class Conditional_Operators
{
    static void main() {
        int no =-5;
        String result = no>=0?"positive":"Negative";
        System.out.println(result);
                //syntax result = condition?"expression1":"expression2"

        int age =18;
        String Vote_Result = age>=18?"Able to vote":"Not able to vote";
        System.out.println(Vote_Result);

        int x =20;
        int y=30;
        int z =10;
        System.out.println(x>y?"x is greater":"y is greater");
        System.out.println(x>y&&x>z?"x is greatter":y>x&&y>z?"y is geater":"Z is greater");

        //score>=90+A||score<=90&&>==70=B||score<=70&&>=50=C||Fail
        int score =85;
        String score_Result = (score>=90)?"A grade":(score<=90&&score>=70)?"B grade":(score<=70&&score>=50)?"C grade":"Fail";
        System.out.println(score_Result);

    }
}
