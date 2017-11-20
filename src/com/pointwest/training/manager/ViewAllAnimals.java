package com.pointwest.training.manager;

import java.util.List;

import com.pointwest.training.bean.Animal;

public class ViewAllAnimals {

	public void viewAnimals(List<Animal> listOfAnimals) {
		if (listOfAnimals.isEmpty()) {
			System.out.println("There are no animals to be displayed.");
		} else {
			System.out.println("Meet my lovely animals:");
			for (Animal animal : listOfAnimals) {
				System.out.println(animal.getNewRefId() + ": " + animal.getSound() + " Hi! I'm " + animal.getName()
						+ ", " + animal.getAge() + " yrs old.");
			}

		}
	}
}
