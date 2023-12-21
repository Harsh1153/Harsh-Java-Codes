
class Students
{
    private int rollno;
    private String name,gender;
    void setData(String name,String gender,int rollno)
    {
        this.name=name;
        this.gender=gender;
        this.rollno=rollno;
    }
    void displayStudent()
    {
        System.out.println("Rollno:"+rollno+"\tName:"+name+"\tGender:"+gender);
    }
}
class Department
{
    private int D_code;
    Students s;
    void setDepartment(int dept,String name,String gender,int roll)
    {
       D_code=dept;
       s=new Students();//until object is created
       s.setData(name, gender, roll);


    }
    void display()
    {
        System.out.println(D_code);
        s.displayStudent();
    }
}
public class StudentContainer {
    public static void main(String[] args) {
   Department obj=new Department();
   
}
}