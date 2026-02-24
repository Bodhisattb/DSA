class Solution {
    public int missingNumber(int[] nums) {

        int x1=0;
        int x2=0;

        for(int i =0;i<nums.length;i++){
            x1 =x1^nums[i];

        }
        for(int j =0;j<=nums.length;j++){
            x2 = x2^j;

        }
        return x1^x2;
        
    }
}