package com.J1ggy;

public interface StudentInterface {
	public static final String responsibleBody = "SQA"; // In an interface static content has to be public
	
	public static String getResponsibileBody() {
		return responsibleBody;
	}
	
String getStudentState(Student s);	
	
	

}
