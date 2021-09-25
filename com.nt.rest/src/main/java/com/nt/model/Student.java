package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement

public class Student {
	
	private Integer sid;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSfee() {
		return sfee;
	}
	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	/*
	 * @Override public String toString() { return "Student [sid=" + sid +
	 * ", sname=" + sname + ", sfee=" + sfee + "]"; }
	 */
	private String sname;
	private Double sfee;
	

}
