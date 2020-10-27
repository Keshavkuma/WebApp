package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
@Id
    @Column(name="trainerId")
	String trainerId ;
@Column(name="trainerName")
	String trainerName;
@Column(name="trainerDesc")
	String trainerDesc;
@Column(name="trainerQuali")
	String trainerQuali;
@Column(name="trainerCerti")
	String trainerCerti;

	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerDesc() {
		return trainerDesc;
	}
	public void setTrainerDesc(String trainerDesc) {
		this.trainerDesc = trainerDesc;
	}
	public String getTrainerQuali() {
		return trainerQuali;
	}
	public void setTrainerQuali(String trainerQuali) {
		this.trainerQuali = trainerQuali;
	}
	public String getTrainerCerti() {
		return trainerCerti;
	}
	public void setTrainerCerti(String trainerCerti) {
		this.trainerCerti = trainerCerti;
	}
}
