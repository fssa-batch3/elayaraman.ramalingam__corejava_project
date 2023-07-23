package com.fssa.corejava.day10.solved;

public class ValidationException extends Exception {

    private final long UID = -8105491977357554060L;

    public ValidationException(String msg) {
        super(msg);
    }

    public ValidationException(Throwable cause) {
        super(cause);
    }

    public ValidationException(String msg, Throwable cause) {
        super(msg, cause);
    }
