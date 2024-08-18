public class DebugLogger extends Logger{
    public DebugLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
