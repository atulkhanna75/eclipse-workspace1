package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
	
		Resource res= new ClassPathResource("beans.xml"); //file loaded
		BeanFactory obj=new XmlBeanFactory(res);
//		Employee e1=(Employee)obj.getBean("emp1");// pull obj
//		e1.display();
//		Employee e2=(Employee)obj.getBean("emp1");// pull obj
//		e2.display();
//		Employee e2=(Employee)obj.getBean("emp2");// pull obj
//		e2.display();
		
				Address add1=(Address)obj.getBean("add");
		System.out.println(add1);

		Employee employee1=(Employee)obj.getBean("employee");// pull obj
		System.out.println(employee1);}

}
