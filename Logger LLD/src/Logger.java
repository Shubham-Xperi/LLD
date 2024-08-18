import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Logger {
    private LogLevel logLevel;

    private Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LogLevel level, String message) {
        if (level.getLevel() >= this.logLevel.getLevel()) {
            write(message);
        }
        if (this.nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
