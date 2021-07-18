class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i:nums)
        {
              h.add(i);
            
        }
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(h.contains(i)==false)
            {
                return i;
            }
           
        }
         return n;
        
    }
}