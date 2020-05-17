package inheritance;

public class Animal {
  private String name;
  private int brain;
  private int body;
  private double size;
  private double weight;

  public Animal(String name, int brain, int body, double size, double weight) {
    this.name = name;
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  public void eat() {
    System.out.println("Animal.eat()");
  }

  public void makeSound() {
    System.out.println("Animal.makeSound()");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBrain() {
    return this.brain;
  }

  public void setBrain(int brain) {
    this.brain = brain;
  }

  public int getBody() {
    return this.body;
  }

  public void setBody(int body) {
    this.body = body;
  }

  public double getSize() {
    return this.size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}