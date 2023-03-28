package com.laundry.laundrysample.common.exception;

public class CanNotProceedException extends RuntimeException {
    public CanNotProceedException() {
        super();
    }
    public CanNotProceedException(String message) {
        super(message);
    }
    public CanNotProceedException(String message, Throwable cause) {
        super(message, cause);
    }
    public CanNotProceedException(Throwable cause) {
        super(cause);
    }
}
