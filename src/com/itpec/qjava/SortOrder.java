package com.itpec.qjava;

import java.util.Comparator;

public enum SortOrder implements Comparator<Student>{
	BY_ID((s1,s2)->Integer.compare(s1.getId(),s2.getId())),
    BY_Name((s1,s2)->s1.getName().compareToIgnoreCase(s2.getName())),
    BY_Score((s1,s2)->Double.compare(s1.getScore(),s2.getScore()));
	
	private final Comparator<Student> comparator;
	SortOrder(Comparator<Student> comparator) {
		this.comparator=comparator;
	}
	public String getAttributeName() {
		return name().substring(3);
	}
	@Override
	public int compare(Student s1, Student s2) {	
		return comparator.compare(s1, s2);
	}

}
