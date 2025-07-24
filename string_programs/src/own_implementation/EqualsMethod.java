package own_implementation;

public class EqualsMethod {
    public static void main(String[] args) {
        isEquals("java","java");
    }

    public static void isEquals(String str1, String str2){
        if (str1.length() == str2.length()){
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)){
                    count++;
                }
            }
            if (count == str1.length()){
                System.out.println("given strings are equal ..");
            }
            else {
                System.out.println("given strings are not equal ..");
            }
        }
        else {
            System.out.println("given strings are not equal in length ..");
        }
    }
}
