package craveAssignments.Abstraction;

// Abstract class and Abstract Method

public class AbstractDemo {

    public static void main(String [] args)
    {

        JhonsPhone obj = new RahulsPhone() {
        }; // cannot instantiate the abstract class, or we can not create object of abstract class
        obj.call();
        obj.dance();
        obj.move();
        obj.cook();

    }

}

abstract class JhonsPhone // Abstract Class
{
    public void call()
    {
        System.out.println("calling...");
    }

    public abstract void move();// Abstract Methods
    public abstract void dance();
    public abstract void cook();

}

abstract class VasantsPhone extends JhonsPhone // Abstract Class
{

    public void move()
    {
        System.out.println("moving...");
    }

}

 class RahulsPhone extends VasantsPhone // Concrete Class
{
    public void dance()
    {
        System.out.println("Dancing...");
    }
    public void cook()
    {
        System.out.println("Cooking..");
    }

}
