package ru.sbt.lsn13.task1;

import ru.sbt.lsn13.task1.err.SomeException;

import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args) {
        doSome();
    }

    private static void doSome() {
        Callable callable = () -> "Callable result";
        Task task = new Task(callable);
        Runnable runnable = () -> System.out.println(task.get());

        for (int i = 0; i < 10; i++) {
            try {
                new Thread(runnable).start();
            } catch (SomeException e) {
                System.out.println("asd");
            }
        }
    }
}
