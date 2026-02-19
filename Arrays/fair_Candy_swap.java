import java.util.Arrays;
class Solution{


public int[] fair_Candy_swap(int[] aliceSizes, int[] bobSizes) {

    int sumA= 0;
    int sumB =0;
   for(int i = 0; i < aliceSizes.length; i++)
{
        sumA += aliceSizes[i];

    }
    for(int j =0;j<bobSizes.length;j++){
        sumB += bobSizes[j];

    }
    int h = (sumA-sumB)/2;

    Arrays.sort(aliceSizes);
    Arrays.sort(bobSizes);
    int i =0;
    int j =0;

    while(i<aliceSizes.length&&j<bobSizes.length) {
        int diff = aliceSizes[i]-bobSizes[j];

        if(diff== h){
            return new int[]{aliceSizes[i] , bobSizes[j]};

        }
        else if (diff<h){
            i++;
        }
        else{
            j++;
        }
    }
    return new int[]{};


    
}
}