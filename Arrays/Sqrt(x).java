import java.util.Scanner;
class Solution {
    public int mySqrt(int x) {

        if (x < 2)
            return x;

        int low = 1;
        int high = x / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;  

            if (square == x) {
                return mid;
            } 
            else if (square > x) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return high;   
    }

//remove this this is main class

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.mySqrt(x);

        System.out.println("Square root (floor value) = " + result);

        sc.close();
    }
}