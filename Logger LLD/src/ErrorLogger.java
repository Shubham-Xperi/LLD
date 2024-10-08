public class ErrorLogger extends Logger{
    public ErrorLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
