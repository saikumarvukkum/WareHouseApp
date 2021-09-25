package com.nt.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nt.model.Student;

public class RestTest {
     public static void main(String[] args) throws JAXBException, FileNotFoundException {
    	 //creating context obj
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Student st=new Student();
		st.setSid(101);st.setSname("kumar");st.setSfee(1500.0);
		//creating marshaller obj
		Marshaller m=context.createMarshaller();
		m.marshal(st, new FileOutputStream("F:/data/data.xml"));
		System.out.println("Done");
	}
}
