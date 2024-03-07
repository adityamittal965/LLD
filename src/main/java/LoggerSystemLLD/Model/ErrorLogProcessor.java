package LoggerSystemLLD.Model;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor) ;
    }
    public void log(int logLevel, String message){
        if(ERROR == logLevel)
            System.out.println("Error Message: " + message);
        else{
            super.log(logLevel, message) ;
        }
    }
}
