package streamQuestions;

import java.time.LocalDate;
import java.util.Date;

public class Driver extends Person{
    public Driver(String name, Integer age, LocalDate dob){
        super(name, age, dob);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + "is driving a vehicle");
    }
}
