import java.util.Arrays;

public class Reverse_String {
        public static void main(String args[])
        {
            String s="amar";
            char[] a=s.toCharArray();
            for(int i = 0,j=a.length-1;i<=j;i++, j--){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                
            }
              
            for(int i=0; i<a.length; i++){
                System.out.println("reversed array: " + a[i]);
                Arrays.parallelSort(a);
                System.out.println("in order: " + a[i]);
                for(int j=0; j<a.length; j++){
                    System.out.println(a[i]);
            }
    
        }
}
}

