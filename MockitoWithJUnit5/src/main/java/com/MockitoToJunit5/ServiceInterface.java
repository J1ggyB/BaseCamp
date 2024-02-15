package com.MockitoToJunit5;

import java.util.List;

public interface ServiceInterface {
public List<Student>retrieveStudents();
public Student getStudentByID(int ID);
}


//Note only two of our test methods are associated with the ServiceInterface