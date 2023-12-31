public class MallarDuck extends Duck implements Quackable, Flyable
{
    Flyable fb;
    Quackable qb;

    public MallarDuck(Flyable fb, Quackable qb)
    {
        this.fb=fb;
        this.qb=qb;
    }
    @Override
    void display() {
        System.out.println("display MallarDuck");
    }

    @Override
    public void fly() {
        fb.fly();
    }

    @Override
    public void quack() {
        qb.quack();
    }
}
