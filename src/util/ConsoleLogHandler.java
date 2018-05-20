package util;

public class ConsoleLogHandler extends LogHandler {
    private static final ConsoleLogHandler CONSOLE_LOG_HANDLER = new ConsoleLogHandler();

    private ConsoleLogHandler(){ }

    public static ConsoleLogHandler getLogHandler() {
        return CONSOLE_LOG_HANDLER;
    }

    @Override
    public void showLogException(Exception exc) {
        StringBuilder builder = new StringBuilder();
        builder.append("************ LOG *************");
        builder.append(NEW_LINE);
        builder.append(getDateOfToday());
        builder.append(", Exception was thrown: ");
        builder.append(exc.getMessage());
        builder.append(NEW_LINE);
        System.out.println(builder.toString());
        exc.printStackTrace(System.out);
        System.out.println("******************************");
    }
}
