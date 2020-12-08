package Squirrel;

public class squirrel {

  int teethLength, age, weight, favouriteNumber;
  public squirrel (int teethLength, int age, int weight, int favouriteNumber) {
    this.teethLength = teethLength;
    this.age = age;
    this.weight = weight;
    this.favouriteNumber = favouriteNumber;
  }

  public void eatNut(){
    System.out.println("Squirrel is eating nuts");
  }

  public void runAway(){
    System.out.println("Squirrel is running away");
  }

  public void fight(){
    System.out.println("Squirrel is fighting to the death");
  }

}