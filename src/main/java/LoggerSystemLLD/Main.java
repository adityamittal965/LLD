package LoggerSystemLLD;

import LoggerSystemLLD.Model.DebugLogProcessor;
import LoggerSystemLLD.Model.ErrorLogProcessor;
import LoggerSystemLLD.Model.InfoLogProcessor;
import LoggerSystemLLD.Model.LogProcessor;

// Chain of Responsibility Design Pattern (Behavioral)
public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null))) ;
        logProcessor.log(LogProcessor.DEBUG, "Hello from Debug") ;
        logProcessor.log(LogProcessor.ERROR, "Hello from Error") ;
        logProcessor.log(LogProcessor.INFO, "Hello from Info") ;
    }


}
