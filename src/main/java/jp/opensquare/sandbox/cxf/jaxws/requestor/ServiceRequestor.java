package jp.opensquare.sandbox.cxf.jaxws.requestor;

import java.util.ArrayList;
import java.util.List;

import jp.opensquare.sandbox.cxf.jaxws.provider.Calculate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceRequestor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "requestor-beans.xml" });

		Calculate requestor = (Calculate) context.getBean("calculate");
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		System.out.println("Sum: " + requestor.sum(values));
		System.exit(0);
	}
}
