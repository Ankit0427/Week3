public class LinearSearch {
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
       
        // Mark the elements present in the array
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }
       
        // Find the first missing positive integer
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
       
        return n + 1;
    }
   
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findFirstMissingPositive(arr));
    }
}