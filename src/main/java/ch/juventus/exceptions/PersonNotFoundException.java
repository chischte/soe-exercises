package ch.juventus.exceptions;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public PersonNotFoundException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }

}
