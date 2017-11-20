package com.pointwest.traning.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.Animal;
import com.pointwest.training.manager.AddAnAnimal;
import com.pointwest.training.manager.RemoveAnAnimal;
import com.pointwest.training.manager.ViewAllAnimals;

public class AnimalUI {

	RemoveAnAnimal removeAnAnimal = new RemoveAnAnimal();
	ViewAllAnimals viewAllAnimals = new ViewAllAnimals();
	AddAnAnimal addAnAnimal = new AddAnAnimal();

	public String displayMenu() {
		String input;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Animal Shelter!");
		System.out.println("Select what you want to do:");
		System.out.println("[1] Add an animal");
		System.out.println("[2] Remove an animal");
		System.out.println("[3] View all animals");

		input = scanner.nextLine();

		return input;
	}

	public String displayMenuFull() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("Welcome to the Animal Shelter!");
		System.out.println("Select what you want to do:");
		System.out.println("[2] Remove an animal");
		System.out.println("[3] View all animals");

		input = scanner.nextLine();

		return input;
	}

	public String addAnimalMenu() {
		String typeOfAnimal;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal would you like to add?");
		System.out.println("[1] Dog");
		System.out.println("[2] Cat");
		System.out.println("[3] Parrot");

		typeOfAnimal = scanner.nextLine();

		return typeOfAnimal;
	}

	public void addAnimalDog(String name, String age, String gender, List<Animal> listOfAnimals) {
		addAnAnimal.addDog(name, age, gender, listOfAnimals);
	}

	public void addAnimalCat(String catName, String catAge, String catGender, List<Animal> listOfAnimals) {
		addAnAnimal.addCat(catName, catAge, catGender, listOfAnimals);
	}

	public void addAnimalParrot(String parrotName, String parrotAge, String parrotGender, List<Animal> listOfAnimals) {
		addAnAnimal.addParrot(parrotName, parrotAge, parrotGender, listOfAnimals);
	}

	public boolean removeAnAnimal(List<Animal> listOfAnimals, int refId) {
		boolean isRemoved = removeAnAnimal.remove(listOfAnimals, refId);
		return isRemoved;
	}

	public void viewAllAnimals(List<Animal> listOfAnimals) {
		viewAllAnimals.viewAnimals(listOfAnimals);
	}

}
