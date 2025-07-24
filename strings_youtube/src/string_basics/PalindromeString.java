package string_basics;

public class PalindromeString {
    public static void main(String[] args) {
        String name = "malayalam";
        if (isPalindrome(name)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    public static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start < end){
            if (ch[start] != ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
