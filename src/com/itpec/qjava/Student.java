package com.itpec.qjava;

public class Student {
private final int id;
private final String name;
private final double score;
public Student(int id,String name) {
	this(id,name,-1);
}
public Student(int id,String name,double score) {
	this.id=id;
	this.name=name;
	this.score=score;
}
public Student WithScore(double newscore) {
	return new Student(id,name,newscore);
}
@Override
public String toString() {
	return String.format("(%d,%s,%s)", id,name,score<0?"no score":score);
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getScore() {
	return score;
}

}
