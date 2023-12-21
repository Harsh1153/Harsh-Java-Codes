public class Basic_Palindrome {
    public static void main(String args[]) {
        String data = "nitin";
        boolean flag = true;
        for (int i = 0, j = data.length() - 1; i <= j; i++, j--) {
            if (data.charAt(i) != data.charAt(j)) {
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