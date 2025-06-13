package com.rit;
import org.apache.logging.log4j.*;

public class Log4j2Demo {

    // Creating a logger instance
    private static final Logger logger = LogManager.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
            	
        // TRACE level - Very detailed, typically used for development and debugging.
        logger.trace("This is a TRACE level message.");
        
        // DEBUG level - Used for debugging purposes, not as verbose as TRACE.
        logger.debug("This is a DEBUG level message.");
        
        // INFO level - Used to log general information about the program's execution.
        logger.info("This is an INFO level message.");
        
        // WARN level - Used for potentially harmful situations.
        logger.warn("This is a WARN level message.");
        
        // ERROR level - Used to log error events that might allow the application to continue running.
        logger.error("This is an ERROR level message.");
        
        // FATAL level - Used to log very severe error events that lead to application termination.
        logger.fatal("This is a FATAL level message.");
    }
}
