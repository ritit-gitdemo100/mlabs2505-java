package p10designpattern;

//Abstract Handler
abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;
	protected Logger nextLogger;

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}

//Concrete Handlers
class InfoLogger extends Logger {
	public InfoLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Info Logger: " + message);
	}
}

class DebugLogger extends Logger {
	public DebugLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Debug Logger: " + message);
	}
}

class ErrorLogger extends Logger {
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Logger: " + message);
	}
}

//Client code
public class P8ChainOfResponsibility {
	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger debugLogger = new DebugLogger(Logger.DEBUG);
		Logger infoLogger = new InfoLogger(Logger.INFO);

		infoLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(errorLogger);

		return infoLogger;
	}

	public static void main(String[] args) {
		Logger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(Logger.INFO, "This is an information.");
		loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
		loggerChain.logMessage(Logger.ERROR, "This is an error information.");
	}
}
