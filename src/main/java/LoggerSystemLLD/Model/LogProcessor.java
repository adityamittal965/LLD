package LoggerSystemLLD.Model;

public abstract class LogProcessor {
    public static int INFO = 1 ;
    public static int DEBUG = 2 ;

    public static int ERROR = 3 ;
    LogProcessor nextLogProcessor ;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor ;
    }

    public void log(int logLevel, String message){
        // One of the LogProcessor children is making call, so this.nextLogProcessor is its nextLogProcessor
        if(this.nextLogProcessor != null)
            nextLogProcessor.log(logLevel, message) ;
    }

}
