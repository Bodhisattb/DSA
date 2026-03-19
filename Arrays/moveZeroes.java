class Solution{

    public int moveZeroes(int[] nums) {

        int [] temp = new int[nums.length];
        int j =0;


        for(int i=0;i<nums.length;i++){

            if(nums[i] != 0){
                temp[j] = nums[i];
                j++;


            }
        }    
            while(j<nums.length){
                temp[j]=0;
                j++;



            }

            for(int i =0;i<nums.length;i++){
                nums[i]= nums[j];

            }


        



    
 }
}