package cn.zenyatta.learn.designpattern.responsibility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class ResponsibilityChainTest {

    @Test
    public void testResponsibilityChain() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an infomation.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level infomation.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error infomation.");
    }

    private AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        fileLogger.setNextLogger(consoleLogger);
        errorLogger.setNextLogger(fileLogger);

        return errorLogger;
    }

}