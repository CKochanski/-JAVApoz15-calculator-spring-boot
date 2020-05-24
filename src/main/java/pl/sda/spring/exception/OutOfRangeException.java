package pl.sda.spring.exception;

public class OutOfRangeException extends RuntimeException {

    public OutOfRangeException() {
        super("Percentage shoulbe in range 0-100 ");
    }
}
