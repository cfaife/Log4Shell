import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main{

     static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String [] args){
        System.out.println("Log4shell programing is staarting ...");
        logger.error(args[0]);

        System.out.println("Log4shell programing is ending ....");
    }
}