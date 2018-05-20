package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogHandler extends LogHandler {
    private static final FileLogHandler FILE_LOG_HANDLER = new FileLogHandler();
    private PrintWriter printWriter;
    private final String FILE_NAME = "Error-Log.txt";

    private FileLogHandler(){
        try {
            printWriter = new PrintWriter(new FileWriter(FILE_NAME), true);
        }catch (IOException exc){
            System.out.println("Could not create the FileLoggerHandler");
            exc.printStackTrace();
        }
    }

    public static FileLogHandler getLogHandler() {
        return FILE_LOG_HANDLER;
    }

    public void showLogException(Exception exc){
        StringBuilder builder = new StringBuilder();
        builder.append("************ LOG *************");
        builder.append(NEW_LINE);
        builder.append(getDateOfToday());
        builder.append(", Exception was thrown: ");
        builder.append(exc.getMessage());
        builder.append(NEW_LINE);
        printWriter.println(builder.toString());
        exc.printStackTrace(printWriter);
        printWriter.println("******************************");
    }
}
