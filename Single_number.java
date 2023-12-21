//  Given a non-empty array of integers nums, every element appears twice except for one. Find
// that single one. You must implement a solution with a linear runtime complexity and use only
// constant extra space.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

 
 
 class Single_number {
  public static void main(String[] args) {
    int[] a={2,2,1};
   
    for(int i=0; i<a.length; i++){
        boolean flag= true;
        for(int j=i+1; j<a.length; j++){
            if(a[i]==a[j]){
                flag=false;
                break;

            }
        }
         if(flag){
                System.out.println(a[i]);
                break;
        }
 }
}
}