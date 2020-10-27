package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BatchDetails {
	@Id
	@Column(name="batchId")
	String batchId;
	@Column(name="courseId")
	String courseId;
	@Column(name="trainerId")
	String trainerId;
	@Column(name="batchTiming")
	String batchTiming;
	@Column(name="startDate")
	String startDate;
	@Column(name="endDate")
	String endDate;
	@Column(name="dayPattern")
	String dayPattern;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getBatchTiming() {
		return batchTiming;
	}
	public void setBatchTiming(String batchTiming) {
		this.batchTiming = batchTiming;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDayPattern() {
		return dayPattern;
	}
	public void setDayPattern(String dayPattern) {
		this.dayPattern = dayPattern;
	}
	

}
