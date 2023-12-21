
class Parent
{
    public void greet()
    {
        System.out.println("Parent:Wish You A Very Good Morning");
    }
    public void eat()
    {
        System.out.println("Parent: Eating food");
    }
}
class Child extends Parent
{
    public void greet()//override: recode parents method to reject inheritance
    {//done to take changes in consideration wrt time and need

        System.out.println("Child: GM");
    }
}
public class OverrideExample
{
    public static void main(String args[])
    {
        Parent objp=new Parent();
        objp.greet();
        objp.eat();
        Child obj=new Child();
        obj.eat();
        obj.greet();
    }
}
