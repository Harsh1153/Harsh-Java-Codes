

public class TwoSum_Three_AVG 
{
    void total(float no1,float no2)
    {
        System.out.println("2 paramenters passed:");
        System.out.println(no1+"+"+no2+"="+(no1+no2));
    }
    void total(float no1,float no2,float no3)
    {
        System.out.println("3 paramenters passed:");
        System.out.println("Average of "+no1+","+no2+","+no3+" is "+(no1+no2+no3)/3);
    }
    public static void main(String args[])
    {
        TwoSum_Three_AVG obj=new TwoSum_Three_AVG();
        obj.total(11,22,33);
        obj.total(23,12);
    }
}
