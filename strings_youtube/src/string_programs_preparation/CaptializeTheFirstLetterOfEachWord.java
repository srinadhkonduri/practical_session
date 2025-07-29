package string_programs_preparation;

import java.util.Scanner;

public class CaptializeTheFirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String name = sc.nextLine();
        String res = captailizeFirstLetter(name);
        System.out.println(res);
    }

    public static String captailizeFirstLetter(String str){
        String res = "";
        boolean cN = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' '){
                res += ch;
                cN = true;
            } else if (cN && ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 32);
                cN = false;
            }
            else {
                res += ch;
                cN = false;
            }
        }
        return res;
    }

}
