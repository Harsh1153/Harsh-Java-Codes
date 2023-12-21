// You are a product manager and currently leading a team to develop a new product.
// Unfortunately, the latest version of your product fails the quality check. Since each version is
// developed based on the previous version, all the versions after a bad version are also bad.
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
// causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad.
// Implement a function to find the first bad version. You should minimize the number of calls to the
// API.
// Example 1:
// Input: n = 5, bad = 4
// Output: 4
// Explanation:
// call isBadVersion(3) -> false
// call isBadVersion(5) -> true
// call isBadVersion(4) -> true
// Then 4 is the first bad version.
// Example 2:
// Input: n = 1, bad = 1
// Output: 1



public class BadVersion
{
    private int bad;
    void setBadVersion(int version)
    {
        this.bad=version;
    }
    boolean isBadVersion(int version)
    {
        if(version>=bad)
            return true;
        else
            return false;
    }

public static void main(String args[])
    {
        int versions[]={8,2,1,5,7,9,10};
        BadVersion obj=new BadVersion();
        obj.setBadVersion(3);
        int First_bad_version=versions[0];
        for(int i=1;i<versions.length;i++)
        {
            if(obj.isBadVersion(versions[i])==true && versions[i]<First_bad_version)
                First_bad_version=versions[i];
        }
        System.out.println("First bad Version used:"+First_bad_version);
    }
}

