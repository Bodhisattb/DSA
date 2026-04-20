import java.util.ArrayList;

class Solution{

    public void  mergeSort(int[] arr,int left,int right) {

        if(left>=right)return;

        int mid = left +(right-left)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, right);
        
    }
    void merge(int []arr,int left,int mid,int right ){

        ArrayList<Integer> temp = new ArrayList<>();


        int i = left;
        int j = mid+1;

        while(i<=mid && j<=right){

            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;


            }
            else{
                temp.add(arr[j]);
                j++;


            }

        }
        while(i<=mid){
            temp.add(arr[i]);

        }
        while(j<=right){
            temp.add((arr[j]));

        }

        for(int h =0;h<temp.size();h++){
            arr[h+left] = temp.get(h);

        }


    }

    
}
