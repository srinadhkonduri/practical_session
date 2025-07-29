package string_programs_preparation;

public class LexicographicalOrder {
    public static void main(String[] args) {
        String name = "cat banana apple";
        String res = sortWords(name);
        System.out.println(res);
    }
    public static String sortWords(String str){
        int countWords = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') countWords++;
        }
        String[] words = new String[countWords];
        String word = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // last word

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i];
            if (i < words.length - 1) res += " ";
        }
        return res;
    }
}
