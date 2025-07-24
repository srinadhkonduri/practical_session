package own_implementation;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str = "JAVA";
        String str1 = "java";
        if (equalsIgnoreCase(str,str1)){
            System.out.println("both strings are equal  ..");
        }
        else {
            System.out.println("both strings are not equal ...");
        }

        String toLowerCase = toLowerCaseMethod("TONY STARK");
        String toUpperCase = toUpperCaseMethod("tony stark");
        System.out.println(toLowerCase);
        System.out.println(toUpperCase);
    }


    public static String toLowerCase(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)){
                newString += ch;
            } else if (Character.isUpperCase(ch)) {
                newString += Character.toLowerCase(ch);
            }
        }
        return newString;
    }

    public static boolean equalsIgnoreCase(String str1 , String str2){
        return toLowerCase(str1).equals(toLowerCase(str2));
    }


    // to lower case
    public static String toLowerCaseMethod(String str) {
        String s1 = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            s1 += ch[i];
        }
        return s1;
    }

    // to upper case
    public static String toUpperCaseMethod(String str){
        String s1 = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] -= 32;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            s1 += ch[i];
        }
        return s1;
    }

}
