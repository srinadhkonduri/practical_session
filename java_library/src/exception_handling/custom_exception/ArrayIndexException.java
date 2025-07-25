package exception_handling.custom_exception;

public class ArrayIndexException extends RuntimeException{
    @Override
    public String toString()
    {
        return getClass()+" Index out of bounds!";
    }
}
