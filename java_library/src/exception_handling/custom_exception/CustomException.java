package exception_handling.custom_exception;

public class CustomException extends RuntimeException{

    public CustomException(){
        super();
    }

    public CustomException(String message){
        super(message);
    }
    public String toString(){
        return "unchecked exception" + getMessage();
    }
}
