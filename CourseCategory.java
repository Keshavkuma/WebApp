package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseCategory {
@Id
	private String advanceJava;
private	String coreJava;
	private String spring;
private 	String javaScript;
private 	String hibernate;
private 	String angularJs;
	public String getAdvanceJava() {
		return advanceJava;
	}
	public void setAdvanceJava(String advanceJava) {
		this.advanceJava = advanceJava;
	}
	public String getCoreJava() {
		return coreJava;
	}
	public void setCoreJava(String coreJava) {
		this.coreJava = coreJava;
	}
	public String getSpring() {
		return spring;
	}
	public void setSpring(String spring) {
		this.spring = spring;
	}
	public String getJavaScript() {
		return javaScript;
	}
	public void setJavaScript(String javaScript) {
		this.javaScript = javaScript;
	}
	public String getHibernate() {
		return hibernate;
	}
	public void setHibernate(String hibernate) {
		this.hibernate = hibernate;
	}
	public String getAngularJs() {
		return angularJs;
	}
	public void setAngularJs(String angularJs) {
		this.angularJs = angularJs;
	}
	
}
