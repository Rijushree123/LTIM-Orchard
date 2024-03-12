package utils;

import org.apache.log4j.Logger;
import runner.RunTest;
import org.apache.log4j.FileAppender;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerHandler extends FileAppender{
    public static String time = timeStamp();
    public static Logger log;
    @Override
    public void setFile(String file) {
        if (file.contains("%name")) {
            file = file.replace("%name", "Yatra_" + time + "_log");
        }
        super.setFile(file);
    }
    public static Logger createLog(){
        log= Logger.getLogger(RunTest.class);
        return log;
    }
    public static String timeStamp(){
        return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
    }

    public static void logInfo(String message) {
        createLog().info(message);
    }

    public static void logDebug(String message) {
        createLog().debug(message);
    }

    public static void logWarn(String message) {
        createLog().warn(message);
    }

    public static void logError(String message) {
        createLog().error(message);
    }

    public static void logFatal(String message) {
        createLog().fatal(message);
    }

    public static void logTrace(String message) {
        createLog().trace(message);
    }
}
