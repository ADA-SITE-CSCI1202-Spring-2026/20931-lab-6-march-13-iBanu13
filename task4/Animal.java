package task4;

import java.util.Objects;

public class Animal{
    private String animalName;
    private String ownerName;
    private int age;

    public Animal (String animalName, String ownerName, int age){
        this.animalName = animalName;
        this.ownerName = ownerName;
        
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getAnimalName(){
        return animalName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getAge(){
        return age;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        return "Animal Name: " + animalName +
                ", Owner Name: " + ownerName +
                ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Animal other = (Animal) obj;

        return age == other.age &&
                animalName.equals(other.animalName) &&
                ownerName.equals(other.ownerName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(animalName, ownerName, age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed){
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    
    @Override
    public String toString() {
        return "Animal Type: Dog, " +
                super.toString() + ", Breed: " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Dog)) return false;

        if (!super.equals(obj)) return false;

        Dog other = (Dog) obj;
        return Objects.equals(breed, other.breed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}

