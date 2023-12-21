


public class Difference_of_two_array
{
    public static void main(String args[])
    {
        int array1[]={1,2,3,4},array2[]={3,4,5,6},array3[];
        int size=(array1.length>array2.length)?array1.length:array2.length;
        array3=new int[size];
        int i3=0;//index for array3
        for(int i=0;i<array1.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                array3[i3++]=array1[i];
        }
        for(int i=0;i<array2.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<array1.length;j++)
            {
                if(array2[i]==array1[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                array3[i3++]=array2[i];
        }
      for(int i=0;i<i3;i++)
      {
          System.out.print(array3[i]+" ");
      }
    }
}
