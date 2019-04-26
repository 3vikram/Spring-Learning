package com.CollectionsDependencyInjection.CollectionAsReference;

public class Answer {
	
	private int aid;  
	private String aname;  
	private String aby;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAby() {
		return aby;
	}
	public void setAby(String aby) {
		this.aby = aby;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", aname=" + aname + ", aby=" + aby + "]";
	}
}
