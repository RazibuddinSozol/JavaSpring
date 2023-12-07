package DI_By_Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Customar {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("contest_ap.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employe s = (Employe) factory.getBean("e");
		s.show();

	}
}
