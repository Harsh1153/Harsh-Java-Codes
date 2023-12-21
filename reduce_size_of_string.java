// the students are given a
// string with multiple characters that are repeated consecutively. You’re supposed to reduce the
// size of this string using mathematical logic given as in the example below:
// **Ex1:**
// Input :
// aabbbbeeeeffggg
// Output:
// a2b4e4f2g3
// **Ex2:**
// Input :
// abbccccc
// Output:
// ab2c5

class reduce_size_of_string {
    public static void main(String args[])
    {
        String data="xaaaaabbbccccccccddddddddddddd";
        int count,i,j;
        for(i=0;i<data.length()-1;)
        {
            count=1;
            for(j=i+1;j<data.length() && data.charAt(i)==data.charAt(j);j++)
            {
                count++;
            }
            if(count>1)
                System.out.print(data.charAt(i)+""+count);
            else
                System.out.print(data.charAt(i));
            i=j;
        }
    }
    }

