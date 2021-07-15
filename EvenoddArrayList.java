import java.util.*;
class Evenoddarraylist
{
    public int[] sortArrayByParityII(int[] nums) {
    ArrayList<Integer> even=new ArrayList<Integer>( );
    ArrayList<Integer> odd=new ArrayList<Integer>( );
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]%2==1)
        odd.add(nums[i]);
      else
        even.add(nums[i]);
    }
    int i=0;
    for(Integer value:even)
    {
      nums[i]=value;
      i+=2;
    }
    i=1;
    for(Integer value:odd)
    {
      nums[i]=value;
      i+=2;
    }
    return nums;
    }
}
-------------------------------------------------------------------------------------------------
input:
[4, 2, 5, 7]
output:
[4, 5, 2, 7]
