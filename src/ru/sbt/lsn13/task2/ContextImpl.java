package ru.sbt.lsn13.task2;

public class ContextImpl implements Context {
    /**
     * Возвращает количество тасков, которые на текущий момент успешно выполнились.
     *
     * @return
     */
    @Override
    public int getCompletedTaskCount() {
        return 0;
    }

    /**
     * Возвращает количество тасков, при выполнении которых произошел Exception.
     *
     * @return
     */
    @Override
    public int getFailedTaskCount() {
        return 0;
    }

    /**
     * Отменяет выполнения тасков, которые еще не начали выполняться.
     *
     * @return
     */
    @Override
    public int getInterruptedTaskCount() {
        return 0;
    }

    /**
     * Возвращает количество тасков, которые не были выполены из-за отмены (вызовом предыдущего метода).
     */
    @Override
    public void interrupt() {

    }

    /**
     * true, если все таски были выполнены или отменены, false в противном случае
     *
     * @return
     */
    @Override
    public boolean isFinished() {
        return false;
    }
}
