package exceptions;
public class ToddlerException extends RuntimeException{
    private final String message;
    public ToddlerException(String message) {
        super(message);
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
