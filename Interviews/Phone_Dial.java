import java.util.*;
public class Phone_Dial {
    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap hmap = new HashMap();

        /*Adding elements to HashMap*/
        hmap.put(1, " ");
        hmap.put(2, "abc");
        hmap.put(3, "def");
        hmap.put(4, "ghi");
        hmap.put(5, "jkl");
        hmap.put(6, "mno");
        hmap.put(7, "pqrs");
        hmap.put(8, "tuv");
        hmap.put(9, "wxyz");
        hmap.put(0, "_");
        int no = 28;
        int tno=no;
        int rno=0;
        while(tno>0) {
            int digit = tno % 10;
            rno = rno * 10 + digit;
            tno = tno / 10;
        }
        while(rno>0)
        {
            int digit=rno%10;
            rno=rno/10;
            System.out.println(digit+"----->"+(String) hmap.get(digit));
        }

    }
}
