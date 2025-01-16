package com.trainticket.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FillBookingInfo {
private String first_name;
private String last_name;
private int age;
private String jorney_date;
private String source_station;
private String destination_station;
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getJorney_date() {
	return jorney_date;
}
public void setJorney_date(String jorney_date) {
	this.jorney_date = jorney_date;
}
public String getSource_station() {
	return source_station;
}
public void setSource_station(String source_station) {
	this.source_station = source_station;
}
public String getDestination_station() {
	return destination_station;
}
public void setDestination_station(String destination_station) {
	this.destination_station = destination_station;
}
@Override
public String toString() {
	return "FillBookingInfo [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", jorney_date="
			+ jorney_date + ", source_station=" + source_station + ", destination_station=" + destination_station + "]";
}



}
