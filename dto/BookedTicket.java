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
public class BookedTicket {
private String pnr;
private String name;
private String coach_no;
private int seat_number;
private String birth;
private String source;
private String destination;
private String journey_start_date;
private String journey_end_date;
private int kilometer;
public String getPnr() {
	return pnr;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCoach_no() {
	return coach_no;
}
public void setCoach_no(String coach_no) {
	this.coach_no = coach_no;
}
public int getSeat_number() {
	return seat_number;
}
public void setSeat_number(int seat_number) {
	this.seat_number = seat_number;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getJourney_start_date() {
	return journey_start_date;
}
public void setJourney_start_date(String journey_start_date) {
	this.journey_start_date = journey_start_date;
}
public String getJourney_end_date() {
	return journey_end_date;
}
public void setJourney_end_date(String journey_end_date) {
	this.journey_end_date = journey_end_date;
}
public int getKilometer() {
	return kilometer;
}
public void setKilometer(int kilometer) {
	this.kilometer = kilometer;
}
public void setPnr(String pnr) {
	this.pnr = pnr;
}

}

