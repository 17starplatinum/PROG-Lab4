package exceptions;
public class ArtistException extends Exception {
    private final String message;
    public ArtistException(String message) {
        super(message);
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
