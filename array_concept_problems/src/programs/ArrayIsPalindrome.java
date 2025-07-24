package programs;

public class ArrayIsPalindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,1};
        if (isPalindrome(arr)){
            System.out.println("array is palindrome");
        }
        else {
            System.out.println("array is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
