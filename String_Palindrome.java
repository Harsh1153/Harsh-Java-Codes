

public class String_Palindrome
{
    public static void main(String args[]) {
        String line = "A man, a plan, a canal: Panama";
        line = line.toLowerCase();//1
        String pline = "";
        boolean flag = true;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z')
                pline = pline + line.charAt(i);
        }
        System.out.println(pline);
        for (int i = 0, j = pline.length() - 1; i <= j; i++, j--) {
            if (pline.charAt(i) != pline.charAt(j)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    }
}
