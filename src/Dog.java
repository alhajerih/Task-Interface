public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog (wofhing) anyway he is making sounds");
    }
}
