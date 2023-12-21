
class ProjectException extends Exception//1
{
    ProjectException(String s)//2
    {
        super(s);
    }

}
public class CustomException2
{
    public static void main(String args[])
    {
        boolean flag=true;
        String code="333";
        try{
            if(flag)
            {
                if(code.equals("101"))
                    throw new ProjectException("user not found");//3
                else if (code.equals("404"))
                    throw new ProjectException("file not found");//3
                else
                    throw new ProjectException("Unknown Exception");//3
                }
            }
         catch(ProjectException e) {
             System.out.println("Error:" + e);

         }
        System.out.println("rest of the code...");
    }
}
