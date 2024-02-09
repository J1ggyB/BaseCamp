package com.StubExample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.StubExample.*;

class TestServiceBusImpl{

	@Test
	public void usingAStub() {
		ServiceInterface service = new ServiceInterfaceStub();
		service.retrieveStudents();
		ServiceBusImpl serviceBusImpl = new ServiceBusImpl(service);
		List<Student> students = (List<Student>) serviceBusImpl.getStudentsFilteredByCourse("Woodwork");
		assertEquals(2, students.size());
	}
}


