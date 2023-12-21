// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.
// Example 1:
// Input: n = 16
// Output: true
// Example 2:
// Input: n = 5
// Output: false
// Example 3:
// Input: n = 1
// Output: true

class powerof4 {
    boolean Check(int n){
        
        for(int i=0; ;i++){
            if(Math.pow(4,i)==n){
                return true;
            }
            if(Math.pow(4,i)>n){
                return false;
            }
        }
        
        
    }
    public static void main(String[] args) {
        int n=20;

        powerof4 obj=new powerof4();
        if (obj.Check(n)==true){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        
    }

}
