package Task5;

class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %s\nTail: %s", name, age, (tail ? "Have" : "Not Have"));

    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Vaska", 45, true);
        Animal animal2 = new Animal("Barsik", 5, false);
        System.out.println(animal1.toString());
        System.out.println();
        System.out.println(animal2.toString());
    }
}
