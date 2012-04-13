import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.ex.target.Business;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext(
				new String[] { "spring-config.xml" });
		
		Business b = appCtx.getBean(Business.class);
		b.doSomeOperation();
	}

}
