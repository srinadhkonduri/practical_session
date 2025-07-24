package character_programs;


import java.util.Scanner;

public class PrintingVowelsFromTheGivenCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        char[] ch = new char[size];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }

        System.out.print("vowels are : ");
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])){
                System.out.print(ch[i] + " ");
            }
        }
    }

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
