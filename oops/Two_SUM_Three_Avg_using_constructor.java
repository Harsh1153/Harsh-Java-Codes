

public class Two_SUM_Three_Avg_using_constructor
{
    Two_SUM_Three_Avg_using_constructor(float no1,float no2)
    {
        System.out.println("2 paramenters passed:");
        System.out.println(no1+"+"+no2+"="+(no1+no2));
    }
    Two_SUM_Three_Avg_using_constructor(float no1,float no2,float no3)
    {
        System.out.println("3 paramenters passed:");
        System.out.println("Average of "+no1+","+no2+","+no3+" is "+(no1+no2+no3)/3);
    }
    public static void main(String args[])
    {
        Two_SUM_Three_Avg_using_constructor obj=new Two_SUM_Three_Avg_using_constructor(23,12);
        Two_SUM_Three_Avg_using_constructor obj2=new Two_SUM_Three_Avg_using_constructor(23,12,11);

    }
}
