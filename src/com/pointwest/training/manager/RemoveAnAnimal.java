package com.pointwest.training.manager;

import java.util.List;

import com.pointwest.training.bean.Animal;

public class RemoveAnAnimal {
	ViewAllAnimals viewAllAnimals = new ViewAllAnimals();

	public boolean remove(List<Animal> listOfAnimals, int refId) {
		boolean isFound = false;
		if (!listOfAnimals.isEmpty()) {
			for (Animal animal : listOfAnimals) {
				if (animal.getNewRefId() == refId) {
					listOfAnimals.remove(animal);
					System.out.println(animal.getNewRefId() + ": " + animal.getName() + " has been removed.");
					isFound = true;
					break;
				} else {
					System.out.println("Reference ID is not found.");
					break;
				}
			}
			viewAllAnimals.viewAnimals(listOfAnimals);
		} else {
			System.out.println("The shelter has no animals.");
			isFound = false;
		}

		return isFound;
	}
}
