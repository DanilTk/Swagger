package pl.dan.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(long id) {
        super("Couldn't find book under id: " + id);
    }
}
