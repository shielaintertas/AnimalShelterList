package com.pointwest.training.bean;

import com.pointwest.training.main.AnimalAppMain;

public abstract class Animal extends AnimalAppMain {
	private String name;
	private String age;
	protected String gender;
	public static int referenceId = 1000;
	protected int newRefId;
	protected String sound;
	private int numOfAnimals;

	public int getNewRefId() {
		return newRefId;
	}

	public void setNewRefId(int newRefId) {
		this.newRefId = newRefId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(int referenceId) {
		Animal.referenceId = referenceId;
	}

	public int getNumOfAnimals() {
		return numOfAnimals;
	}

	public void setNumOfAnimals(int numOfAnimals) {
		this.numOfAnimals = numOfAnimals;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
