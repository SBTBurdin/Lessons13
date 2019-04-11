package ru.sbt.lsn13.task2;

public interface Context {
    /**
     * Возвращает количество тасков, которые на текущий момент успешно выполнились.
     *
     * @return
     */
    int getCompletedTaskCount();

    /**
     * Возвращает количество тасков, при выполнении которых произошел Exception.
     *
     * @return
     */
    int getFailedTaskCount();

    /**
     * Отменяет выполнения тасков, которые еще не начали выполняться.
     *
     * @return
     */
    int getInterruptedTaskCount();

    /**
     * Возвращает количество тасков, которые не были выполены из-за отмены (вызовом предыдущего метода).
     */
    void interrupt();

    /**
     * true, если все таски были выполнены или отменены, false в противном случае
     *
     * @return
     */
    boolean isFinished();
}
