
class Human
{
    protected void live()
    {
        System.out.println("I am alive:HUMAN");
    }
}
class Student extends Human
{
    protected void study()
    {
        System.out.println("I am educating:STUDENT");
    }
}
class Work extends Student
{
    protected void working()
    {
        System.out.println("I am working:WORK");
    }
}

public class MultilevelExample
{
    public static void main(String args[])
    {
     Work obj=new Work();
     obj.live();
     obj.study();
     obj.working();

    }
}
