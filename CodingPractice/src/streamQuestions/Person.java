package streamQuestions;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private final String name;
    private final Integer age;
    private final LocalDate dob;

    public Person(String name, Integer age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    public String getName(){
        return name;
    }
    public void doSleep(){
        System.out.println(name +" is sleeping");
    }

    public void doEat(){
        System.out.println(name +" is eating");
    }
    public abstract void doWork();
}
