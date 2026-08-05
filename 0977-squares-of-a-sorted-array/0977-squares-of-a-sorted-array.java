class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int result[]=new int[len];
        while(left<=right)
        {
            int leftsqrt=nums[left]*nums[left];
            int rightsqrt=nums[right]*nums[right];
            if(leftsqrt>rightsqrt){
                result[index]=leftsqrt;
                left++;
            }
            else{
                result[index]=rightsqrt;
                right--;
            }
            index--;
        }
        return result;
    }
}