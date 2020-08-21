package com.asiaseu.action2db;

public class City {
private long Id;
private String name,description;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name =name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
