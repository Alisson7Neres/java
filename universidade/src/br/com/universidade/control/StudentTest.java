package br.com.universidade.control;

import br.com.universidade.model.Student;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student account1 = new Student("Jane Green", 88.8);
		Student account2 = new Student("John Blue", 75.9);
		
		System.out.printf("%s letter grade is %s%n", 
				account1.getName(), account1.getLetterGrade());
		System.out.printf("%s letter grade is %s%n", 
				account2.getName(), account2.getLetterGrade());
	}

}
