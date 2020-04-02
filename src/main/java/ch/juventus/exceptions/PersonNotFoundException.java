package ch.juventus.exceptions;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    // What is the "throwable e" for?
    public PersonNotFoundException(String errorMessage, Throwable e) {
        super(errorMessage);
    }
}
