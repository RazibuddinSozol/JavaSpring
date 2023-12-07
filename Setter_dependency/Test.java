package Setter_dependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("set_Contex.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e = (Employee) factory.getBean("obj");
		e.display();

	}
}
