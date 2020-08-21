package com.itpec.qjava;

public class StudentGroup {
private final Student[] students;
private int size;
public StudentGroup(int capacity) {
	students=new Student[capacity];
}

public void addstudents(Student...studentstoAdd) {
	for(Student s:studentstoAdd) {
		if(size==students.length) {
			throw new IllegalStateException("no more space");			
		}
		students[size++]=s;
	}
}
public void upateStudent(int id,double score) {
for(int i=0;i<size;i++) {
	if(students[i].getId()==id) {
		students[i]=students[i].WithScore(score);
		return;
	}
	throw new IllegalArgumentException("student not found");
}
}
public void sort(SortOrder order) {
	for(int i=0;i<size-1;i++) {
		for(int j=i+1;j<size;j++) {
			if(order.compare(students[i],students[j])>0) {
				swap(i,j);
			}
		}
	}
}

private void swap(int i, int j) {
	Student temp=students[i];
	students[i]=students[j];
	students[j]=temp;
	
}

@Override
public String toString() {
	StringBuilder records=new StringBuilder();
	for(int i=0;i<size;i++) {
		records.append(students[i]).append(System.lineSeparator());
	}
	return records.toString();
}

}
