class Solution {
    public void quickSort(int[]  arr,int left,int right){

        if(left<right){

        int pivot = partition(arr,left,right);

        quickSort(arr, left, partition-1);
        quickSort(arr,partition+1,right);


        }






    }

    public int partition(int []arr,int left,int right){
        int pivot = arr[right];

        int i = left - 1;


        
        for(int k =i;k<arr.length;k++){

            if(arr[left]<= arr[right]){

                i++;

                swap(arr,left,right);


                




            }


        }
    }
    
}
