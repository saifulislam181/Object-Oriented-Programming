package lecture1;

abstract class Car {
    private int yearModel;
    private int reg_no;

    public int getYear()
    {
        return yearModel;
    }

    public int getReg_no() {
        return reg_no;
    }
    abstract void run_engine();
}

class Audi extends Car{
    @Override
    void run_engine() {
        System.out.println("Audi's engine work in 2 ways");
    }
}

class Lamborghini extends Car{
    @Override
    void run_engine() {
        System.out.println("Lamborghini's engine work in 5 ways");
    }
}
public class AbstractDemo {
}
