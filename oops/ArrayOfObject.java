import java.util.*;
class Human
{
    private String name,gender;
    public void setData(String n,String g)
    {
        name=n;
        gender=g;
    }
    public void intro()
    {
        System.out.println("Hi i am "+name+"and a "+gender);
    }

}
public class ArrayOfObject
{
    public static void main(String args[])
    {
        Human h[]=new Human[3];//array of objects
        Scanner in=new Scanner(System.in);
        // int a[]=new int[5];
        for(int i=0;i<h.length;i++)
        {
            h[i]=new Human();
            System.out.println("Enter data for human no:"+(i+1));

            String name=in.nextLine();
            String gender=in.nextLine();

            h[i].setData(name,gender);
        }
        System.out.println("Entered data\n");
        for(int i=0;i<h.length;i++)
        {
            h[i].intro();
        }
    }
}
