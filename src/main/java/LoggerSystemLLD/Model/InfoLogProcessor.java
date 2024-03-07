package LoggerSystemLLD.Model;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor) ;
    }
    public void log(int logLevel, String message){
        if(INFO == logLevel)
            System.out.println("Info Message: " + message);
        else{
            super.log(logLevel, message) ;
        }
    }
}
