package pl.sda.spring.exception;

public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException() {
        super("Nie wolno dzielic przez zero");
    }
}
