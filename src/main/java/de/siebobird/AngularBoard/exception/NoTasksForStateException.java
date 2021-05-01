package de.siebobird.AngularBoard.exception;

public class NoTasksForStateException extends RuntimeException {
    public NoTasksForStateException(String message) {
        super(message);
    }
}
