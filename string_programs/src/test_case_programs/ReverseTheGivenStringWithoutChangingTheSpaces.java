package test_case_programs;

import java.util.Scanner;

public class ReverseTheGivenStringWithoutChangingTheSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        String res = copy(name);
        System.out.println(res);
    }

    // logic to reverse the string
    public static String reverse(String str){
        // storing the result into a new string...
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (str.charAt(i) != ' '){
                rev = rev + ch;
            }
        }
        return rev;
    }

    // copy of the reversed string ...
    public static String copy(String str){
        String result = "";
        String rev = reverse(str);
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                result += " ";
            }
            else {
                // charAt(index++)...
                result += rev.charAt(index++);
            }
        }
        // here we are returning the result which is the final result
        return result;
    }
}
