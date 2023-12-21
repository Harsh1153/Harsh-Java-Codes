public class OverloadAdd
{
    void add(int p1,int p2)
    {
        System.out.println("INT CALLED:"+p1+"+"+p2+"="+(p1+p2));
    }
    void add(float p1,float p2)
    {
        System.out.println("FLOAT CALLED:"+p1+"+"+p2+"="+(p1+p2));
    }
    void add(String p1,String p2)
    {
        System.out.println("STRING CALLED:"+p1+"+"+p2+"="+(p1+p2));
    }

    public static void main(String args[])
    {
        OverloadAdd obj=new OverloadAdd();
        obj.add(10,20);//10+20=30
        obj.add(1.20f,2.10f);//1.20+2.10=3.30
        obj.add("abc","def");//abc+def=abcdef
        obj.add(10,2.10f);//1.20+2.10=3.30
    }
}
