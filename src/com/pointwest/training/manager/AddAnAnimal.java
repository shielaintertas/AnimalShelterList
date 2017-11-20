package com.pointwest.training.manager;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.Animal;
import com.pointwest.training.bean.Cat;
import com.pointwest.training.bean.Dog;
import com.pointwest.training.bean.Parrot;

public class AddAnAnimal {
	ViewAllAnimals viewAllAnimals = new ViewAllAnimals();
	RemoveAnAnimal removeAnAnimal = new RemoveAnAnimal();

	Scanner input = new Scanner(System.in);

	public void addDog(String name, String age, String gender, List<Animal> listOfAnimals) {

		Dog dog = new Dog();
		dog.setName(name);
		dog.setAge(age);
		dog.setNewRefId(Animal.referenceId++);
		dog.setSound("arf arf arf...");
		listOfAnimals.add(dog);
		System.out.println("A dog has been added.");

	}

	public void addCat(String name, String age, String gender, List<Animal> listOfAnimals) {

		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setNewRefId(Animal.referenceId++);
		cat.setSound("meow meow meow...");
		listOfAnimals.add(cat);
		System.out.println("A cat has been added.");

	}

	public void addParrot(String name, String age, String gender, List<Animal> listOfAnimals) {

		Parrot parrot = new Parrot();
		parrot.setName(name);
		parrot.setAge(age);
		parrot.setNewRefId(Animal.referenceId++);
		parrot.setSound("watchu doin?");
		listOfAnimals.add(parrot);
		System.out.println("A parrot has been added.");

	}

}
