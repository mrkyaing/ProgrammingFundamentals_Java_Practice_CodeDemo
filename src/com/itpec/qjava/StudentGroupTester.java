package com.itpec.qjava;

public class StudentGroupTester {

	public static void main(String[] args) {
	StudentGroup studentGroup=new StudentGroup(4);
	studentGroup.addstudents(new Student(111,"abco",100),
			new Student(222,"Ghio",0),
			new Student(333,"jokl"),
			new Student(444,"cdef",70));
    sortAndPrint(studentGroup,SortOrder.BY_Score);
    sortAndPrint(studentGroup,SortOrder.BY_Name);
    sortAndPrint(studentGroup,SortOrder.BY_ID);
    
	}

	private static void sortAndPrint(StudentGroup studentGroup, SortOrder order) {
		studentGroup.sort(order);
		System.out.printf("sorted by %s:%n%s%n",order.getAttributeName(),studentGroup);
		
	}

}
