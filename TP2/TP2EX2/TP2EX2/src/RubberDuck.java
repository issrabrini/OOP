public class RubberDuck extends Duck implements Quackable{

    @Override
    void display() {
        System.out.println("RubberDuck display");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck quack");;
    }
}
