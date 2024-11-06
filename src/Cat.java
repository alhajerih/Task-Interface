public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println(" the little cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("the cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println(" Meow Meow!!!");
    }
}
