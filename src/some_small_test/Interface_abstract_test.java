package some_small_test;

public class Interface_abstract_test {
    public static void main(String[] args)
    {
        Object[] objects={new Tiger(),new Chicken(),new Apple()};
        for(int i=0;i<objects.length;i++)
        {
            if(objects[i] instanceof Eatable)
            {
                System.out.println(((Eatable)objects[i]).howToEat());
            }
            if(objects[i] instanceof Animal)
            {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}

interface Eatable
{
    public String howToEat();
}

abstract class Animal{
    public abstract String sound();
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple:make juice";
    }
}

abstract class Fruit implements Eatable {
}

class Chicken extends Animal implements Eatable {
    @Override
    public String howToEat()
    {
        return "Chicken:fry it";
    }

    @Override
    public String sound() {
        return "Chicken:llllll";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger:hhhh";
    }
}

