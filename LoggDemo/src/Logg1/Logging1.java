package Logg1;
import org.apache.logging.log4j.*;
public class Logging1 {
	private static Logger demologger=LogManager.getLogger(Logging1.class.getName());

	public static void main(String[] args) {
	    System.out.println("This is syso");
	    demologger.info("Click successful");
	    demologger.error("Db connection failed");
	    demologger.debug("This is Debug");
	    demologger.fatal("This is fatal");
	    demologger.trace("This is trace");
		}

	

	}


