
import java.util.Scanner;
class Student2
{
    private static int rollno_gen=202300;
    private int rollno;
    private String name,gender;
    void registerStudent(String name,String gender)
    {
        this.name=name;
        this.gender=gender;
        Student2.rollno_gen++;
        this.rollno=Student2.rollno_gen;
        System.out.println("Remember \nRollno:"+rollno+"\tName:"+name+"\tGender:"+gender);
    }
    void displayStudent()
    {
        System.out.println("Rollno:"+rollno+"\tName:"+name+"\tGender:"+gender);
    }
    int get_rollno()
    {
        return (this.rollno);
    }
    void update_name(String name)
    {
        this.name=name;
        System.out.println("Student name updated");
    }
    void update_gender(String gender)
    {
        this.gender=gender;
        System.out.println("Student gender updated");
    }
}
public class StudentManagementSystem
{
    public static void main(String args[])
    {
        int ch,count=0;
        Scanner in=new Scanner(System.in);
        Student2 slist[]=new Student2[10];

        do
        {
            System.out.println("1.Register a student\n2.Search Student\n3.Update Student\n4.Delete Record\n5.Print all\n0.Exit\n:");
            ch=in.nextInt();

            switch(ch)
            {
                case 1:
                    String t=in.nextLine();
                    System.out.println("Enter name,gender:");
                    String n=in.nextLine();
                    String g=in.nextLine();
                    slist[count]=new Student2();
                    slist[count].registerStudent(n,g);
                    count++;
                    break;
                case 2:
                    System.out.println("Enter rollno:");
                    int r=in.nextInt();
                    boolean flag=false;
                    for(int i=0;i<count;i++)
                    {
                        if(slist[i].get_rollno()==r)
                        {
                            System.out.println(r+"found in records");
                            slist[i].displayStudent();
                            flag=true;
                            break;
                        }
                    }
                    if(flag==false)
                        System.out.println(r+" not found in records");
                    break;
                case 3:
                    System.out.println("Enter rollno:");
                    r=in.nextInt();
                    flag=false;
                    for(int i=0;i<count;i++)
                    {
                        if(slist[i].get_rollno()==r)
                        {
                            System.out.println(r + "found in records");
                            slist[i].displayStudent();
                            flag=true;

                            System.out.println("1.Update name\n2.Update gender\n");

                            int uch = in.nextInt();
                            if (uch == 1) {
                                t=in.nextLine();
                                System.out.println("Name:");
                                n = in.nextLine();
                                slist[i].update_name(n);
                            }
                            else if (uch == 2)
                            {
                                System.out.println("Gender:");
                                n = in.nextLine();
                                slist[i].update_gender(n);
                            }
                            else
                            {
                                System.out.println("Wrong choice");
                            }
                        }

                    }
                    if(flag==false)
                        System.out.println(r+" not found in records");
                    break;
                case 4:
                    System.out.println("Enter rollno:");
                    r=in.nextInt();
                    flag=false;
                    int i;
                    for(i=0;i<count;i++) {
                        if (slist[i].get_rollno() == r) {
                            System.out.println(r + "found in records");
                            slist[i].displayStudent();
                            flag = true;
                            break;
                        }
                    }
                    if(flag)
                     {
                        if(i==count-1)//last record
                        {
                            count--;
                        }
                        else
                        {
                         for(int j=i;j<count-1;j++)
                             slist[j]=slist[j+1];
                        }
                        count--;
                            System.out.println("Deleted:");
                    }
                    if(flag==false)
                        System.out.println(r+" not found in records");
                    break;
                case 5:
                    System.out.println("Data available "+count);
                    for( i=0;i<count;i++) {
                        slist[i].displayStudent();
                    }
                    break;

                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(ch!=0);
    }
}
