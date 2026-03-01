package March.March_01_03_2026;

public class Count_fialed_cases
{
    static void main()
    {
        //if u have faled results count the failed count

        String Results[]={"Pass","Fail","Pass","Fail"};
        int failed_count =0;
        for(String result:Results)
        {
            if (result.equals("Fail"))
            {
                failed_count++;
            }
        }
        System.out.println("Total Failed"+failed_count);



    }
}
