package ru.sbt.lsn13.task2;

import javax.naming.Context;

public interface ExecutionManager {
    /**
     * это неблокирующий метод, который сразу возвращает объект Context
     */
    Context execute(Runnable callback, Runnable... tasks);
}
