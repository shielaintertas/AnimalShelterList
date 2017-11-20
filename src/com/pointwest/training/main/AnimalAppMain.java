package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.Animal;
import com.pointwest.traning.ui.AnimalUI;

public class AnimalAppMain {

	public static void main(String[] args) {
		AnimalUI animalUi = new AnimalUI();
		List<Animal> listOfAnimals = new ArrayList<Animal>();
		int maxAnimals = 3;
		boolean hasEnded = false;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String mainMenuInput = "";
		do {
			if (listOfAnimals.size() < maxAnimals) {
				mainMenuInput = animalUi.displayMenu();
			} else if (listOfAnimals.size() == maxAnimals) {
				System.out.println("The shelter is full. Would you like to continue? [Y/N]");
				String choice = input.nextLine();
				if (choice.equalsIgnoreCase("Y")) {
					mainMenuInput = animalUi.displayMenuFull();
				} else if (choice.equalsIgnoreCase("N")) {
					hasEnded = true;
					break;
				}

			}
			switch (mainMenuInput) {

			case "1": // add animal
				if (listOfAnimals.size() == maxAnimals) {
					System.out.println(
							"The shelter is now full. Please delete an animal in order to add another animal.");
					break;
				} else {
					String animalInput = animalUi.addAnimalMenu();
					switch (animalInput) {

					case "1":
						System.out.println("Please enter the name");
						String name = input.nextLine();

						System.out.println("Please enter the age");
						String age = input.nextLine();

						System.out.println("Please enter the gender");
						String gender = input.nextLine();

						animalUi.addAnimalDog(name, age, gender, listOfAnimals);

						break;

					case "2":
						System.out.println("Please enter the name");
						String catName = input.nextLine();

						System.out.println("Please enter the age");
						String catAge = input.nextLine();

						System.out.println("Please enter the gender");
						String catGender = input.nextLine();

						animalUi.addAnimalCat(catName, catAge, catGender, listOfAnimals);


						break;

					case "3":
						System.out.println("Please enter the name");
						String parrotName = input.nextLine();

						System.out.println("Please enter the age");
						String parrotAge = input.nextLine();

						System.out.println("Please enter the gender");
						String parrotGender = input.nextLine();

						animalUi.addAnimalParrot(parrotName, parrotAge, parrotGender, listOfAnimals);


						break;
					}
					break;
				}
			case "2": // remove an animal
				if (listOfAnimals.isEmpty()) {
					System.out.println("The shelter has no animals. Please add an animal.");
				} else {
					System.out.println("Please enter the reference id of the animal to be removed:");
					int refId = input.nextInt();
					boolean isRemoved = animalUi.removeAnAnimal(listOfAnimals, refId);
					if (isRemoved == true) {

					}
				}
				break;
			case "3": // view all animals
				if (listOfAnimals.isEmpty()) {
					System.out.println("The shelter has no animals. Please add an animal.");
				} else {
					animalUi.viewAllAnimals(listOfAnimals);
				}
			}
		} while (hasEnded == false);
		if (hasEnded == true) {
			System.out.println("Program now ends.");
		}

	}
}
