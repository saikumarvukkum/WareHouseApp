package com.nt.test;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class RestTest2 {
     public static void main(String[] args) throws JAXBException, FileNotFoundException {
    	 //creating context obj
		JAXBContext context=JAXBContext.newInstance(Student.class);
		
		//creating marshaller obj
		Unmarshaller m=context.createUnmarshaller();
		Object obj=m.unmarshal(new File("F:\\data.xml"));
		Student s=(Student)m.unmarshal(new File("F:\\data.xml"));
		System.out.println(s);
		System.out.println(obj);
	}
}
