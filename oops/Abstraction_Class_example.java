abstract class shape
{
    abstract  void area();
}
class Circle extends shape
{
    float r;
    void setR(float r)
    {
        this.r=r;
    }
    @Override
    void area() {
        System.out.println("Circle Area is:"+(3.14f*r*r));

    }
}
class rectangle 
{
   float l,b;
  
    void setLb(float l,float b){
        this.l=l;
        this.b=b;
        

    }

    public void area() {
System.out.println("Rectangle Area is:"+(l*b));
    }
}
public class Abstraction_Class_example
{
    public static void main(String args[])
    {
        
        Circle obj=new Circle();
        obj.setR(12.3f);
        obj.area();
        rectangle obj1=new rectangle();
        obj1.setLb(12.3f,12.3f);
        obj1.area();
    }

}
