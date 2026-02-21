import java.util.Scanner;
class  Minimum_Common_value{
public int Minimum_Common_value(int []nums1, int[]nums2) {

    int i =0;
    int j =0;
    
    while(i<nums1.length && j<nums2.length){
        if(nums1[i] ==  nums2[j]){
            return nums1[i];

        }
        else if(nums1[i]<nums2[j]){
            i++ ;

        }
        else{
            j++;

        }
    }

    return -1;

}
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array (sorted):");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array (sorted):");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        Minimum_Common_value obj = new Minimum_Common_value();
        int result = obj.Minimum_Common_value(nums1, nums2);
       

        if (result != -1) {
            System.out.println("Minimum Common Value = " + result);
        } else {
            System.out.println("No Common Value Found");
        }

        sc.close();
    }
}


    

