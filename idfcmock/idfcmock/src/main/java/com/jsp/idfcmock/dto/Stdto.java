package com.jsp.idfcmock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stdto {
@Id
int stdid;
String name;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "stdid=" + stdid + ", name=" + name ;
}

}
