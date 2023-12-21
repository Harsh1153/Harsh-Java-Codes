import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String  s="silent";
        String l="listen";
        boolean flag=true;
        char[] a=s.toCharArray();
        char[] b=l.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length != b.length){
            System.out.println("can not be of the same length");
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                flag=false;
                break;
            }
            }
        if(flag){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
