public class InfoLogger extends Logger {
    public InfoLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
