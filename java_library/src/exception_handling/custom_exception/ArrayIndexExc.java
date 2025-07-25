package exception_handling.custom_exception;

public class ArrayIndexExc {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       //           0 1 2 3 4 => index values
       try {
           System.out.println(arr[3]);
       }
       catch (ArrayIndexOutOfBoundsException e){
           throw new ArrayIndexException();
       }
    }
}
