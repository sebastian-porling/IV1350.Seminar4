package util;

import java.time.LocalDateTime;

/**
 * Takes care of all the exception that will be logged.
 */
public class LogHandler {
    private static final LogHandler LOG_HANDLER = new LogHandler();
    private final String NEW_LINE = "\n";

    /**
     * Get the singleton instance of <code>LogHandler</code>
     * @return the <code>LogHandler</code>
     */
    public static LogHandler getLogger() {
        return LOG_HANDLER;
    }

    private LogHandler(){}

    /**
     * Prints out a log, that shows the exception that has been thrown.
     * Does also print out the date when the exception was thrown.
     * @param exc the exception will be printed out.
     */
    public void showLogException(Exception exc) {
        StringBuilder builder = new StringBuilder();
        builder.append("************ LOG *************");
        builder.append(NEW_LINE);
        builder.append(getDateOfToday());
        builder.append(", Exception was thrown: ");
        builder.append(exc.getMessage());
        if(exc.getCause() != null){
            builder.append(" " + exc.getCause().getMessage());
        }
        builder.append(NEW_LINE);
        builder.append("******************************");
        builder.append(NEW_LINE);
        System.out.println(builder.toString());
    }

    private String getDateOfToday(){
        LocalDateTime now = LocalDateTime.now();
        return now.toLocalDate().toString();
    }
}
