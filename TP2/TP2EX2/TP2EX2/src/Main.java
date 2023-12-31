// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String [] args)
    {
        Flyable1 fb = new Flyable1() ;
        Quackable1 qb= new Quackable1();
        Duck d= new MallarDuck(fb,qb);
        ((MallarDuck)d).fly();
        ((MallarDuck)d).quack();

    }
}

