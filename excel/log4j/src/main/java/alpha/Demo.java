package alpha;

import org.apache.logging.log4j.LogManager;


public class Demo {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		if(5>4)
		{
			log.error("I am debugging");
		}
			log.error("object is present");
			log.fatal("this is fatal");
		
		

	}

}
