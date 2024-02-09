package com.StubExample;


import java.util.ArrayList;
import java.util.List;

import com.StubExample.Student;

public class ServiceBusImpl {
	private ServiceInterface service;

	public ServiceBusImpl(ServiceInterface service) {
		this.service = service;
	}



	
	public List<Student> getStudentsFilteredByCourse(String course){
		   List <Student> filteredResult = new ArrayList<>();
		   List <Student> getAllStudents = service.retrieveStudents();
				   for (Student std : getAllStudents) {
					   if (std.getCourse().contains(course)) {
							filteredResult.add(std);
							System.out.println(std.getName());
						}
				   }

		return filteredResult;

		}

}


