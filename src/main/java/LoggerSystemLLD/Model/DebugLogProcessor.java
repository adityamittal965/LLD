package LoggerSystemLLD.Model;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor) ;
    }
    public void log(int logLevel, String message){
        if(DEBUG == logLevel)
            System.out.println("Debug Message: " + message);
        else{
            super.log(logLevel, message) ;
        }
    }
}
