import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import alpha.Demo;

public class dd {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		if(5>4)
		{
			log.info("I am debugging");
		}
			log.error("object is present");
			log.fatal("this is fatal");
		
		

	}
}
