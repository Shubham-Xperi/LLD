public class LoggerChain {
    public static Logger getLogger() {
        Logger infoLogger = new InfoLogger(LogLevel.INFO);
        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}

