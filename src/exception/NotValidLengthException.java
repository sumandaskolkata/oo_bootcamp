package exception;

public class NotValidLengthException extends Throwable {
    public NotValidLengthException() {
        super("length can not be negative");
    }
}
