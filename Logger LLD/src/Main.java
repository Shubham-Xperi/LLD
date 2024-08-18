public class Main {
    public static void main(String[] args) {

        Logger logger = LoggerChain.getLogger();

        System.out.println("INFO LEVEL LOGS");
        logger.logMessage(LogLevel.INFO, "Hi This is Shubham");

        System.out.println("DEBUG LEVEL LOGS");
        logger.logMessage(LogLevel.DEBUG, "Hi This is Shubham");

        System.out.println("ERROR LEVEL LOGS");
        logger.logMessage(LogLevel.ERROR, "Hi This is Shubham");
    }
}








