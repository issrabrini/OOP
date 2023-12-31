public class RedHeadDuck extends Duck implements Quackable,Flyable {


    @Override
    void display()
    {
        System.out.println("RedHeadDuck display");
    }

    @Override
    public void fly()
    {
        System.out.println("RedHeadDuck fly");
    }

    @Override
    public void quack()
    {

        System.out.println("RedHeadDuck quack");
    }
}
