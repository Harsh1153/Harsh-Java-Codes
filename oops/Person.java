

public class Person
{
    String gender;
    Person()//default valur constructor
    {
        System.out.println("Default value constructor:");
        gender="unknown";
    }
    Person(String gender)
    {
        System.out.println("Parameterzied called:");
        this.gender=gender;
        //this. refere to instance member of class
    }
    Person(Person obj_ref)
    {
        System.out.println("Copy Constructor called:");
        this.gender=obj_ref.gender;
        //this. refere to instance member of class
    }
    void intro()
    {
        System.out.println("Gender is:"+gender);
    }
    public static void main(String args[])
    {
        Person p1=new Person();//default value
        Person p2=new Person("female");//parameterized
        Person p3=new Person(p2);//copy constructor
        p1.intro();
        p2.intro();
        p3.intro();
        p3.gender="male";
        p2.intro();
        p3.intro();
    }
}
