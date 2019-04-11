package ru.sbt.lsn13.task1;

import ru.sbt.lsn13.task1.err.SomeException;

import java.util.concurrent.Callable;

public class Task<T> {
    private final Callable<? extends T> callable;
    private volatile SomeException exception;
    private volatile T result;

    Task(Callable<? extends T> callable) {
        this.callable = callable;
    }

    public T get() {
        if (exception != null) {
            throw exception;
        }
        if (result != null) {
            System.out.print(" - ");
            return result;
        }

        synchronized (this) {
            try {
                result = callable.call();
            } catch (Exception e) {
                exception = new SomeException(e);
            }
        }
        return result;
    }
}

